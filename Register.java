package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import dao.RegisterDAO;
import model.Customer;


@WebServlet("/Register")
public class Register extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	
		try
		{
		String Username=request.getParameter("username");
		String Password1=request.getParameter("passwd");
		String CustomerName=request.getParameter("customerName");
		String Gender=request.getParameter("gender");
		String MobileNo=request.getParameter("mobileNo");
		String EmailId=request.getParameter("emailid");
		String Address=request.getParameter("custAddr");
		
		out.println("User Name:"+Username);
		out.println("Password:"+Password1);
		out.println("Customer Name:"+CustomerName);
		out.println("Gender:"+Gender);
		out.println("Mobile No:"+MobileNo);
		out.println("emailId:"+EmailId);
		out.println("Customer Address"+Address);
		
		Customer customer=new Customer(Username,Password1,CustomerName,Gender,MobileNo,EmailId,Address);
		
		RegisterDAO registerDAO=new RegisterDAO();
		
			if(registerDAO.registerCustomer(customer))
			{
				request.setAttribute("username", customer.getUsername());
				RequestDispatcher dispatch=request.getRequestDispatcher("UserHome.jsp");
				dispatch.forward(request, response);
			}
			else
			{
				request.setAttribute("errorInfo","Error Occured During Registering");
				RequestDispatcher dispatch=request.getRequestDispatcher("ErrorPage.jsp");
				dispatch.forward(request, response);
			}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			request.setAttribute("errorInfo","Error Occured During Registering::::"+e.getMessage());
			RequestDispatcher dispatch=request.getRequestDispatcher("ErrorPage.jsp");
			dispatch.forward(request, response);
		}
		
	}

}
