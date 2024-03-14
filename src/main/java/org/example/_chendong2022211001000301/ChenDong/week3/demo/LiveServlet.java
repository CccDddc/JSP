package org.example._chendong2022211001000301.ChenDong.week3.demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LiveServlet extends HttpServlet {
    public LiveServlet(){
        System.out.println("in construction process");
    }
    @Override
    public void init() {

        System.out.print("in init");
    }
    @Override
    protected void doGet(HttpServletRequest request , HttpServletResponse response) {
        System.out.println("in servcie --> doget");
    }
    @Override
    protected void doPost(HttpServletRequest request , HttpServletResponse response) {
        System.out.println("in servcie --> dopost");
    }
    public void destroy() {
        System.out.println("in servcie --> destroy");
    }
}


