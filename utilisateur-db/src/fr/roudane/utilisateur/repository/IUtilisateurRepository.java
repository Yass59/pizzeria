package fr.roudane.utilisateur.repository;

import java.util.ArrayList;

import fr.roudane.utilisateur.bean.UsersClass;

public interface IUtilisateurRepository {

	

	public ArrayList<UsersClass> findAll();
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
