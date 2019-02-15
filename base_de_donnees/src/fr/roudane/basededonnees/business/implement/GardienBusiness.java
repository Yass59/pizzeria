package fr.roudane.basededonnees.business.implement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.roudane.basededonnees.bean.GardienClass;

public class GardienBusiness implements IgardienBusiness {
	
	@Override
	public ArrayList<GardienClass> recupelistegardien() {
		
		ArrayList<GardienClass> recupgardien = new ArrayList<>();
	
		try {



			Class.forName("org.mariadb.jdbc.Driver");



			Connection cnx = DriverManager.getConnection(

					"jdbc:mariadb://localhost:3306/gardien", "root", "");

			Statement st = cnx.createStatement();

			

			ResultSet resultat = 

					st.executeQuery("SELECT nom, prenom, age , numero, urlimage FROM gardiens");
		


			while (resultat.next()) {

				String nomgardien = resultat.getString("nom");
				String prenomgardien = resultat.getString("prenom");
				int agegardien = resultat.getInt("age");
				int numerogardien = resultat.getInt("numero");
				String urlgardien = resultat.getString ("urlimage");
				
				GardienClass gardien  = new GardienClass(nomgardien, prenomgardien, numerogardien, agegardien, urlgardien);
				recupgardien.add(gardien);
				
			}

		} catch (Exception e) {

			e.printStackTrace();

		}

		return recupgardien;

	}

	@Override
	public GardienClass findOneByNumero(int numero) {

		
		
		
		
		try {

			Class.forName("org.mariadb.jdbc.Driver");

			

			Connection nx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gardien", "root", "");

			

			Statement st = nx.createStatement();

			

			ResultSet resultat = st.executeQuery(

					

	"SELECT nom, prenom, age, numero, urlImage FROM gardien WHERE numero = " + numero);

			

			while (resultat.next()) {

				String nomGardien = resultat.getString("nom");

				String prenomGardien = resultat.getString("prenom");

				int ageGardien = resultat.getInt("age");

				int numeroGardien = resultat.getInt("numero");

				String urlImage = resultat.getString("urlImage");

				

				GardienClass g = new GardienClass(nomGardien, prenomGardien, numeroGardien, ageGardien, urlImage);

				return g;

			}

		

		} catch (Exception e) {

			e.printStackTrace();

		}
		return null;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	