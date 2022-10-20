package com.dbexercise2.dao;

import com.dao.UserDao;
import com.dao.UserDaoFactory;
import com.domain.User;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {

    @Autowired
    ApplicationContext context;

    @BeforeEach
    void setUp() throws SQLException {
        UserDao userDao = context.getBean("awsUserDao", UserDao.class);
        userDao.deleteAll();
    }

    @AfterEach
    void delete() throws SQLException {
    }

    @Test
    @DisplayName("insert와 select가 잘 작동되는지 test")
    public void insertAndSelect() throws SQLException {
        User user = new User("1", "kingsMan", "11223");

        UserDao userDao = context.getBean("awsUserDao", UserDao.class);
        userDao.deleteAll();
        assertEquals(0, userDao.getCount());

        userDao.insert(user);
        assertEquals(1, userDao.getCount());
        User selectUser = userDao.select("1");

        assertEquals(user.getName(), selectUser.getName());
        assertEquals(user.getPassword(), selectUser.getPassword());

    }
    @Test
    @DisplayName("getCount() 테스트")
    public void count() throws SQLException {
        UserDao userDao = context.getBean("awsUserDao", UserDao.class);
        User user = new User("1", "king1", "11223");
        User user1 = new User("2", "king2", "11223");
        User user2 = new User("3", "king3", "11223");

        userDao.deleteAll();
        assertEquals(0, userDao.getCount());
        userDao.insert(user);
        assertEquals(1, userDao.getCount());
        userDao.insert(user1);
        assertEquals(2, userDao.getCount());
        userDao.insert(user2);
        assertEquals(3, userDao.getCount());
    }
}