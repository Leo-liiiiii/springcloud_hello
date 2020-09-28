package com.offcn.dao;

import com.offcn.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public User getUser(Integer id){
        User user = new User(id,"张三");
        return user;
    }
}
