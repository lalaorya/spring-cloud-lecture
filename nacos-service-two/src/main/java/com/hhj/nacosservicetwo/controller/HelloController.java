package com.hhj.nacosservicetwo.controller;

import com.alibaba.cloud.nacos.NacosDiscoveryProperties;
import com.alibaba.cloud.nacos.discovery.NacosDiscoveryClient;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.client.config.NacosConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author virtual
 * @Date 2022/5/1 14:38
 * @description：调用另外一个微服务的方法
 */
@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    NacosDiscoveryProperties discoveryProperties;

    @GetMapping("/hello/{name}")
    public void invoke(@PathVariable("name")String name){



        // 获取所有服务下的所有实例
        List<String> services = discoveryClient.getServices();
        for (String s:services){
            List<ServiceInstance> instances = discoveryClient.getInstances(s);
            for (ServiceInstance instance:instances){
                // ServiceInstance对象可以获取实例的相关描述信息
                System.out.println("服务"+ s +"的实例：" + instance.toString());
            }

        }

        System.out.println(restTemplate.getForObject("http://nacos-service-one/hello/"+name,String.class));

    }
}
