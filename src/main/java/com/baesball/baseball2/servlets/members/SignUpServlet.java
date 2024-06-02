package com.baesball.baseball2.servlets.members;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "signup", value = "/member/signup")
public class SignUpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("../login/SignUp.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("userId", request.getParameter("userId"));
        request.setAttribute("password", request.getParameter("password"));
        request.getRequestDispatcher("/login/test.jsp").forward(request,response);;
    }



}