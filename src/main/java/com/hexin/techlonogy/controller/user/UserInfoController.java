package com.hexin.techlonogy.controller.user;

import com.hexin.techlonogy.dto.LoginRequestDto;
import com.hexin.techlonogy.service.UserInfoService;
import com.hexin.techlonogy.utils.json.JsonResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import static reactor.core.publisher.Mono.just;

/**
 * @author 西南彭于晏
 * @date 2021-4-14 21:37
 */
@RestController
@RequiredArgsConstructor
public class UserInfoController {

    private final UserInfoService userInfoService;

    @PostMapping("/wxlogin")
    public Mono<JsonResult> wxLogin(@RequestBody LoginRequestDto request){
        return just(userInfoService.wxLogin(request));
    }





}
