package fr.roudane.utilisateur.business.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.roudane.utilisateur.bean.UsersClass;
import fr.roudane.utilisateur.business.implement.UsersBusiness;
import fr.roudane.utilisateur.repository.impl.UtilisateurRepositoryimpl;



@WebServlet("/modifier")
public class ModifieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	UsersBusiness  userbz = new UsersBusiness();
	
	
	
	
	
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idString = request.getParameter("id");
		int id = Integer.parseInt(idString);
		
		
		UsersClass users = userbz.getOne(id);
		
		request.setAttribute("user", users);

		this.getServletContext()

		.getRequestDispatcher("/WEB-INF/pages/modifie.jsp")

		.forward(request, response);
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idString = request.getParameter("id");

		int id = Integer.parseInt(idString);

		

		String nom =request.getParameter("nom");

		String prenom = request.getParameter("prenom");

		

		String numeroString = request.getParameter("numero");

		

		int numero = Integer.parseInt(numeroString);

		

		String phone = request.getParameter("phone");

		

		String email = request.getParameter("email");

		String adresse = request.getParameter("adresse");

		String photo = request.getParameter("photo");



		if(
				nom.equals("")
				|| prenom.equals("")
				|| adresse.equals("")
				|| email.equals("")
				|| photo.equals("")
				|| phone.equals("")

				)
		{ response.sendRedirect("modifier?id=" + id);
			return;
		}
			


			boolean ok =	userbz.ModifierUsers(id, nom, prenom, numero, phone, email, adresse, photo);



			if(ok) {

				response.sendRedirect("users_info?id="+ id);

			}else {

				response.sendRedirect("modifier?id=" + id);
		}




	}
}