package com.example.userserver.service.impl;

import com.example.userserver.service.UserService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by IBM on 2019/9/16.
 */
@Component
public class UserServiceImpl implements UserService {

    public  String test(){
        return "user-service:张三";
    }

    @RequestMapping(value="/demo/{id}")
    @ResponseBody
    public  String demo(@PathVariable("id") long id){
        return "user-service:张三" +":"+id;
    }
}
