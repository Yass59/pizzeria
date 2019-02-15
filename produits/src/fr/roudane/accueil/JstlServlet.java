package fr.roudane.accueil;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JstlServlet
 */
@WebServlet("/JstlServlet")
public class JstlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JstlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		ArrayList<String> villes =
				new ArrayList<>();
		
		villes.add("france");
		villes.add("espagne");
		villes.add("belgique");
		villes.add("canada");
		villes.add("maroc");
		villes.add("algerie");
		villes.add("japon");
		villes.add("turquie");
		villes.add("cap vert");
		
		
		
		request.setAttribute("villes", villes);
		
		
		
		
		
		
		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/jstl.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
