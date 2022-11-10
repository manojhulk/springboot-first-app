package com.fullstack.springbootfirstapp.dao.Impl;

import com.fullstack.springbootfirstapp.dao.UserDao;
import com.fullstack.springbootfirstapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {
    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public User getById(String name) {
        String sql = "select email,passwd from user where user_name=?";
        return getJdbcTemplate().queryForObject(sql, new Object[]{name}, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setName(name);
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("passwd"));
                return user;
            }
        });
    }
}