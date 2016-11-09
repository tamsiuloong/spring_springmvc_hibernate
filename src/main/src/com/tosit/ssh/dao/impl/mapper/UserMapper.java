package com.tosit.ssh.dao.impl.mapper;

import com.tosit.ssh.entity.User;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 佛祖保佑       永无BUG
 * Created by DELL on 2016/11/2.
 */
public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setName(resultSet.getString("name"));
        user.setId(resultSet.getInt("id"));
        return user;
    }
}
