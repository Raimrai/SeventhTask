package kz.bitlab.sevlets;
import kz.bitlab.db.DBManager;
import kz.bitlab.db.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Document;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
    }
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"" +
                " integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" " +
                "crossorigin=\"anonymous\">");
        out.print("</head>");
        out.print("<body>");
        out.print("<div class= 'container'>");
        out.print("<div class= 'row mt-3'>");
        out.print("<div class= 'col-6 mx-auto'>");
        out.print("<form action = '/apply' method='post'>");
        out.print("<div class= 'row mt-3'>");
        out.print("<div class = 'col-12'>");
        out.print("<label>NAME : </label>");
        out.print("</div>");
        out.print("</div>");
        out.print("<div class= 'row mt-2'>");
        out.print("<div class = 'col-12'>");
        out.print("<input type = 'text' class = 'form-control' name='user_name' placeholder='Insert name'>");
        out.print("</div>");
        out.print("</div>");
        out.print("<div class= 'row mt-3'>");
        out.print("<div class = 'col-12'>");
        out.print("<label>SURNAME : </label>");
        out.print("</div>");
        out.print("</div>");
        out.print("<div class= 'row mt-2'>");
        out.print("<div class = 'col-12'>");
        out.print("<input type = 'text' class = 'form-control' name='user_surname' placeholder='Insert surname'>");
        out.print("</div>");
        out.print("</div>");
        out.print("<div class= 'row mt-3'>");
        out.print("<div class = 'col-12'>");
        out.print("<label>CLUB : </label>");
        out.print("</div>");
        out.print("</div>");
        out.print("<div class= 'row mt-2'>");
        out.print("<div class = 'col-12'>");
        out.print("<select name='user_club'>");
        out.print("<option>FC Barcelona</option>");
        out.print("<option>Real Madrid</option>");
        out.print("<option>Chelsea</option>");
        out.print("<option>Manchester city</option>");
        out.print("<option>Manchester united</option>");
        out.print("<option>Arsenal</option>");
        out.print("</select>");
        out.print("</div>");
        out.print("</div>");
        out.print("<div class= 'row mt-3'>");
        out.print("<div class = 'col-12'>");
        out.print("<label>SALARY : </label>");
        out.print("</div>");
        out.print("</div>");
        out.print("<div class= 'row mt-2'>");
        out.print("<div class = 'col-12'>");
        out.print("<input type = 'text' class = 'form-control' name='user_salary' placeholder='Insert salary'>");
        out.print("</div>");
        out.print("</div>");
        out.print("<div class= 'row mt-3'>");
        out.print("<div class = 'col-12'>");
        out.print("<label>TRANSFER PRICE : </label>");
        out.print("</div>");
        out.print("</div>");
        out.print("<div class= 'row mt-2'>");
        out.print("<div class = 'col-12'>");
        out.print("<input type = 'text' class = 'form-control' name='user_transferPrice' placeholder='Insert transfer price'>");
        out.print("</div>");
        out.print("</div>");
        out.print("<div class= 'row mt-3'>");
        out.print("<div class = 'col-12'>");
        out.print("<button class='btn btn-success'>ADD FOOTBALLER</button>");
        out.print("</div>");
        out.print("</div>");
        out.print("</form>");
        ArrayList<User> users = DBManager.getAllUsers();
        for (User usr : users){
            out.println("<h2 style = 'color: green;'>"+usr.getName()+" " +usr.getSurname()+"</h2>"+"<h4 style = 'color: blue;'>"+"Club: " + usr.getClub()+"<br>"+"<span style = 'color: red;'>" +"Salary: "+ usr.getSalary() +"<br>"+"Transfer price: "  + usr.getTransferPrice()+"</span>" +"</h4>");
        }
        out.print("</div>");
        out.print("</div>");
        out.print("</div>");
        out.print("</body>");
        out.print("</html>");
    }
}