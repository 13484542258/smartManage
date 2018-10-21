package com.smartManage.dao;

import com.smartManage.model.User;

/**
 * Created by fan on 2018/10/21.
 */
public interface UserDao {
    User selectUser(long id);
}
