package com.hexin.techlonogy.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hexin.techlonogy.mapper.ContentInfoMapper;

@Service
public class ContentInfoService {

    @Resource
    private ContentInfoMapper contentInfoMapper;

}

