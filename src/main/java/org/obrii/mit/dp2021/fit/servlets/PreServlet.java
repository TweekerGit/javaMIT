package org.obrii.mit.dp2021.fit.servlets;

import org.obrii.mit.dp2021.fit.Config;
import org.obrii.mit.dp2021.fit.crudTools.Crud;
import org.obrii.mit.dp2021.fit.data.Data;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebServlet(name = "PreServlet", urlPatterns = {"/"})
public class PreServlet extends HttpServlet {
    Crud CRUD = new Crud(new File(Config.getFileName()));

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Read users
        if (Config.getFileName().equals("")) {
            Config.setFileName(this.getServletContext().getRealPath("") + "data.txt");
            CRUD = new Crud(new File(Config.getFileName()));
        }

        if (request.getParameter("search") != null) {
            request.setAttribute("CrudData", CRUD.sortData(request.getParameter("search")));
        } else {
            request.setAttribute("CrudData", CRUD.readData());
        }

        System.out.println("=========GET========");

        request.getRequestDispatcher("index.jsp").forward(request, response);
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
        CRUD.createData(user);
        doGet(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Delete User
        CRUD.deleteData(Integer.parseInt(req.getParameter("id")));
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
        CRUD.updateData(Integer.parseInt(req.getParameter("id")), user);
        doGet(req, resp);
    }
}