package com.hexin.techlonogy.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hexin.techlonogy.mapper.InvitationInfoMapper;
/**
 * @author 西南彭于晏
 *  @date 2021-4-14 21:52
 */
@Service
public class InvitationInfoService{

    @Resource
    private InvitationInfoMapper invitationInfoMapper;

}
