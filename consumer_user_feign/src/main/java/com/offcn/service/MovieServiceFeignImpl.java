package com.offcn.service;

import com.offcn.pojo.Movie;
import org.springframework.stereotype.Component;

@Component
public class MovieServiceFeignImpl implements MovieServiceFeign{

    @Override
    public Movie getOne() {

        return new Movie(-1,"找不到电影");
    }
}
