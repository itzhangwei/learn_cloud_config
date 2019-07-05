package com.learn.cloud.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zack.zhang
 * @projectName learn_cloud_config
 * @title HelloConfigController
 * @package com.learn.cloud.config.controller
 * @description 测试从配置中心获取的配置信息
 * @date 2019-07-03 10:38
 */
@RestController
@RefreshScope // 当配置中心配置文件修改后，接收到SpringCloud配置中心刷新的时候，自动将配置中心刷新到对应属性上
public class HelloConfigController {
    @Value(value = "${my.motto}")
    private String motto;

    @Value(value = "${public.motto}")
    private String publicMotto;

    @RequestMapping("/hello")
    public String hello(){
        return  "hello, my motto is :" +this.motto+"。\r\n public motto is：" +this.publicMotto;
    }
}
