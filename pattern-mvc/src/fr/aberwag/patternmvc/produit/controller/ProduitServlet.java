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
 * Servlet implementation class ProduitServlet
 */
@WebServlet("/produits")
public class ProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     ProduitBusiness produitBusiness = 
    		 new ProduitBusiness();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Produit> listeProduits = 
				produitBusiness.getProduits();
		
		request.setAttribute("produits", listeProduits);
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/produit/produits.jsp")
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
