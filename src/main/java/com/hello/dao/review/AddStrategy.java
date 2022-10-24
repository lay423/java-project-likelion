package com.hello.dao.review;

import com.hello.dao.StatementStrategy;
import com.hello.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddStrategy implements StatementStrategy {

    private User user;

    public AddStrategy(User user) {
        this.user = user;
    }

    @Override
    public PreparedStatement makePreparedStatement(Connection connection) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(
                "INSERT INTO users(id, name, password) VALUES(?, ?, ?)");
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());
        return ps;
    }
}
