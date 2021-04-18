package com.hexin.techlonogy.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

/**
 * @author 西南彭于晏
 * @date 2021-4-14 22:03
 */
@Data
public class LoginRequestDto {
    /**
     * 用户登录凭证
     */
    @NotEmpty(message = "code不能为空")
    String code;

    /**
     原始数据字符串
     */
    //@NotBlank(message = "signature不能为空")
    String signature;

    /**
     * 校验用户信息字符串
     */
    //@NotBlank(message = "rawData不能为空")
    String rawData;

    /**
     * 加密用户数据
     */
    @NotBlank(message = "encryptedData不能为空")
    String encryptedData;

    /**
     * 加密算法的初始向量
     */
    @NotBlank(message = "iv不能为空")
    String iv;
    @NotBlank(message = "sessionKey不能为空")
    String sessionKey;
    String openId;
}
