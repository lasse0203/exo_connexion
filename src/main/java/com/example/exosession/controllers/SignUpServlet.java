package com.example.exosession.controllers;
import com.example.exosession.data.FakeDB;
import com.example.exosession.models.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet ( name = "signUpServlet" , value = "/auth/signUp")
public class SignUpServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/auth/signUp.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        if (User.userExists(email)) {
            resp.sendRedirect("erreurCompteExistant.html");

        } else {
            User newUser = new User(
                    firstname,
                    lastname,
                    email,
                    password
            );

            FakeDB.users.add(newUser);

            resp.sendRedirect(req.getContextPath() + "/auth/signIn");


        }

    }


}