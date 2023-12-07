package Controller;

import Model.BEAN.UserBean;
import Model.BO.UserBO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String model = request.getParameter("model");
       

        if ("login".equals(model)) {
            viewLogin(request, response);
        }  
    }
    private void viewLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String password = request.getParameter("password");
    	String username = request.getParameter("username");
    	UserBO userBO = new UserBO();
    	String check = null;
    	check =userBO.loginUser(username, password);
    	if( check!=null) {
    		if(check == "admin") {
    			RequestDispatcher dispatcher = request.getRequestDispatcher("/viewAdmin.jsp");
    			 dispatcher.forward(request, response);
    		}else if(check == "user") {
    			RequestDispatcher dispatcher = request.getRequestDispatcher("/viewUser.jsp");
    			 dispatcher.forward(request, response);
    		}
    	}
    	
       
    }
   
}
