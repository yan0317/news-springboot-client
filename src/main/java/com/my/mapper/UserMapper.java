package com.my.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.my.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {


}





















//    User selectId(Long id);
//    @Select("select * from user")
//    List<User> selectAll();









//
//    @Select("select * from springboot_user where username=#{username} and password =#{password}")
//    User selectUser(User user);
//
//
//    @Insert("insert into springboot_user(username,password) values (#{username},#{password})")
//    int add(User user);
//
//
//    @Select("select * from springboot_user where username=#{username}")
//    User selectByUser(User user);