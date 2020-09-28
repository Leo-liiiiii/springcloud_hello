package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author LiLe
 * @create 2020-09-22 16:57
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerStart {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerStart.class);
    }
}
