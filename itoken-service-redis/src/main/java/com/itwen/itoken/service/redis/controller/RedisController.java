package com.itwen.itoken.service.redis.controller;

import com.itwen.itoken.service.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    private static final String RESULT_OK = "ok";

    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "put", method = RequestMethod.GET)
    public String set(String key, String value, long seconds) {
        redisService.set(key, value, seconds);
        return "OK";
    }

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public String get(String key) {
        Object obj = redisService.get(key);
        if (obj != null) {
            String json = String.valueOf(obj);
            return json;
        }

        return "not_ok";
    }
}