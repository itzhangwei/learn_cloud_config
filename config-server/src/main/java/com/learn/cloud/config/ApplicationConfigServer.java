package com.learn.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author zack.zhang
 * @projectName learn_cloud_config
 * @title ApplicationConfigServer
 * @package com.learn.cloud.config
 * @description 配置中心服务
 * @date 2019-07-02 15:58
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ApplicationConfigServer {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfigServer.class, args);
    }
}
