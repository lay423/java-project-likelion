package com.dbexercise;

import com.dbexercise.domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserDao2 {

    private Connection makeConnection() throws SQLException, ClassNotFoundException {
        Map<String, String> env = System.getenv();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(env.get("DB_HOST"), env.get("DB_USER"), env.get("DB_PASSWORD"));  //db 연결
        return conn;
    }
    public void add(User user) throws SQLException, ClassNotFoundException {
        Connection conn = makeConnection();//db 연결
        PreparedStatement ps = conn.prepareStatement("INSERT INTO users(id, name, password) VALUES(?, ?, ?)");
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        ps.executeUpdate();
        ps.close();
        conn.close();
    }

    public User get(String id) throws ClassNotFoundException, SQLException {
        Connection conn = makeConnection();//db 연결
        PreparedStatement ps = conn.prepareStatement("SELECT id, name, password FROM users WHERE ID =?");
        ps.setString(1, id);

        ResultSet rs = ps.executeQuery();
        rs.next();
        User user = new User(rs.getString("id"),
                rs.getString("name"), rs.getString("password"));
        rs.close();
        ps.close();
        conn.close();

        return user;
    }

    public List<User> findAll() throws ClassNotFoundException, SQLException {
        Connection conn = makeConnection();//db 연결
        PreparedStatement ps = conn.prepareStatement("SELECT id, name, password FROM users");

        ResultSet rs = ps.executeQuery();
        List<User> userList = new ArrayList<>();
        while (rs.next()) {
            userList.add(new User(rs.getString("id"),
                    rs.getString("name"), rs.getString("password")));
        }
        rs.close();
        ps.close();
        conn.close();

        return userList;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao2 userDao2 = new UserDao2();
//        userDao2.add("4", "superMan", "12334");
//        User user = userDao2.get("1");
//        System.out.println(user.getName());
//        List<User> userList = userDao2.findAll();
//        for (User user1 : userList) {
//            System.out.println(user1.getName());
//        }
    }
}
