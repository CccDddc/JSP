package org.ChenDong.week2.demo;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


public class NewServlet extends HttpServlet {
    public void doGet(HttpServletRequest request , HttpServletResponse response) {
        PrintWriter writer;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        writer.println("Hello Client");
    }
}
