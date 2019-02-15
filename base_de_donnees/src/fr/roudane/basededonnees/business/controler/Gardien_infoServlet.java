package fr.roudane.basededonnees.business.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.roudane.basededonnees.bean.GardienClass;
import fr.roudane.basededonnees.business.implement.GardienBusiness;

/**
 * Servlet implementation class Gardien_infoServlet
 */
@WebServlet("/Gardien_info")
public class Gardien_infoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 GardienBusiness gardeBz = new GardienBusiness();
	 
	 
	 
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		


		String numeroString = request.getParameter("numero");

		int n = Integer.parseInt(numeroString);

		

		GardienClass gardienRecupDepuisLebusiness =  gardeBz.findOneByNumero(n);
		

		request.setAttribute("gardien", gardienRecupDepuisLebusiness);

		

		this.getServletContext().

		getRequestDispatcher("/WEB-INF/pages/gardien-infos.jsp")

		.forward(request, response);
		
		
		
		
		
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		
		
		
		doGet(request, response);
	}

}
