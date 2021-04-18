package com.hexin.techlonogy.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hexin.techlonogy.mapper.BillInfoMapper;
/**
 * @author 西南彭于晏
 *  @date 2021-4-14 21:51
 */
@Service
public class BillInfoService{

    @Resource
    private BillInfoMapper billInfoMapper;

}
