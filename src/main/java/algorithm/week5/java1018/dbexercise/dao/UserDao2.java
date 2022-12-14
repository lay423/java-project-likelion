package algorithm.week5.java1018.dbexercise.dao;

import algorithm.week5.java1018.dbexercise.domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao2 {
    private ConnectionMaker connectionMaker;

    public UserDao2() {
        connectionMaker = new AWSConnectionMaker();
    }

    public void add(User user) throws SQLException, ClassNotFoundException {
        Connection conn = connectionMaker.makeConnection();
        PreparedStatement ps = conn.prepareStatement("INSERT INTO users(id, name, password) VALUES(?, ?, ?)");
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        ps.executeUpdate();
        ps.close();
        conn.close();
    }

    public User get(String id) throws ClassNotFoundException, SQLException {
        Connection conn = connectionMaker.makeConnection();//db 연결
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
        Connection conn = connectionMaker.makeConnection();//db 연결
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
        User user = new User("8", "spiderPig", "1123");
        userDao2.add(user);
        User user1 = userDao2.get("8");
        System.out.println(user1.getName());
    }
}
