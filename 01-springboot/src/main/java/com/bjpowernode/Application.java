package com.bjpowernode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//spring的全局注解
public class Application {

    public static void main(String[] args) {
        //固定代理，启动spring程序，初始化spring容器
        SpringApplication.run(Application.class, args);
    }

}
