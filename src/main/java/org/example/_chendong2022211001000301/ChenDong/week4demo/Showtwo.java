package org.example._chendong2022211001000301.ChenDong.week4demo;

import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name = "Shwotwo",
        value = "/show",
        initParams = {
                @WebInitParam(name="myname",value = "ChenDong"),
                @WebInitParam(name="studentid",value = "2022211001000301")
        }
)
public class Showtwo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        String name = getServletConfig().getInitParameter("name");
        String studentId = getServletConfig().getInitParameter("id");
        response.setContentType("text/html");
        response.getWriter().println("Name: " + name + "<br>");
        response.getWriter().println("Student ID: " + studentId + "<br>" + "<br>" + "<br>");

//        String name2 = getServletConfig().getInitParameter("name");
//        String studentId2 = getServletConfig().getInitParameter("id");
//        response.setContentType("text/html");
//        response.getWriter().println("Name: " + name2 + "<br>");
//        response.getWriter().println("Student ID: " + studentId2 );

    }
}
