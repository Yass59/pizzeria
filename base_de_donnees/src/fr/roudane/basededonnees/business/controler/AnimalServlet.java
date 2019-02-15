package fr.roudane.basededonnees.business.controler;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.roudane.basededonnees.business.implement.AnimalBusiness;

/**
 * Servlet implementation class AnimalServlet
 */
@WebServlet("/AnimalServlet")
public class AnimalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	AnimalBusiness animalbz = new AnimalBusiness();
	
	
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		ArrayList<String> animal = animalbz.getAnimal() ;
		
		request.setAttribute("animal", animal);
		

		this.getServletContext()

		.getRequestDispatcher("/WEB-INF/pages/animal.jsp")

		.forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
