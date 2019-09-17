package com.example.demo.service.impl;

import com.example.demo.service.DemoService;
import org.springframework.stereotype.Component;

/**
 * Created by IBM on 2019/9/17.
 */
@Component
public class DemoFallback implements DemoService{
    @Override
    public String helloService(String name) {
        return "get error";
    }
}
