package com.qf.spring_boot_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController2 {
    @RequestMapping("test")
    public Object test(){
        return "ok2";
    }
}
