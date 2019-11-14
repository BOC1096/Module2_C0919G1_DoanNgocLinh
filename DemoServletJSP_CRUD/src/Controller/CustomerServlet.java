package Controller;

import Dao.CustomerDao;
import Model.Customer;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/")
public class CustomerServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getServletPath();
        switch (action) {
            case "/create":
                createCustomer(request, response);
                break;
            case "/update":
                updateCustomer(request, response);
                break;
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getServletPath();
        switch (action) {
            case "/new":
                showNewForm(request, response);
                break;
            case "/delete":
                deleteCustomerById(request, response);
                break;
            case "/edit":
                showEditForm(request, response);
                break;
            default:
                //mac dinh tat ca action sai o tren deu tra ve trang list
                listCustomer(request, response);
                break;
        }
    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = CustomerDao.getAllCustomer();
        request.setAttribute("listCustomer", customerList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/index.jsp");
        dispatcher.forward(request, response);
    }

    // phuong thuc delete customer
    private void deleteCustomerById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idCustomer = Integer.parseInt(request.getParameter("id"));
        CustomerDao.deleteCustomer(idCustomer);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/index.jsp");
//        dispatcher.forward(request,response);
        // tra ve list khong co data

        response.sendRedirect("/");
    }

    //phuong thuc hien thi tran them moi
    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/newCustomer.jsp");
        dispatcher.forward(request, response);
    }

    //phuong thuc luu cus vao data qua doPost
    private void createCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer checkCustomer = CustomerDao.getCustomer(id);
        if (checkCustomer == null) {
            String name = request.getParameter("name");
            String phone = request.getParameter("phone");
            String email = request.getParameter("email");
            Customer newCustomer = new Customer(id, name, phone, email);
            CustomerDao.addCustomer(newCustomer);
            response.sendRedirect("/");
        } else {
            String message = "This id already exists";
            String name = request.getParameter("name");
            String phone = request.getParameter("phone");
            String email = request.getParameter("email");
            Customer exitCustomer = new Customer(id, name, phone, email);
            request.setAttribute("message", message);
            request.setAttribute("customer", exitCustomer);
            RequestDispatcher dispatcher = request.getRequestDispatcher("customer/newCustomer.jsp");
            dispatcher.forward(request, response);
        }
    }

    //phuong thuc hien thi trang edit
    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customerEdit = CustomerDao.getCustomer(id);
        request.setAttribute("customer", customerEdit);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/editCustomer.jsp");
        dispatcher.forward(request, response);
    }

    // phuong thuc update customer
    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        Customer updateCustomer = new Customer(id, name, phone, email);
        CustomerDao.addCustomer(updateCustomer);
        response.sendRedirect("list");
    }
}
