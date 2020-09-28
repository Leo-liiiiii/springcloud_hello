package com.offcn.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.offcn.dao.UserDao;
import com.offcn.pojo.Movie;
import com.offcn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LiLe
 * @create 2020-09-22 19:35
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RestTemplate restTemplate;

    public User getUserById(Integer id){
        return userDao.getUser(id);
    }


    @HystrixCommand(fallbackMethod = "buyMovieFallbackMethod")  //熔断器的方法
    public Map<String,Object> buyMovie(Integer id){
        Map<String,Object> map = new HashMap();
        // 获取用户
        User user = this.getUserById(id);
        map.put("user",user);
        // 电影？
        Movie movie = restTemplate.getForObject("http://PROVIDERMOVIE/movie", Movie.class);
        map.put("movie",movie);
        return map;
    }


    public Map<String,Object> buyMovieFallbackMethod(Integer id){
        Map<String,Object> map = new HashMap();
        // 获取用户
        User user = this.getUserById(id);
        map.put("user",user);
        // 电影？
        Movie movie = new Movie(-1,"电影不存在");
        map.put("movie",movie);
        return map;


    }


}
