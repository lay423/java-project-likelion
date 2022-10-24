package com.hello.dao.review;

import com.hello.dao.*;
import com.hello.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao1 {
    private ConnectionMaker connectionMaker;

    public UserDao1(){
        connectionMaker = new AWSConnectionMaker();
    }

    public UserDao1(ConnectionMaker connectionMaker){
        this.connectionMaker = connectionMaker;
    }


    public void jdbcContextWithStatementStrategy(StatementStrategy stmt) {
        Connection c = null;
        PreparedStatement ps = null;

        try {
            c = connectionMaker.makeConnection();
            //ps = c.prepareStatement("DELETE FROM users");
            ps = stmt.makePreparedStatement(c);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (ps != null) {
                try{
                    ps.close();
                }catch (SQLException e){

                }
            }
            if (c != null) {
                try{
                    c.close();
                }catch (SQLException e){

                }
            }
        }
    }
    public void deleteAll() throws SQLException {
        jdbcContextWithStatementStrategy(new DeleteAllStrategy());
    }

    public void insert(User user) throws SQLException {
        jdbcContextWithStatementStrategy(new AddStrategy(user));
    }
}
