package com.offcn.service;

import com.offcn.dao.UserDao;
import com.offcn.pojo.Movie;
import com.offcn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Resource
    private MovieServiceFeign movieService;
   

    public User getUserById(Integer id){
        return userDao.getUser(id);
    }

    public Map<String,Object> buyMovie(Integer id){
        Map<String,Object> map = new HashMap();
        // 获取用户
        User user = this.getUserById(id);
        map.put("user",user);
        // 电影？
        Movie movie = movieService.getOne();
        map.put("movie",movie);
        return map;
    }
}
