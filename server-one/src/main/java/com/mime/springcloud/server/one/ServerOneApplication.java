package com.mime.springcloud.server.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author SlumDuck
 * @create 2018-04-19 17:25
 * @desc 微服务一
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServerOneApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerOneApplication.class,args);
    }
}
