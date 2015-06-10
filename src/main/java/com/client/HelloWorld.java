package com.client;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloWorld extends HttpServlet {

    private static final long serialVersionUID = 1L;


    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  throws ServletException, IOException {
        resp.getOutputStream().write("Hello World.".getBytes());
    }

    public void main(String[] args) {
        HelloWorld app = new HelloWorld();
    }
}