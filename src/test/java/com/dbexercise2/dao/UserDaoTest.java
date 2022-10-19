package com.dbexercise2.dao;

import com.dao.UserDao;
import com.dao.UserDaoFactory;
import com.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {

    @Autowired
    ApplicationContext context;

    @Test
    @DisplayName("insert와 select가 잘 작동되는지 test")
    public void insertAndSelect() throws SQLException {

        //UserDao userDao = new UserDao();
        UserDao userDao = context.getBean("awsUserDao", UserDao.class);
        User user = new User("12", "king1", "11223");
        userDao.insert(user);

        User selectUser = userDao.select("12");
        Assertions.assertEquals("king1", selectUser.getName());
    }
}