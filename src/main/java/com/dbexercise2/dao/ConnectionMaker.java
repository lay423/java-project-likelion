package com.dbexercise2.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {
    Connection makeConnection() throws SQLException;
}