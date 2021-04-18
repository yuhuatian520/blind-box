package com.hexin.techlonogy.controller.product;

import com.hexin.techlonogy.service.ProductInfoService;
import com.hexin.techlonogy.utils.json.JsonResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;

import static reactor.core.publisher.Mono.just;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductInfoService productInfoService;
    /**
     *  sign 1  显示幸运 2 显示火爆 3  显示分类商品   -1 随机几个
     * @return
     */
    @GetMapping("/viewproduct")
    public Mono<JsonResult> viewProductInfos(@RequestParam(required = false,defaultValue = "-1") int sign,@RequestParam(required = false,defaultValue = "0") int cid,@RequestParam(required = false,defaultValue = "1") Integer startPage,@RequestParam(required = false,defaultValue = "10") Integer pageSize){
        return just(productInfoService.viewProductInfos(sign,cid,startPage,pageSize));
    }



}
