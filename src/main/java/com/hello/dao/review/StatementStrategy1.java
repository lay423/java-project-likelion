package com.hello.dao.review;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface StatementStrategy1 {
    public PreparedStatement makePreparedStatement(Connection connection) throws SQLException;
}
