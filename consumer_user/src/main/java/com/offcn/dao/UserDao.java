package com.offcn.dao;

import com.offcn.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @author LiLe
 * @create 2020-09-22 19:34
 */

@Repository
public class UserDao {

    public User getUser(Integer id){
        User user = new User(id,"张三");
        return user;
    }
}