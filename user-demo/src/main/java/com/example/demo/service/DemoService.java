package com.example.demo.service;

import com.example.demo.service.impl.DemoFallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by IBM on 2019/9/16.
 */
@FeignClient(name="user-server",fallback=DemoFallback.class)
public interface DemoService {
    @RequestMapping(value="/user-service/serviceGet",method= RequestMethod.GET)
    String helloService(@RequestParam("name") String name);
}
