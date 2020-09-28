package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient  //开启eureka的客户端
@EnableFeignClients     //开启feign客户端
@EnableCircuitBreaker   //开启短路保护
public class ConsumerUserFeignStart {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerUserFeignStart.class);
    }


}
