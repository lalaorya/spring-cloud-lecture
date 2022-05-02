package com.hhj.nacosserviceone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author virtual
 * @Date 2022/5/1 14:30
 * @description：
 */
@RestController
@RefreshScope
public class HelloController {

    @Value(value = "className")
    String className;

    @Value(value = "major")
    String major;

    @Value("${name}")
    String name;

    @Value("${age}")
    int age;

    @Value("${datasource.type}")
    String dataSource;

    @GetMapping(value = "/hello/{name}")
    public String hello(@PathVariable("name")String name){
        System.out.println("我被调用了");
        return "Hello" + name;
    }


    @GetMapping(value = "/configTest")
    public String config(){
        return  name + age + dataSource;
    }


}
