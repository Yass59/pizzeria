package fr.roudane.utilisateur.business.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.roudane.utilisateur.business.implement.UsersBusiness;




@WebServlet("/Supprimer")
public class SupprimerServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	UsersBusiness userbz = new UsersBusiness();
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String idString = request.getParameter("id");

		int id = Integer.parseInt(idString);

		

		userbz.supprimerUtilisateur(id);

		

		response.sendRedirect("Users");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
