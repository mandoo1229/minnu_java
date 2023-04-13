package com.playdata;

import javax.servlet.ServletContext;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    public static Connection getConnection(ServletContext context) throws SQLException {
        String url = context.getInitParameter("DB_URL");
        String user = context.getInitParameter("DB_USER");
        String password = context.getInitParameter("DB_PASSWORD");

        try {
            Class.forName("org.mariadb.jdbc.Driver"); //java 7부터 생략 갸능
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return DriverManager.getConnection(url, user, password);
    }
}
