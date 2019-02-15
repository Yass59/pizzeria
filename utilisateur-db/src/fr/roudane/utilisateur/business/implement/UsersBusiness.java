package fr.roudane.utilisateur.business.implement;

import java.util.ArrayList;

import fr.roudane.utilisateur.bean.UsersClass;
import fr.roudane.utilisateur.repository.impl.UtilisateurRepositoryimpl;

public class UsersBusiness implements Iusersbusiness{
UtilisateurRepositoryimpl Users = new UtilisateurRepositoryimpl();
	@Override
	public ArrayList<UsersClass> getusers() {
		ArrayList<UsersClass>liste=Users.findAll();
		return liste;
	}

	@Override
	public UsersClass getOne(int id) {
		
		UsersClass user = Users.getOne(id);
		
		return user;
	}

	@Override
	public void supprimerUtilisateur(int id) {

		Users.supprimerUtilisateur(id);
	}

	@Override
	public boolean ajouterUtilisateur(String nom, String prenom, int numero, String phone, String email, String adresse,
			String photo) {
		
		
		boolean b = Users.ajouterUtilisateur(nom, prenom, numero, phone, email, adresse, photo);

		return b;
		
	}

	@Override
	public boolean ModifierUsers(int id, String nom, String prenom, int numero, String phone, String email,
			String adresse, String photo) {
		
		

		boolean m = Users.ModifierUsers(id, nom, prenom, numero, phone, email, adresse, photo);
		return m;
		

	
	}

	

		
}
	
