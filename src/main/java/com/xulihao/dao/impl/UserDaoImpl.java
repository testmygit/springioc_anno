package com.xulihao.dao.impl;

import com.xulihao.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("userdao is runing!....");
    }
}
