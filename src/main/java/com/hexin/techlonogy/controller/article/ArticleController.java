package com.hexin.techlonogy.controller.article;

import com.hexin.techlonogy.service.ArticleInfoService;
import com.hexin.techlonogy.utils.json.JsonResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import static reactor.core.publisher.Mono.just;

@RestController
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleInfoService articleInfoService;

    /**
     * 显示导航标题
     * @return
     */
    @GetMapping("/articleinfo")
    public Mono<JsonResult> viewArticleInfos(){
        return just(articleInfoService.viewArticleInfos());
    }


}
