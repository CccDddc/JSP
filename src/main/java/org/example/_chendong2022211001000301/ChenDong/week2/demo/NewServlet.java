package org.example._chendong2022211001000301.ChenDong.week2.demo;


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
        writer.println("Name : ChenDong");
        writer.println("ID : 2022211001000301");
        writer.println("Date and Time : Sunday, March 10, 2024,22:25:21");
    }
    public void doPost(HttpServletRequest request , HttpServletResponse response) {
        PrintWriter writer;
        try {
            writer = response.getWriter();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
