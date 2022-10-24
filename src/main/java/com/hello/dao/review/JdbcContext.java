package com.hello.dao.review;

import com.hello.dao.StatementStrategy;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcContext {
    private DataSource dataSource;


    public JdbcContext(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void executeSql(String sql) {
        this.workWithStatementStrategy(new StatementStrategy() {
            @Override
            public PreparedStatement makePreparedStatement(Connection connection) throws SQLException {
                PreparedStatement stmt = connection.prepareStatement(sql);
                return stmt;
            }
        });
    }


    public void workWithStatementStrategy(StatementStrategy stmt) {
        Connection c = null;
        PreparedStatement ps = null;

        try {
            c = dataSource.getConnection();
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
}
