package com.hello.dao;

import com.hello.domain.User;
import org.springframework.dao.EmptyResultDataAccessException;

import java.sql.*;
import java.util.Map;


public class UserDao {

    private ConnectionMaker connectionMaker;

    public UserDao(){
        connectionMaker = new AWSConnectionMaker();
    }

    public UserDao(ConnectionMaker connectionMaker){
        this.connectionMaker = connectionMaker;
    }

    private Connection makeConnection() throws SQLException {
        Map<String, String> env = System.getenv();
        Connection conn = DriverManager.getConnection(env.get("DB_HOST"), env.get("DB_USER"), env.get("DB_PASSWORD"));  //db 연결
        return conn;
    }

    public void jdbcContextWithStatementStrategy(StatementStrategy stmt) {
        Connection c = null;
        PreparedStatement ps = null;

        try {
            c = makeConnection();
            //ps = c.prepareStatement("DELETE FROM users");
            ps = new DeleteAllStrategy().makePreparedStatement(c);
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
        Connection c = null;
        PreparedStatement ps = null;
        jdbcContextWithStatementStrategy(new DeleteAllStrategy());
    }
    public void asd123() throws SQLException {
        Connection c = makeConnection();
        PreparedStatement ps= c.prepareStatement("DELETE FROM users");
        ps.executeUpdate();

        ps.close();
        c.close();
    }

    public int getCount() throws SQLException {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        int s;

        try {
            conn  = makeConnection();
            ps = conn.prepareStatement("SELECT COUNT(ID) FROM users");
            rs = ps.executeQuery();
            rs.next();
            s = Integer.parseInt(rs.getString("COUNT(ID)"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(conn, ps, rs);
        }
        return s;
    }

    private void close(AutoCloseable... autoCloseables){

        for (AutoCloseable ac : autoCloseables) {
            if (ac != null) {
                try {
                    ac.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public int getCount1() throws SQLException {
        int s;
        Connection conn  = makeConnection();
        PreparedStatement ps = conn.prepareStatement("SELECT COUNT(ID) FROM users");
        ResultSet rs = ps.executeQuery();
        rs.next();
        s = Integer.parseInt(rs.getString("COUNT(ID)"));
        conn.close();
        ps.close();
        rs.close();

        return s;
    }
    public void insert(User user) throws SQLException {
        Connection conn = makeConnection();
        PreparedStatement ps = conn.prepareStatement("INSERT INTO users(id, name, password) VALUES(?, ?, ?)");
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        ps.executeUpdate();
        ps.close();
        conn.close();
    }
    public User select(String id) throws SQLException {
        Connection conn = makeConnection();
        PreparedStatement ps = conn.prepareStatement("SELECT id, name, password FROM users WHERE ID =?");
        ps.setString(1, id);

        ResultSet rs = ps.executeQuery();
        rs.next();
        User user = new User(rs.getString("id"),
                rs.getString("name"), rs.getString("password"));
        rs.close();
        ps.close();
        conn.close();

        if (user == null) {
            throw new EmptyResultDataAccessException(1);
        }

        return user;
    }
}
