package org.obrii.mit.dp2021.fit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FormServlet", urlPatterns = {"/form"})
public class FormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String sex = request.getParameter("sex");

        Human human = sex.equals("Male") ? new Male() : new Female();

        request.setAttribute("maleOrFemale", human);
        request.getRequestDispatcher("Form.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String sex = request.getParameter("sex");

        IPeople human = new Human(
                request.getParameter("name"),
                request.getParameter("phone"),
                request.getParameter("haircut"));

        request.setAttribute("human", human);
        request.getRequestDispatcher("Submit.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
