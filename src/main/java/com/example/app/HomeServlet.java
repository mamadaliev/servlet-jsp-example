package com.example.app;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /* send data to home.jsp */
        req.setAttribute("name", req.getParameter("name"));

        req.getRequestDispatcher("home.jsp").forward(req, resp);
    }
}
