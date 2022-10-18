package com.line.dao;

import com.line.domain.Hospital;

import java.sql.*;
import java.util.Map;

public class HospitalDao {

    public void add() throws ClassNotFoundException, SQLException {
        Map<String, String> env = System.getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPassword);
        PreparedStatement ps = conn.prepareStatement("INSERT INTO `hospital`.`seoul_hospital`\n" +
                "(`id`,\n" +
                "`address`,\n" +
                "`district`,\n" +
                "`category`,\n" +
                "`emergency_room`,\n" +
                "`name`,\n" +
                "`subdivision`)\n" +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?");
        ps.setString(1, "3");
        ps.setString(2, "강남구청 집돌이에");
        ps.setString(3, "서울특별시 강남구");
        ps.setString(4, "N");
        ps.setString(5, "2");
        ps.setString(6, "병원이름병원");
        ps.setString(7, "치과");

        ps.executeUpdate();
        ps.close();
        conn.close();

    }

    public Hospital get() throws ClassNotFoundException, SQLException {
        Map<String, String> env = System.getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPassword);
        PreparedStatement ps = conn.prepareStatement("SELECT id, address, district" +
                "category, emergency_room, name, subdivision FROM `hospital`.`seoul_hospital`" +
                "WHERE id = ?");
        ps.setString(1, "1");

        ResultSet rs = ps.executeQuery();
        rs.next();
        Hospital hospital = new Hospital(
                rs.getString("id"),
                rs.getString("address"),
                rs.getString("district"),
                rs.getString("category"),
                rs.getInt("emergency_room"),
                rs.getString("name"),
                rs.getString("subdivision")
        );
        rs.close();
        ps.close();
        conn.close();

        return hospital;
    }

}
