package com.hexin.techlonogy.service;

import com.github.pagehelper.PageHelper;
import com.hexin.techlonogy.entity.ProductCates;
import com.hexin.techlonogy.entity.ProductInfo;
import com.hexin.techlonogy.mapper.ProductCatesMapper;
import com.hexin.techlonogy.utils.json.JsonResult;
import com.hexin.techlonogy.vo.noticeinfovo.productvo.ProductCatesVo;
import com.hexin.techlonogy.vo.noticeinfovo.productvo.ProductInfoVo;
import lombok.val;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.hexin.techlonogy.mapper.ProductInfoMapper;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.github.pagehelper.page.PageMethod.startPage;
import static com.hexin.techlonogy.utils.json.JsonResult.ok;
import static java.util.Comparator.comparing;
import static java.util.List.of;
import static java.util.stream.Collectors.toList;
import static org.springframework.beans.BeanUtils.copyProperties;

/**
 * @author 西南彭于晏
 * @date 2021-4-14 21:52
 */
@Service
public class ProductInfoService {

    @Resource
    private ProductInfoMapper productInfoMapper;
    @Resource
    private ProductCatesMapper productCatesMapper;

    public JsonResult viewProductInfos(int sign,int cid,Integer startPage, Integer pageSize) {
         val productInfo = ProductInfo.builder().build();
        productInfo.setType((short)sign);
        startPage(startPage,pageSize,"sort asc");
        return switch (sign) {
            case 3->viewProduct();
            case 4->viewProductInfosJ(productInfo,-1,cid);
            default ->viewProductInfosJ(productInfo,sign,0);
        };
    }

    private JsonResult viewProductInfosJ(ProductInfo productInfo,int sign,int cid) {
        if (sign<0){
            productInfo.setType(null);
        }
        productInfo.setStatus((short)1);
        var temBom=false;
        if (cid>0){
            productInfo.setCid((long)cid);
            temBom=true;
        }
        var productInfos = productInfoMapper.select(productInfo).stream().parallel().sorted(comparing(ProductInfo::getSort)).collect(toList());
        if (temBom){
          return ok(productInfos);
        }

        if (sign<0){
            return ok(productInfos.stream().map(ProductInfo::getId).map(s->{
                return viewProductInfos(s);
            }).collect(toList()));
        }
        return ok(productInfos.stream().parallel().filter(t->t.getType()==sign).map(ProductInfo::getId).map(s->{
            return viewProductInfos(s);
        }).collect(toList()));
    }

    private JsonResult viewProduct(){
            return ok(productCatesMapper.select(ProductCates.builder().status(true).build()).stream().parallel().sorted(comparing(ProductCates::getSort)).map(s->{
                val productCatesVo = ProductCatesVo.builder().build();
                copyProperties(s,productCatesVo);
                return productCatesVo;
            }).collect(toList()));
    }

    private ProductInfoVo viewProductInfos(long id){
         val productInfo = productInfoMapper.selectByPrimaryKey(id);
        val productInfoVo = ProductInfoVo.builder().build();
        copyProperties(productInfo,productInfoVo);
        return productInfoVo;
    }



}

