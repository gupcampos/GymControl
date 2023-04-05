package br.com.gymcontrol.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/create-gym")
public class CreateGymServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String GymName = request.getParameter("username");

        System.out.println(GymName);

        String Sexo = request.getParameter("sexo");
        System.out.println(Sexo);

        String DateBirth = request.getParameter("DateBirth");
        System.out.println(DateBirth);

        String Email = request.getParameter("email");
        System.out.println(Email);

        String Senha = request.getParameter("senha");
        System.out.println(Senha);

        request.getRequestDispatcher("cadastro.html").forward(request, response);

    }

}