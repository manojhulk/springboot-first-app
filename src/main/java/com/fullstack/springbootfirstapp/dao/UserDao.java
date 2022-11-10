package com.fullstack.springbootfirstapp.dao;

import com.fullstack.springbootfirstapp.model.User;

public interface UserDao {
    User getById(String name);
}
