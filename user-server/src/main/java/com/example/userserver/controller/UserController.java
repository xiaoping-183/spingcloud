package com.example.userserver.controller;

import com.example.userserver.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by IBM on 2019/9/16.
 */
@RestController
@RequestMapping("/user-service")
public class UserController {


    private void sleep(String methodName) {
        int sleepMinTime = new Random().nextInt(3000);
        try {
            Thread.sleep(sleepMinTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value="/serviceGet",method= RequestMethod.GET)
    public String helloService(@RequestParam String name) {
        sleep("get");
        return "HelloServiceImpl name :"+name;
    }

    @RequestMapping(value="/serviceHead", method=RequestMethod.HEAD)
    public String helloService(@RequestHeader String name,
                               @RequestHeader String password) {
        sleep("header");
        return "helloServiceHead name :"+name +" password:"+password;
    }

//    @RequestMapping(value="/servicePost", method=RequestMethod.POST)
//    public String helloService(@RequestBody UserDemo userDemo) {
//        sleep("post");
//        return userDemo.toString();
//    }

}
