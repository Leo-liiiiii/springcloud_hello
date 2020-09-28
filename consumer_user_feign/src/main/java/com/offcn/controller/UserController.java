package com.offcn.controller;

import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User user = userService.getUserById(id);
        return user;
    }

    @RequestMapping("/buyMovie")
    public Map<String,Object> buyMovie(@RequestParam("id") Integer id){
        Map<String, Object> map = userService.buyMovie(id);
        return map;
    }
}
