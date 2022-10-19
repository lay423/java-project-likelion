package com.dbexercise2.dao;

import com.dao.UserDao;
import com.dao.UserDaoFactory;
import com.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class UserDaoTest {

    @Test
    @DisplayName("insert와 select가 잘 작동되는지 test")
    public void insertAndSelect() throws SQLException {

        //UserDao userDao = new UserDao();
        UserDao userDao = new UserDaoFactory().awsUserDao();
        User user = new User("11", "king1", "11223");
        userDao.insert(user);

        User selectUser = userDao.select("11");
        Assertions.assertEquals("king", selectUser.getName());
    }
}