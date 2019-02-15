package fr.roudane.utilisateur.business.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.roudane.utilisateur.business.implement.UsersBusiness;

/**
 * Servlet implementation class AjouterServlet
 */
@WebServlet("/AjouterServlet")
public class AjouterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     UsersBusiness ub = new UsersBusiness();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
		
		
		
		
		
		
		
		this.getServletContext()

		.getRequestDispatcher("/WEB-INF/pages/ajouter.jsp")

		.forward(request, response);
		
	}











	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	


		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");

		String numeroString = request.getParameter("numero");

		int numero = 0;

		try {
			numero = Integer.parseInt(numeroString);
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("AjouterServlet");
			return;
		}

		String email = request.getParameter("email");
		String adresse = request.getParameter("adresse");
		String photo = request.getParameter("photo");
		String phone = request.getParameter("phone");



		if(
				nom.equals("")
				|| prenom.equals("")
				|| adresse.equals("")
				|| email.equals("")
				|| photo.equals("")
				|| phone.equals("")

				)
		{ response.sendRedirect("AjouterServlet");
			return;
		}
			


			boolean ok =	ub.ajouterUtilisateur(nom, prenom, numero, phone, email, adresse, photo);

		if (ok) {


			response.sendRedirect("Users");
		} 
		else {
			response.sendRedirect("AjouterServlet");

		}




	}
}
