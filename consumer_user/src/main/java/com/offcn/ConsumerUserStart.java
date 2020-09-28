package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient  //同@EnableEurekaClient功能一样 都是开启eureka客户端的注解
@EnableCircuitBreaker  // 开启短路保护功能
@EnableHystrixDashboard  //开启可视化监控功能
public class ConsumerUserStart {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerUserStart.class);
    }


    @Bean
    @LoadBalanced  //负载均衡
    public  RestTemplate getRestTemplate(){
         return  new RestTemplate();
    }


}
