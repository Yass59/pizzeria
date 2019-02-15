package fr.roudane.utilisateur.business.controler;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.roudane.utilisateur.bean.UsersClass;
import fr.roudane.utilisateur.business.implement.UsersBusiness;

@WebServlet("/Users")
public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     UsersBusiness userbz = new UsersBusiness();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		ArrayList<UsersClass>Users1 = userbz.getusers();
		
		request.setAttribute("Users1", Users1);
		
		
		
		
		

		
		this.getServletContext()

		.getRequestDispatcher("/WEB-INF/pages/users.jsp")

		.forward(request, response);
		
		
		
			
		
		
		
		
	}

	
	
	
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
