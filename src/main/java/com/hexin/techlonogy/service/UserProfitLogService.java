package com.hexin.techlonogy.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hexin.techlonogy.mapper.UserProfitLogMapper;
@Service
public class UserProfitLogService{

    @Resource
    private UserProfitLogMapper userProfitLogMapper;

}
