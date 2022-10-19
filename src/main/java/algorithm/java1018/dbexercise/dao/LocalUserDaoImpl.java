package algorithm.java1018.dbexercise.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class LocalUserDaoImpl extends UserDaoAbstract{
    @Override
    public Connection makeConnection() throws SQLException, ClassNotFoundException {
        Map<String, String> env = System.getenv();
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306",
                "root", "pswd");  //db 연결
        return conn;
    }
}
