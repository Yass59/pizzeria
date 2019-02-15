package fr.aberwag.patternmvc.produit.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.aberwag.patternmvc.produit.bean.Produit;
import fr.aberwag.patternmvc.produit.business.impl.ProduitBusiness;

/**
 * Servlet implementation class ProduitInfos
 */
@WebServlet("/produit-infos" )
public class ProduitInfosServlet extends HttpServlet {
	ProduitBusiness produitBZ = 

			new ProduitBusiness();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String iString = request.getParameter("i");

		int i = Integer.parseInt(iString);

		

		ArrayList<Produit> listeProduits = 

				produitBZ.getProduits();

		

		Produit p = listeProduits.get(i);

		

		request.setAttribute("produit", p);

		

		this.getServletContext()

		.getRequestDispatcher("/WEB-INF/pages/produit/produit-infos.jsp")

		.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
