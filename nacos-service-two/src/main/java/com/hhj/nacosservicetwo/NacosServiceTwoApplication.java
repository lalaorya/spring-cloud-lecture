package com.hhj.nacosservicetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务消费者
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosServiceTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosServiceTwoApplication.class, args);
    }

}
