package com.smartManage.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smartManage.model.User;
import com.smartManage.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by fan on 2018/10/21.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public String login() throws IOException {
        return "index";
    }

}
