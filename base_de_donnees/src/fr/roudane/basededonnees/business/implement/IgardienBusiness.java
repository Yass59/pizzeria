package fr.roudane.basededonnees.business.implement;

import java.util.ArrayList;

import fr.roudane.basededonnees.bean.GardienClass;

public interface IgardienBusiness {

	
	public ArrayList<GardienClass> recupelistegardien();

	public GardienClass findOneByNumero(int numero);
	
}