package com.fish.controller;


import com.fish.pojo.User;
import com.fish.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    //测试
    //测试
    @RequestMapping("hello")
    @ResponseBody
    public User select(){
        System.out.println("laile");
        return userService.selectAll(1);
    }
}
