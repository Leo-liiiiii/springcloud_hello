package com.offcn.service;

import com.offcn.dao.MovieDao;
import com.offcn.pojo.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author LiLe
 * @create 2020-09-22 17:18
 */
@Service
public class MovieService {
    @Autowired
    private MovieDao movieDao;

    @Value("${server.port}")
    private  String port;

    public Movie getOne() {
        System.out.println("当前调用的提供者是:"+port);
        return movieDao.getOne();
    }

}
