package com.offcn.service;

import com.offcn.pojo.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "PROVIDERMOVIE",fallback = MovieServiceFeignImpl.class)
public interface MovieServiceFeign {

    @GetMapping("/movie")
    public Movie getOne();

}
