package com.fullstack.springbootfirstapp.service.Impl;

import com.fullstack.springbootfirstapp.dao.UserDao;
import com.fullstack.springbootfirstapp.model.User;
import com.fullstack.springbootfirstapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public User getById(String name) {
        User user=userDao.getById(name);
        return user;
    }
}
