package com.my.mapper;

import com.my.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

/*    @Test
    void selectId() {
        User user = userMapper.selectId(1L);
        System.out.println(user);
    }

    @Test
    void selectAll(){
        List<User> select =userMapper.selectAll();
        select.forEach(System.out::println);
    }*/


}