package com.hua.service;


import com.hua.mapper.UserMapper;
import com.hua.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/3/26.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMpper;

    @Override
    public List<User> getAll() {
        return userMpper.getAll();
    }
}
