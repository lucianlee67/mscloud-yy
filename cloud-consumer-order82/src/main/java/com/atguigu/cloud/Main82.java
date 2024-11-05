package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther zzyy
 * @create 2023-11-04 15:19
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Main82
{
    public static void main(String[] args)
    {
        SpringApplication.run(Main82.class,args);
    }
}
