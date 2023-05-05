package com.my.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.my.pojo.User;

import java.util.Map;

public interface UserService extends IService<User> {
    boolean selectUser(User user);
    boolean add(User user);
    boolean selectByUser(User user);
}
