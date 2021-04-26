package com.w2x.springboot.controller;


import com.w2x.springboot.entity.User;
import com.w2x.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;

@Controller
public class DemoController {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public String getString() {
        return "hello springboot start";
    }

    @RequestMapping("/test1")
    @ResponseBody
    public String test1() {
        return "datasource" + dataSource;
    }

    @RequestMapping("/test2/{name}")
    @ResponseBody
    public void test2(@PathVariable String name) {
        User one = userService.findOne(name);
        System.out.println(one);
    }
}
