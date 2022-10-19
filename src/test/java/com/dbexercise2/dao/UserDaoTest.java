package com.dbexercise2.dao;

import com.dbexercise2.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @Test
    @DisplayName("insert와 select가 잘 작동되는지 test")
    public void insertAndSelect() throws SQLException {

        //UserDao userDao = new UserDao();
        UserDao userDao = new UserDaoFactory().awsUserDao();
        User user = new User("10", "king", "1123");
        userDao.insert(user);

        User selectUser = userDao.select("10");
        Assertions.assertEquals("king", selectUser.getName());
    }
}