package com.offcn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author LiLe
 * @create 2020-09-22 17:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie implements Serializable {
    private Integer id;
    private String movieName;
}
