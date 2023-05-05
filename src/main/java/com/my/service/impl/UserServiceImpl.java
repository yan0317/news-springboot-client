package com.my.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.my.mapper.UserMapper;
import com.my.pojo.User;
import com.my.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;
    public boolean selectUser(User user) {
        Map<String, Object> map = new HashMap<>();
        map.put("username", user.getUsername());
        map.put("password", user.getPassword());
        List<User> list = userMapper.selectByMap(map);
        if (list.size()==0)
            return false;
        return true;
    }

    @Override
    public boolean add(User user) {
        int i = userMapper.insert(user);
        if (i > 0) {
            return true;
        }
        return false;
    }

    //防止用户名重复
    public boolean selectByUser(User user) {
        Map<String, Object> map = new HashMap<>();
        map.put("username", user.getUsername());
        List<User> list = userMapper.selectByMap(map);
        if (list.size() == 0) {
            return true;
        }
        return false;
    }

}
