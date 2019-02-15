package fr.aberwag.patternmvc.utilisateur.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.aberwag.patternmvc.utilisateur.bean.Utilisateurs;
import fr.aberwag.patternmvc.utilisateur.business.implement.UtilisateurBusiness;

/**
 * Servlet implementation class UtilisateurInfoServlet
 */
@WebServlet("/UtilisateurInfoServlet")
public class UtilisateurInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
        UtilisateurBusiness utilisateurinfo =
     		new UtilisateurBusiness();
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String iString = request.getParameter("i");

		int i = Integer.parseInt(iString);
		

		 ArrayList<Utilisateurs> listeUtilisateurs = 
 			   utilisateurinfo.getUtilisateurs();
		
		Utilisateurs utilisateur =listeUtilisateurs.get(i);
		
		request.setAttribute("utilisateur", utilisateur);


		this.getServletContext()

		.getRequestDispatcher("/WEB-INF/pages/utilisateur/Utilisateurinfo.jsp")

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
