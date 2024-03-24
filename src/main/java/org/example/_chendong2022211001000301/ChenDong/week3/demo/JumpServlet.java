package org.example._chendong2022211001000301.ChenDong.week3.demo;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


public class JumpServlet extends HttpServlet {

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
}


