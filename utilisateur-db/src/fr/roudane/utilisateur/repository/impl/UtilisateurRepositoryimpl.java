package fr.roudane.utilisateur.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.roudane.utilisateur.bean.UsersClass;
import fr.roudane.utilisateur.repository.IUtilisateurRepository;

public class UtilisateurRepositoryimpl implements IUtilisateurRepository{

	@Override
	public ArrayList<UsersClass> findAll() {
		
	
		ArrayList<UsersClass>Users1  = new ArrayList<>();
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/users", "root", "");
					
					
				Statement sm = cnx.createStatement();
				
				ResultSet resultat =
						sm.executeQuery("select nom, prenom, numero, email, photo, id, phone, adresse from utilisateur");
				
				
				while (resultat.next()) {
				
					
					String nomUsers = resultat.getString("nom");

					String prenomUsers = resultat.getString("prenom");

					int numerUsers = resultat.getInt("numero");

					String emailUsers = resultat.getString("email");

					String adresseUsers = resultat.getString("adresse");
					
					String photoUsers = resultat.getString("photo");
					
					int idUsers = resultat.getInt("id");

					String phoneUsers = resultat.getString("phone");
					
					UsersClass u = new UsersClass(idUsers, nomUsers, prenomUsers, numerUsers, phoneUsers, emailUsers, adresseUsers, photoUsers);

					Users1.add(u);

					
				}
				
				
				
				
				
		}catch (Exception e) {
			
		}
		

		return Users1;
	}

	@Override
	public UsersClass getOne(int id) {


		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/users", "root", "");
					
					
				Statement sm = cnx.createStatement();
				
				ResultSet resultat =
						sm.executeQuery("select id, nom, prenom, numero, email, photo, phone, adresse from utilisateur where id = " + id);
				
				
				while (resultat.next()) {
				
					
					String nomU = resultat.getString("nom");

					String prenomU = resultat.getString("prenom");

					int numerU = resultat.getInt("numero");

					String emailU = resultat.getString("email");

					String adresseU = resultat.getString("adresse");
					
					String photoU = resultat.getString("photo");
					
					int idU = resultat.getInt("id");

					String phoneU = resultat.getString("phone");
					
					UsersClass US = new UsersClass(idU, nomU, prenomU, numerU, phoneU, emailU, adresseU, photoU);

				return US;

					
				}
				
				
				
				
				
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		return null;
	}


	@Override
	public void supprimerUtilisateur(int id) {
try {
			
			
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/users", "root", "");
					
					
				Statement sm = cnx.createStatement();
			
			
				
				ResultSet resultat =
						sm.executeQuery("delete from utilisateur where id = " + id);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

		
	

	@Override
	public boolean ajouterUtilisateur(String nom, String prenom, int numero, String phone, String email, String adresse,
			String photo) {
try {
			
			
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/users", "root", "");
					
					
			PreparedStatement ps = cnx.prepareStatement("INSERT INTO Utilisateur (nom,prenom,numero,phone,email,adresse,photo) VALUES(?,?,?,?,?,?,?)");
			
				ps.setString(1, nom);
				ps.setString(2, prenom);
				ps.setInt(3, numero);
				ps.setString(4, phone);
				ps.setString(5, email);
				ps.setString(6, adresse);
				ps.setString(7, photo);
			
			
			ps.executeUpdate();
			
				
				return true;
				
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		
			
			
			
			
			
			
			
		
		
	}

		
	}

	@Override
	public boolean ModifierUsers(int id, String nom, String prenom, int numero, String phone, String email,
			String adresse, String photo) {
				
try {
			
			
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/users", "root", "");
					
					
			PreparedStatement ps = cnx.prepareStatement("UPDATE utilisateur SET nom = ?  ,  prenom = ?, numero = ? , phone = ? , email = ? , adresse =  ?, photo = ? WHERE id = ?");
					
				ps.setString(1, nom);
				ps.setString(2, prenom);
				ps.setInt(3, numero);
				ps.setString(4, phone);
				ps.setString(5, email);
				ps.setString(6, adresse);
				ps.setString(7, photo);
				ps.setInt(8, id);
			
			ps.executeUpdate();
			
				
				return true;
				
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;

		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}



















