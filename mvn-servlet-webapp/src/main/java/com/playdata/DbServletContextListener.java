package com.playdata;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.Connection;
import java.sql.SQLException;

public class DbServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        try {
            Connection conn = DBUtil.getConnection(context);
            context.setAttribute("dbConnection", conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        // ServletContext에 저장된 DB Connection 객체를 가져온다.
        Connection conn = (Connection) context.getAttribute("dbConnection");
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
