package com.example.openapiexample.integration.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.openapitools.model.User;
import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User>{

    public User mapRow(ResultSet rs, int rowNum) throws SQLException{
        User user = new User();
        user.setUsername(rs.getString("username"));
        return user;
    }

}
