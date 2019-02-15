package fr.aberwag.site;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Inscription_Servlet
 */
public class Inscription_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inscription_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/Inscription.jsp")
		.forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

 	String Civilite = request.getParameter("Civilite");

		
		String nom = request.getParameter("nom");

		String prenom = request.getParameter("prenom");

		String date_naissance = request.getParameter("date_naissance");

		String numero_rue = request.getParameter("numero_rue");

		String ville = request.getParameter("ville");

		String Departement = request.getParameter("Departement");

		String Pays = request.getParameter("Pays");

		String telephone = request.getParameter("telephone");

		String email = request.getParameter("email");

		String commentaires = request.getParameter("commentaires");

		

		

		request.setAttribute("Civilite", Civilite);

		request.setAttribute("nom", nom);

		request.setAttribute("prenom", prenom);

		request.setAttribute("date_naissance", date_naissance);

		request.setAttribute("numero_rue", numero_rue);

		request.setAttribute("ville", ville);

		request.setAttribute("Departement", Departement);

		request.setAttribute("Pays", Pays);

		request.setAttribute("telephone", telephone);

		request.setAttribute("email", email);

		request.setAttribute("commentaires", commentaires);
		
	

	

		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/Inscription-ok.jsp")
		.forward(request, response);
		
		
		
	}

}
