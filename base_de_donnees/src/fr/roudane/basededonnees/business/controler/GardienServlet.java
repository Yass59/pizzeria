package fr.roudane.basededonnees.business.controler;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.roudane.basededonnees.bean.GardienClass;
import fr.roudane.basededonnees.business.implement.GardienBusiness;


@WebServlet("/Gardien")
public class GardienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	GardienBusiness gardienbz = new GardienBusiness();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		ArrayList<GardienClass> gardiens = gardienbz.recupelistegardien();


		request.setAttribute("gardiens", gardiens);





		this.getServletContext()

		.getRequestDispatcher("/WEB-INF/pages/gardien.jsp")

		.forward(request, response);



	}
















	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
