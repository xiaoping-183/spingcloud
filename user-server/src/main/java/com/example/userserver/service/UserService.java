package com.example.userserver.service;

import com.netflix.ribbon.proxy.annotation.Http;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by IBM on 2019/9/16.
 */
@FeignClient("userService")
public interface UserService {

    public  String test();

    @RequestMapping(value="/demo/{id}")
    @ResponseBody
    public  String demo(@PathVariable("id") long id);
}
