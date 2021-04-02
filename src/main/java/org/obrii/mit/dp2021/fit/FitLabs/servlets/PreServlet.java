package org.obrii.mit.dp2021.fit.FitLabs.servlets;

import org.obrii.mit.dp2021.fit.FitLabs.crud.SpringCrud;
import org.obrii.mit.dp2021.fit.FitLabs.data.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PreServlet", urlPatterns = {""})
public class PreServlet extends HttpServlet {

    @Autowired
    SpringCrud CRUD;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,config.getServletContext());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Read users
        if (request.getParameter("search") != null) {
            request.setAttribute("CrudData", CRUD.sort(request.getParameter("search")));
        } else {
            request.setAttribute("CrudData", CRUD.read());
        }
        request.getRequestDispatcher("home.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Create new user
        Data user = new Data(
                Integer.parseInt(req.getParameter("id")),
                req.getParameter("firstName"),
                req.getParameter("lastName"),
                req.getParameter("phone"),
                req.getParameter("date")
        );
        CRUD.create(user);
        doGet(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Delete User
        CRUD.delete(Integer.parseInt(req.getParameter("id")));
        doGet(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Update User
        Data user = new Data(
                Integer.parseInt(req.getParameter("id")),
                req.getParameter("firstName"),
                req.getParameter("lastName"),
                req.getParameter("phone"),
                req.getParameter("date")
        );
        CRUD.update(user, Integer.parseInt(req.getParameter("id")));
        doGet(req, resp);
    }
}