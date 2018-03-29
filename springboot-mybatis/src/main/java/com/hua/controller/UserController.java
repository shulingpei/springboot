package com.hua.controller;

import com.hua.pojo.User;
import com.hua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * Created by Administrator on 2018/3/26.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getAll")
    @ResponseBody
    public List<User> getAll(){
        return userService.getAll();
    }
}
