package com.supervise.api.gateway;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.supervise.**.mapper")
@ServletComponentScan(basePackages={"com.supervise"})
@ComponentScan(basePackages={"com.supervise"})
@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulProxy
public class SuperviseApiGatewayStarter {
    public static void main(String[] args) {
        SpringApplication.run(SuperviseApiGatewayStarter.class, args);
    }
}
