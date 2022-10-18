package com.dbexercise;

import com.dbexercise.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserDao2Test {

    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
        UserDao2 userDao2 = new UserDao2();
        User user = new User("5", "aquaMan", "22");
        userDao2.add(user);

        User selectedUser = userDao2.get("5");
        Assertions.assertEquals("aquaMan", selectedUser.getName());

    }
}