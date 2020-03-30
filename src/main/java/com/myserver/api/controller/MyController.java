package com.myserver.api.controller;

import com.myserver.api.model.User;
import com.myserver.api.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/")
    public String index(Model model){
        return "index";
    }

    @RequestMapping("/users")
    public ModelAndView showUsers(){
        List<User> users = userService.findAll();
        Map<String, Object> params = new HashMap<>();
        params.put("users", users);

        return new ModelAndView("showUsers", params);
    }
}
