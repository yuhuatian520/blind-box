package com.hexin.techlonogy.controller.notice;

import com.hexin.techlonogy.service.NoticeInfoService;
import com.hexin.techlonogy.utils.json.JsonResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import static reactor.core.publisher.Mono.just;

@RequiredArgsConstructor
@RestController
public class NoticeController {

    private final NoticeInfoService noticeInfoService;
    /**
     * 显示公告的信息
     * @return
     */
    @GetMapping("/viewnotice")
    public Mono<JsonResult> viewNoticeInfos(){
        return just(noticeInfoService.viewNoticeInfos());
    }



}
