package com.fish.service.Impl;


import com.fish.mapper.UserMapper;
import com.fish.pojo.User;
import com.fish.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @create 2019-09-18  19:25
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper user;

    public User selectAll(Integer id){
        return user.selectByPrimaryKey(id);
    }
}
