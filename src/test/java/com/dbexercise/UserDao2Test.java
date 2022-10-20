package com.dbexercise;

import algorithm.week5.java1018.dbexercise.dao.AWSUserDaoImpl;
import algorithm.week5.java1018.dbexercise.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class UserDao2Test {

    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
       AWSUserDaoImpl userDao2 = new AWSUserDaoImpl();
        User user = new User("6", "aquaMan", "22");
       // userDao2.add(user);

        User selectedUser = userDao2.get("6");
        Assertions.assertEquals("aquaMan", selectedUser.getName());

    }
}