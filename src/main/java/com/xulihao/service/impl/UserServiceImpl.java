package com.xulihao.service.impl;

import com.xulihao.dao.UserDao;
import com.xulihao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public void save() {
        userDao.save();
    }
}
