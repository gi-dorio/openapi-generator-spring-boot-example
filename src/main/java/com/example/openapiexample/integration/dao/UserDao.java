package com.example.openapiexample.integration.dao;

import java.util.List;

import org.openapitools.model.User;
import org.openapitools.model.UsersResponseGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.openapiexample.integration.mapper.UserMapper;

@Component
public class UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public UsersResponseGet getUser(){
        UsersResponseGet users = new UsersResponseGet();

        String sql = "select * from utenti;";

        List<User> userList = jdbcTemplate
        .query(sql, new UserMapper());

        users.setUsers(userList);

        return users;
    }
}
