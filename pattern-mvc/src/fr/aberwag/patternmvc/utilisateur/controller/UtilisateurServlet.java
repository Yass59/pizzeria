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
 * Servlet implementation class UtilisateurServlet
 */
@WebServlet("/Utilisateur")
public class UtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       UtilisateurBusiness utilisateur =
    		   new UtilisateurBusiness();

     

     
       

       protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	   ArrayList<Utilisateurs> utilisateurs = 
    			   utilisateur.getUtilisateurs();
    	   request.setAttribute("utilisateur", utilisateurs);
    	   
    	   
    	   
    	   
    	   
    	   
    	   

    	   this.getServletContext()
    	   .getRequestDispatcher("/WEB-INF/pages/utilisateur/Utilisateur.jsp")
    	   .forward(request, response);
       }


       protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	   doGet(request, response);
	}

}
