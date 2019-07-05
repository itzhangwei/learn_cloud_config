package com.learn.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zack.zhang
 * @projectName learn_cloud_config
 * @title ApplicationConfigClient
 * @package com.learn.cloud.config
 * @description 配置中心客户端，从配置中心获取数据
 * @date 2019-07-03 10:35
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationConfigClientOne {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfigClientOne.class, args);
    }
}
