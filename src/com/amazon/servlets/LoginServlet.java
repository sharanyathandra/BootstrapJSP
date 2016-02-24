package com.amazon.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			UserBean user = new UserBean();
			user.setUserName(request.getParameter("Email"));
			user.setUserPassword(request.getParamater("Password"));
			
			user = UserDAO.login(user);
			
			if(user.isValid())
			{
				HttpSession session = request.getSession(true);
				Session.setAttribute("currentSessionUser", user);
				response.sendRedirect("logged.jsp");
				
		    }
			else{
				response.sendRedirect("invalidLogged.jsp");
			}
			
			catch(Throwable theException){
				System.out.println(theException);
			}
		}
	

}
