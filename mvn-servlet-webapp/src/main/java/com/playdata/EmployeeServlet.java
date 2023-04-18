package com.playdata;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(urlPatterns = "/first")
public class EmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // client에게 보내는 respones의 Content-Type을 설정한다.
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        Connection con = (Connection) req.getServletContext().getAttribute("dbConnection");
        String sql = "select * from employees limit 0, 10";
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            out.print("<!DOCTYPE html>");
            out.print("<html>");
            out.print("<head>");
            out.print("<meta charset=\"UTF-8\">");
            out.print("<title>Employees</title>");
            out.print("</head>");
            out.print("<body>");
            out.print("<table>");
            out.print("<tr>");
            out.print("<th>사원번호</th>");
            out.print("<th>생일</th>");
            out.print("<th>이름</th>");
            out.print("<th>성</th>");
            out.print("<th>성별</th>");
            out.print("<th>고용일</th>");
            out.print("</tr>");
            out.print("<tr>");
            out.print("<td></td>");
            out.print("<td></td>");
            out.print("<td></td>");
            out.print("<td></td>");
            out.print("<td></td>");
            out.print("<td></td>");
            out.print("</tr>");


            while (rs.next()) {
                out.print("    <tr>");
                out.print("      <td>" + rs.getInt("emp_no") + "</td>");
                out.print("      <td>" + rs.getString("first_name") + "</td>");
                out.print("      <td>" + rs.getString("last_name") + "</td>");
                out.print("      <td>" + rs.getString("birth_date") + "</td>");
                out.print("      <td>" + rs.getString("gender") + "</td>");
                out.print("      <td>" + rs.getString("hire_date") + "</td>");
                out.print("    </tr>");

//                out.print(rs.getInt("emp_no")+ ",");
//                out.print(rs.getString("birth_date")+",");
//                out.print(rs.getString("first_name")+",");
//                out.print(rs.getString("last_name")+",");
//                out.print(rs.getString("gender")+",");
//                out.print(rs.getString("hire_date")+"<br>");
            }
            out.print("</table>");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sql = "insert into employees value (?,?,?,?,?,?)";
        req.setCharacterEncoding("UTF-8");
        String empNo = req.getParameter("emp_no");
        String birthDate = req.getParameter("birth_date");
        String firstName = req.getParameter("first_name");
        String lastName = req.getParameter("last_name");
        String gender = req.getParameter("gender");
        String hireDate = req.getParameter("hire_date");
        Connection con = (Connection) req.getServletContext().getAttribute("dbConnection");

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, Integer.parseInt(empNo));
            stmt.setString(2,birthDate);
            stmt.setString(3,firstName);
            stmt.setString(4,lastName);
            stmt.setString(5,gender);
            stmt.setString(6,hireDate);
//            데이터 베이스에 데이터를 넣는 코드입니다.
            int count = stmt.executeUpdate();
            System.out.println("실행되었습니다.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
