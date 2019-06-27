package com.qf.controller;

import com.qf.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    //批量读取yml文件中的属性
    @Autowired
    User user;
    //单值读取
    @Value("${comx.cname}")
    String cname;
    @RequestMapping("mytest")
    public Object test(){
        System.out.println("测试程序。。。。。");
        System.out.println(user);
        System.out.println(cname);
        return "ok";
    }
}
