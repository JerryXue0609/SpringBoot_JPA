package com.Jerry.JPAdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jerry on 2017/11/6 0006.
 */
@RestController
public class HelloWorld {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello world aaa";
    }
}
