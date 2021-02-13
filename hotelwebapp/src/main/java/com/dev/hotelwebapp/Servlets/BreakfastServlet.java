package com.dev.hotelwebapp.Servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BreakfastServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out =  response.getWriter();
        System.out.println("Girdim servlete");
        String[] selectedBreakfastMeals = request.getParameterValues("breakfast");

        for (String s : selectedBreakfastMeals){
            System.out.println("Meal: "+s);
        }
    }
}
