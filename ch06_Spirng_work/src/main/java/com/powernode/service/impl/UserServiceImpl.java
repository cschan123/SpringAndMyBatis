package com.powernode.service.impl;

import com.powernode.dao.UserDao;
import com.powernode.domain.SysUser;
import com.powernode.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = null;
    @Override
    public void addUser(SysUser user) {

        userDao.insertUser(user);
    }
}
