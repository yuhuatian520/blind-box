package com.hexin.techlonogy.listenconfig;

import com.hexin.techlonogy.entity.InvitationInfo;
import com.hexin.techlonogy.entity.RewardInfo;
import com.hexin.techlonogy.entity.UserProfitLog;
import com.hexin.techlonogy.mapper.InvitationInfoMapper;
import com.hexin.techlonogy.mapper.RewardInfoMapper;
import com.hexin.techlonogy.mapper.UserInfoMapper;
import com.hexin.techlonogy.mapper.UserProfitLogMapper;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;

import static com.alibaba.fastjson.JSON.parseObject;
import static java.math.RoundingMode.HALF_UP;
import static org.apache.commons.lang3.ObjectUtils.isEmpty;
import static org.apache.commons.lang3.ObjectUtils.isNotEmpty;

/**
 * @author Administrator
 */
@RequiredArgsConstructor
@Component
public class UserPayEventLisitens implements ApplicationListener<UserPayEvent> {

    private final InvitationInfoMapper invitationInfoMapper;
    private final UserInfoMapper userInfoMapper;
    private final RewardInfoMapper rewardInfoMapper;
    private final UserProfitLogMapper userProfitLogMapper;

    @Override
    public void onApplicationEvent(UserPayEvent userPayEvent) {
        var message = userPayEvent.getMessage();
        Map map = parseObject(message, Map.class);
        var openId1 = map.get("openId");
        var money1 = map.get("money");
        val invitationInfo = invitationInfoMapper.selectOne(InvitationInfo.builder().invId(String.valueOf(openId1)).status((short) 1).build());
          if (!isEmpty(invitationInfo)){
              var openId = invitationInfo.getOpenId();
              var invitationInfos = invitationInfoMapper.select(InvitationInfo.builder().invId(openId).status((short) 1).build());
              if (!CollectionUtils.isEmpty(invitationInfos)){
                  var size = invitationInfos.size();
                  val rewardInfo = rewardInfoMapper.selectOne(RewardInfo.builder().status((short) 1).build());
                  if (size>=rewardInfo.getCount()){
                      var money = rewardInfo.getMoney();
                      var v = BigDecimal.valueOf(Double.parseDouble(String.valueOf(money1))).multiply(BigDecimal.valueOf(money)).setScale(2, HALF_UP).doubleValue();
                       val userInfo = userInfoMapper.selectByPrimaryKey(openId);
                       if (isNotEmpty(userInfo)){
                           var balance = userInfo.getBalance();
                           userInfo.setBalance(BigDecimal.valueOf(balance).add(BigDecimal.valueOf(v)).setScale(2,HALF_UP).doubleValue());
                           var i = userInfoMapper.updateByPrimaryKeySelective(userInfo);
                           if (i>0){
                               userProfitLogMapper.insertSelective(UserProfitLog.builder().userId(String.valueOf(openId1)).openId(openId).money(v).time(String.valueOf(LocalDateTime.now())).build());
                           }
                       }
                  }
              }

          }
    }
}
