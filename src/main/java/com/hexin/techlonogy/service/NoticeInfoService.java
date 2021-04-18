package com.hexin.techlonogy.service;

import com.hexin.techlonogy.entity.NoticeInfo;
import com.hexin.techlonogy.utils.json.JsonResult;
import com.hexin.techlonogy.vo.noticeinfovo.NoticeInfoVo;
import lombok.val;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hexin.techlonogy.mapper.NoticeInfoMapper;

import java.util.stream.Collectors;

import static com.hexin.techlonogy.utils.json.JsonResult.ok;
import static java.util.stream.Collectors.toList;
import static org.springframework.beans.BeanUtils.copyProperties;

/**
 * @author 西南彭于晏
 * @date 2021-4-14 21:52
 */
@Service
public class NoticeInfoService {

    @Resource
    private NoticeInfoMapper noticeInfoMapper;

    public JsonResult viewNoticeInfos() {
        return ok(noticeInfoMapper.select(NoticeInfo.builder().status((short) 1).build()).stream().parallel().map(type -> {
            val noticeInfoVo = NoticeInfoVo.builder().build();
            copyProperties(type, noticeInfoVo);
            return noticeInfoVo;
        }).collect(toList()));
    }


}






