package com.dbexercise2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class LocalConnectionMaker implements ConnectionMaker{
    @Override
    public Connection makeConnection() throws SQLException {
        Map<String, String> env = System.getenv();
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306",
                "root", "pswd");
        return conn;
    }
}
