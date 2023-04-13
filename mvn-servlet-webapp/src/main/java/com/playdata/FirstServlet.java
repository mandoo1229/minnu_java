package com.playdata;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet

//filter를 넣는 이유는 일괄처리를 한번에 한다.
//웹페이지가
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter pw = resp.getWriter();
        pw.print("첫 번째 서블릿 페이지입니다.");

//      콘솔에 출력합니다.
        System.out.println("First Servlet 입니다.");
    }
}

