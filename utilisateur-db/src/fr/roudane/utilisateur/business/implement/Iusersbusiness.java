package fr.roudane.utilisateur.business.implement;

import java.util.ArrayList;

import fr.roudane.utilisateur.bean.UsersClass;

public interface Iusersbusiness {
	
	
	public ArrayList<UsersClass>getusers();
	
	public UsersClass getOne (int id);
	
	public void supprimerUtilisateur(int id);
	
	 public boolean ajouterUtilisateur(
			 
			String nom,
			String prenom,
			 int numero,
			 String phone,
			 String email,
			 String adresse,
			 String photo);
			 
			 
			 
			 public boolean ModifierUsers(
					 	int id,
						String nom,
						String prenom,
						 int numero,
						 String phone,
						 String email,
						 String adresse,
						 String photo	 
			 
			 
			 
			 );
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
