package fr.roudane.accueil;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.roudane.accueil.beans.Produits;
import fr.roudane.accueil.beans.Utilisateur;

/**
 * Servlet implementation class UtilisateurServlet
 */
@WebServlet("/Utilisateur")
public class UtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UtilisateurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		Utilisateur luffy =
				new Utilisateur("luffy", "monkey", "ressources/images/luffy.png", 20);
		
		
		Utilisateur barbenoir =
				new Utilisateur("marshall", "teach", "ressources/images/barbenoir.jpg", 42);
		
		Utilisateur statham =
				new Utilisateur("jason", "statham", "ressources/images/statham.jpg", 45);
					
		
		Utilisateur depp =
				new Utilisateur("depp", "johnny", "ressources/images/depp.jpg", 47);
		

		Utilisateur rayleigh =
				new Utilisateur("rayleigh", "x", "ressources/images/rayleigh.jpeg", 70);
		
		
		
		Utilisateur [] utilisateur = {luffy,barbenoir,statham,depp,rayleigh};
		
		
		
		
		
		
		
		
		
		
		request.setAttribute("utilisateur", utilisateur);

		
		
		
		
		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Utilisateur.jsp").forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
