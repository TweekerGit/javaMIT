package org.obrii.mit.dp2021.fit.servlets;

import org.obrii.mit.dp2021.fit.crudTools.DBCrud;
import org.obrii.mit.dp2021.fit.data.Data;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.parser.Parser;
import java.io.IOException;

@WebServlet(name = "PreServlet", urlPatterns = {""})
public class PreServlet extends HttpServlet {
    DBCrud CRUD = new DBCrud();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Sort or just open
        if (request.getParameter("search") != null) {
            request.setAttribute("CrudData", CRUD.sortData(request.getParameter("search")));
        } else {
            request.setAttribute("CrudData", CRUD.readData());
        }

        //System.out.println("=========GET========");

        request.getRequestDispatcher("home.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Create new user
        Data user = new Data(
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