package fr.roudane.basededonnees.business.implement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class AccueilBusiness implements IaccueuilBusiness{

	@Override
	public ArrayList<String> gtVille() {
	
		ArrayList<String> villes = new ArrayList<>();
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/jee", "root", "");
					
					
				Statement sm = cnx.createStatement();
				
				ResultSet resultat =
						sm.executeQuery("select nom from ville");
					
		       
				
				while (resultat.next()) {
						String nomVille = resultat.getString("nom");
						
						villes.add(nomVille);
						
					}
							
						
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		return villes;
	}

}
