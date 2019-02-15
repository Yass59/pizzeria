package fr.roudane.accueil;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ArrayListTestServlet
 */
@WebServlet("/ArrayListTestServlet")
public class ArrayListTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArrayListTestServlet() {
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
		
		
		
		
		
		villes.set(1, "Belgium");

		

		if(villes.contains("france")) {

			System.out.println("Vive Lille");

		}

		

		if(villes.contains("espagne")) {

			System.out.println("Madrid");

		}

		
		
		System.out.println("taille de mon tableau: " + villes.size());
		System.out.println("le pays numero 2 est: " + villes.get(5));
		
		request.setAttribute("villes", villes);
		 villes.remove("algerie");
			
		
		 
			
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/arraylist.jsp").forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
