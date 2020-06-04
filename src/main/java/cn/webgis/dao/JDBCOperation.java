package cn.webgis.dao;


import java.sql.*;

public class JDBCOperation {

    public Connection getConn() {
        String driver = "org.postgresql.Driver";
        String url = "jdbc:postgresql://47.93.188.142:5432/news_db";
        String username = "postgres";
        String password = "12345";
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}

