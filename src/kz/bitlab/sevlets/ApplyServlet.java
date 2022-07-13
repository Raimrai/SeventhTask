package kz.bitlab.sevlets;

import kz.bitlab.db.DBManager;
import kz.bitlab.db.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/apply")
public class ApplyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response){

    }
    protected void doPost (HttpServletRequest request,HttpServletResponse response) throws IOException {
        String name = request.getParameter("user_name");
        String surname = request.getParameter("user_surname");
        String club = request.getParameter("user_club");
        String salary = request.getParameter("user_salary");
        String transferPrice = request.getParameter("user_transferPrice");
        User user = new User();
        user.setName(name);
        user.setSurname(surname);
        user.setClub(club);
        user.setSalary(salary);
        user.setTransferPrice(transferPrice);
        DBManager.addUser(user);
        response.sendRedirect("/home");
    }
}