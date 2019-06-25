package com.itwen.itoken.service.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ProjectName: itoken
 * @Package: com.itwen.itoken.service.redis
 * @ClassName: RedisApplication
 * @Author: Bowen
 * @Description: RedisApplication
 * @Date: 2019/6/25 21:00
 * @Version: 1.0.0
 */

@EnableEurekaClient
@SpringBootApplication
public class RedisApplication {
    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);
    }
}
