package com.hexin.techlonogy.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hexin.techlonogy.mapper.ReceiverInfoMapper;
/**
 * @author 西南彭于晏
 *  @date 2021-4-14 21:53
 */
@Service
public class ReceiverInfoService{

    @Resource
    private ReceiverInfoMapper receiverInfoMapper;

}
