package com.hexin.techlonogy.configaration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author 西南彭于晏
 * @date 2021-4-14 21:57
 */
@Data
@Configuration
public class WeChatConfigration {
    @Value("${APP_ID}")
    private String APP_ID;
    @Value("${APP_SECRETE}")
    String APP_SECRETE;
    @Value("${APP_MCHID}")
    String APP_MCHID;
    @Value("${APP_MCHKEY}")
    String APP_MCHKEY;
    @Value("${NOTIFY_URL}")
    String NOTIFY_URL;
    @Value("${IPADDRESS}")
    String IPADDRESS;
    @Value("${KEYPATH}")
    String keyPath;


}
