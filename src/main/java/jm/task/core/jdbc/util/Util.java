package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String HOST = "jdbc:mysql://localhost:3306/dbtest";
    private static final String username = "root";
    private static final String password = "root";

    private static Connection conn;

    public static Connection getConn() {

        try {
            Class.forName(DB_DRIVER);
            conn = DriverManager.getConnection(HOST, username, password);
            //conn.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }


}
