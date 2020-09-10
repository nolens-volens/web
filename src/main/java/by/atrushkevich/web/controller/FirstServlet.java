package by.atrushkevich.web.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/controller")
public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String mSec = request.getParameter("Time");
        float delta = ((float) (System.currentTimeMillis() - Long.parseLong(mSec))) / 1_000;
        request.setAttribute("result", delta);

        String but = request.getParameter("Submit");
        request.setAttribute("button", but.toUpperCase());

        request.getRequestDispatcher("/pages/result.jsp").forward(request, response);
        
//        DataReader dataReader = new DataReader();
//        String someText = dataReader.readData("data/data.txt");
//        request.setAttribute("someText", someText);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
