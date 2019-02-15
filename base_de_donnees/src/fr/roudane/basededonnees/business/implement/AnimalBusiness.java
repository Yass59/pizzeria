package fr.roudane.basededonnees.business.implement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class AnimalBusiness implements IanimalBusiness {

	@Override
	public ArrayList<String> getAnimal() {
		
		ArrayList<String> animal = new ArrayList<>();
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/zoo", "root", "");
					
					
				Statement sm = cnx.createStatement();
				
				ResultSet resultat =
						sm.executeQuery("select nom from felin");
					
		       
				
				while (resultat.next()) {
						String nomanimal = resultat.getString("nom");
						
						animal.add(nomanimal);
						
					}
							
						
				
				
				
				
				
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		return animal;
	}

}
