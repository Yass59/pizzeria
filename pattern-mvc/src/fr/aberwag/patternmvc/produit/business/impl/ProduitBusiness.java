package fr.aberwag.patternmvc.produit.business.impl;

import java.util.ArrayList;

import fr.aberwag.patternmvc.produit.bean.Produit;
import fr.aberwag.patternmvc.produit.business.IProduitBusiness;

public class ProduitBusiness implements IProduitBusiness {

	@Override
	public ArrayList<Produit> getProduits() {
		Produit axe = 
				new Produit(
						"AXE", 
						3.59, 
						"ressources/images/produit/axe.jpg",
						"https://www.axe.com/de/home.html"
						);
		Produit lait = 
				new Produit(
						"Lait", 
						0.75, 
						"ressources/images/produit/lait.jpg",
						"http://lactel.fr/"
						);
		Produit evian = 
				new Produit(
						"Evian", 
						1.05, 
						"ressources/images/produit/evian.jpg",
						"https://www.evian.fr/"
						);
		Produit lindt = 
				new Produit(
						"Lindt", 
						4.23, 
						"ressources/images/produit/lindt.jpg",
						"https://www.lindt.fr/"
						);
		Produit baguette = 
				new Produit(
						"Baguette", 
						0.99, 
						"ressources/images/produit/baguette.jpg",
						"http://www.marieblachere.com/"
						);
		Produit cristaline = 
				new Produit(
						"Cristaline", 
						0.45, 
						"ressources/images/produit/cristaline.jpg",
						"https://www.moneaucristaline.fr/"
						);
		Produit cafe = 
				new Produit(
						"Café", 
						3.65, 
						"ressources/images/produit/cafe.jpg",
						"https://www.nespresso.com/fr/fr/"
						);
		Produit the = 
				new Produit(
						"The", 
						2.33, 
						"ressources/images/produit/the.jpg",
						"https://www.lipton.com/fr/home.html"
						);
		
		ArrayList<Produit> listeProduits = 
				new ArrayList<>();
		listeProduits.add(axe);
		listeProduits.add(lait);
		listeProduits.add(baguette);
		listeProduits.add(lindt);
		listeProduits.add(cafe);
		listeProduits.add(the);
		listeProduits.add(cristaline);
		listeProduits.add(evian);
		
		return listeProduits;
	}

}
