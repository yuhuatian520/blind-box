package com.hexin.techlonogy.utils;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.impl.WxMaServiceImpl;
import cn.binarywang.wx.miniapp.config.impl.WxMaDefaultConfigImpl;
import com.hexin.techlonogy.configaration.WeChatConfigration;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author 西南彭于晏
 * @date 2021-4-14 21:55
 */
@Component
@RequiredArgsConstructor
public class BeanUtils {
    private final WeChatConfigration weChatConfigration;
    public WxMaService getWxMaService() {
        WxMaDefaultConfigImpl config = new WxMaDefaultConfigImpl();
        config.setAppid(weChatConfigration.getAPP_ID());
        config.setSecret(weChatConfigration.getAPP_SECRETE());
        config.setMsgDataFormat("JSON");
        WxMaService wxMaService = new WxMaServiceImpl();
        wxMaService.setWxMaConfig(config);
        return wxMaService;
    }
}
