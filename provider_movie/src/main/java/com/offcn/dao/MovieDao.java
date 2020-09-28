package com.offcn.dao;

import com.offcn.pojo.Movie;
import org.springframework.stereotype.Repository;

/**
 * @author LiLe
 * @create 2020-09-22 17:16
 */

@Repository
public class MovieDao {

    public Movie getOne() {
        Movie movie = new Movie();
        movie.setId(1);
        movie.setMovieName("战狼");
        return movie;
    }
}
