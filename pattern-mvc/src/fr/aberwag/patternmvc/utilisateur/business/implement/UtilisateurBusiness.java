package fr.aberwag.patternmvc.utilisateur.business.implement;

import java.util.ArrayList;


import fr.aberwag.patternmvc.utilisateur.bean.Utilisateurs;
import fr.aberwag.patternmvc.utilisateur.business.implement.IUtilisateurBusiness;


public class UtilisateurBusiness implements IUtilisateurBusiness{

	@Override
	public ArrayList<Utilisateurs> getUtilisateurs() {
		
		Utilisateurs luffy =
				new Utilisateurs("luffy", "monkey", 15, "ressources/images/produits.jpg");

		
		
		
		
		
		
		
		
		
		
		

		ArrayList<Utilisateurs> listeUtilisateurs = 
				new ArrayList<>();
		listeUtilisateurs.add(luffy);
		
		return listeUtilisateurs;
	}

		
		
		
	}
	

	

