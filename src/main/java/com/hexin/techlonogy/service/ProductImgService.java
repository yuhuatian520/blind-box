package com.hexin.techlonogy.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hexin.techlonogy.mapper.ProductImgMapper;
@Service
public class ProductImgService{

    @Resource
    private ProductImgMapper productImgMapper;

}
