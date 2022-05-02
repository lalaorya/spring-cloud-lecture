package com.hhj.nacosserviceone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class NacosServiceOneApplication {

    public static void main(String[] args) {

        SpringApplication.run(NacosServiceOneApplication.class, args);


    }

}
