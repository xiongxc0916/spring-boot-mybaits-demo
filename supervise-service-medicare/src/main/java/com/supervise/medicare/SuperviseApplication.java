package com.supervise.medicare;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by xc.xiong on 2017/8/31.
 */
@MapperScan(basePackages = "com.supervise.**.mapper", sqlSessionTemplateRef = "sqlSessionTemplate")
@ServletComponentScan(basePackages = {"com.supervise.**"})
@ComponentScan(basePackages = {"com.supervise", })
@EnableFeignClients(basePackages = "com.supervise.server.rpc")
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class SuperviseApplication extends SpringBootServletInitializer {


    private static final Logger LOGGER = LoggerFactory.getLogger(SuperviseApplication.class);


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        LOGGER.info("SpringApplicationBuilder configure .... ");
        return builder.sources(SuperviseApplication.class);
    }

    public static void main(String[] args) {
        LOGGER.info("SpringApplicationBuilder run .... ");
        SpringApplication.run(SuperviseApplication.class, args);
    }


}
