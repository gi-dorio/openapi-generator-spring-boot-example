package com.example.openapiexample.impl;

import java.util.ArrayList;
import java.util.List;

import org.openapitools.api.UsersApi;
import org.openapitools.model.User;
import org.openapitools.model.UsersResponseGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.openapiexample.integration.dao.UserDao;

@RestController
public class UsersApiImpl implements UsersApi{

    @Autowired
    UserDao userDao;

    @Override
    public  ResponseEntity<UsersResponseGet> usersGet(){
        UsersResponseGet users = userDao.getUser();


        return ResponseEntity.ok(users);
    }
}
