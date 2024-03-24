package org.example._chendong2022211001000301.ChenDong.week4demo;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCServletdemo extends HttpServlet {
    Connection con = null;
    @Override
    public void init() {
        try {
            String username= "sa";
            String url= "jdbc:sqlserver://localhost:1433;DatabaseName=userdb;encrypt=true;trustServerCertificate=true";
            String password= "cd240627";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url , username , password);
            System.out.println(con);
            System.out.println("连接成功");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        String str = "select * from user_message";
        try {
            ResultSet rs = con.createStatement().executeQuery(str);
            try {
                PrintWriter writer = response.getWriter();
                writer.println("<html><head><meta charset=\"UTF-8\"><title>User Information</title></head><body>");
                writer.println("<table>");
                writer.println("<tr><th>Username</th><th>Password</th><th>Email</th><th>Gender</th><th>Birthdate</th></tr>");
                while (rs.next()) {
                    String username = rs.getString("username");
                    String password = rs.getString("password");
                    String email = rs.getString("email");
                    String gender = rs.getString("gender");
                    String birthdate = rs.getString("birthdate");
                    writer.println("<tr><td>" + username + "</td><td>" + password + "</td><td>" + email + "</td><td>" + gender + "</td><td>" + birthdate + "</td></tr>");
                }
                writer.println("</table>");
                writer.println("</body></html>");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void doPost(HttpServletRequest request , HttpServletResponse response) {
        PrintWriter writer;
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String date = request.getParameter("dateOfBirth");
        try {
            request.setCharacterEncoding("UTF-8");
            writer = response.getWriter();
            writer.println("<html><head><title>Information obtained</title></head><body>");
            writer.println("Username:" + username + "<br/>");
            writer.println("User password:" + password + "<br/>");
            writer.println("User email:" + email + "<br/>");
            writer.println("User gender:" + gender + "<br/>");
            writer.println("User birthdate:" + date + "<br/>");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void destroy(){
        super.destroy();
        try{
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
