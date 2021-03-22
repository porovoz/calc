package net.falconorg.calc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

@WebServlet(name = "calcServlet", urlPatterns = "/calc")
public class calcServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userResult = request.getParameter("userResult");
        request.setAttribute("userResult", userResult);

        var number1 = ThreadLocalRandom.current().nextInt(1000) + 1;
        var number2 = ThreadLocalRandom.current().nextInt(1000) + 1;
        var sum = number1 + number2;

     if (sum != number1 + number2) {
         request.setAttribute("incorrectResult", true);
       request.getRequestDispatcher("WEB-INF/calc.jsp")
               .forward(request, response);
    }else{
          request.setAttribute("incorrectResult", false);
            System.out.println("Correct!");
        }

        request.setAttribute("sum", sum);
        request.setAttribute("number1", number1);
        request.setAttribute("number2", number2);
        request.getRequestDispatcher("WEB-INF/calc.jsp")
                .forward(request, response);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println(sum);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
