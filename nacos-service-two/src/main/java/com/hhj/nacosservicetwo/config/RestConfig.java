package com.hhj.nacosservicetwo.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author virtual
 * @Date 2022/5/1 14:39
 * @description：
 */
@Configuration
public class RestConfig {

    @LoadBalanced
    @Bean
    public RestTemplate restTemplateConfig(){
        return new RestTemplate();
    }
}
