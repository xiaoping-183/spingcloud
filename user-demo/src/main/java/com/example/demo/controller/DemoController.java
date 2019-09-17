package com.example.demo.controller;

import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by IBM on 2019/9/16.
 */
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value="/test", method= RequestMethod.GET)
    public String demoServiceTest() {
        StringBuffer sb = new StringBuffer();
        sb.append(demoService.helloService("yuanyuan"));
        return sb.toString();

    }


}
