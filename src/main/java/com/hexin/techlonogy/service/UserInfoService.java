package com.hexin.techlonogy.service;

import com.hexin.techlonogy.dto.LoginRequestDto;
import com.hexin.techlonogy.entity.UserInfo;
import com.hexin.techlonogy.exception.MyExceptionInfo;
import com.hexin.techlonogy.utils.BeanUtils;
import com.hexin.techlonogy.utils.json.JsonResult;
import lombok.RequiredArgsConstructor;
import lombok.val;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hexin.techlonogy.mapper.UserInfoMapper;

import java.util.Objects;

import static com.hexin.techlonogy.utils.json.JsonResult.errorMap;
import static com.hexin.techlonogy.utils.json.JsonResult.ok;
import static java.lang.Short.valueOf;
import static java.util.Objects.isNull;
import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.springframework.beans.BeanUtils.copyProperties;
import static reactor.core.publisher.Mono.just;

/**
 * @author 西南彭于晏
 *  @date 2021-4-14 21:53
 */
@Service
@RequiredArgsConstructor
public class UserInfoService{

    private final UserInfoMapper userInfoMapper;
    private final BeanUtils beanUtils;

    public JsonResult wxLogin(LoginRequestDto request)  {
        try{
         val wxService = beanUtils.getWxMaService();
        // 获取微信用户session
        val session = wxService.getUserService().getSessionInfo(request.getCode());
        if (null == session) {
            throw new RuntimeException("login handler error");
        }
        // 解密用户信息
        val wxUserInfo = wxService.getUserService().getUserInfo(session.getSessionKey(),
                request.getEncryptedData(), request.getIv());
        if (null == wxUserInfo) {
            throw new RuntimeException("wxUser not exist");
        }
        var openId = wxUserInfo.getOpenId();
        val userInfo1 = userInfoMapper.selectByPrimaryKey(openId);
        if (!isNull(userInfo1)){
            copyProperties(wxUserInfo,userInfo1);
           return userInfoMapper.updateByPrimaryKeySelective(userInfo1)>0? ok("登录成功"):errorMap("登录失败");
        }else{
             val userInfo = UserInfo.builder().build();
             copyProperties(wxUserInfo,userInfo);
            return userInfoMapper.insertSelective(userInfo)>0?ok(wxUserInfo.getOpenId()):errorMap("登录失败");
        }
    }catch (Exception e){
        throw new MyExceptionInfo(40163,"code been used");
    }
    }
}
