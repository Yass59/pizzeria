package fr.roudane.accueil;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.roudane.accueil.beans.personne;

/**
 * Servlet implementation class AccueilServlet
 */
@WebServlet("/Accueil")
public class AccueilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccueilServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		personne jj = new personne("James", "JACK", 45, 1.80, 80);

		

		personne je = new personne("John", "ERIC", 55, 1.76, 70);

		

		personne tg = new personne("Thomas", "Georges", 35, 1.89, 75);

		

		personne mb = new personne("Mario", "BROS", 22, 1.50, 60);
		
		personne [] personnes = {jj,je,tg,mb};
		
		request.setAttribute("personnes", personnes);

	

		

		this.getServletContext()

		.getRequestDispatcher("/WEB-INF/pages/accueil.jsp")

		.forward(request, response);

	}
		
		
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
