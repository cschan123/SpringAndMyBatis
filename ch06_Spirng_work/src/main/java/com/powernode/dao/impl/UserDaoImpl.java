package com.powernode.dao.impl;

import com.powernode.dao.UserDao;
import com.powernode.domain.SysUser;

public class UserDaoImpl implements UserDao {
    @Override
    public void insertUser(SysUser user) {
        System.out.println("执行了数据库insert操作");
    }
}
