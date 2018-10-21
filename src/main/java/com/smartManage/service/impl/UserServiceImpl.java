package com.smartManage.service.impl;

import com.smartManage.dao.UserDao;
import com.smartManage.model.User;
import com.smartManage.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by fan on 2018/10/21.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;
    @Override
    public User selectUser(long userId) {

        return this.userDao.selectUser(userId);
    }
}
