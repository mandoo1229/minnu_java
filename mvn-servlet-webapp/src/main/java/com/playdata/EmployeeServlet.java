package com.playdata;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(urlPatterns = "/first")
public class EmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // client에게 보내는 respones의 Content-Type을 설정한다.
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        Connection con = (Connection) req.getServletContext().getAttribute("dbConnection");
        String sql = "select * from employees limit 0, 1000";
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                out.print(rs.getInt("emp_no")+ ",");
                out.print(rs.getString("birth_date")+",");
                out.print(rs.getString("first_name")+",");
                out.print(rs.getString("last_name")+",");
                out.print(rs.getString("gender")+",");
                out.print(rs.getString("hire_date")+"<br>");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
