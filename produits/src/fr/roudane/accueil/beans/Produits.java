package fr.roudane.accueil.beans;

public class Produits {
	
	private String nom;

    private Double prix;

    private String lien;

    private String images;

	public Produits(String nom, Double prix, String lien, String images) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.lien = lien;
		this.images = images;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public String getLien() {
		return lien;
	}

	public void setLien(String lien) {
		this.lien = lien;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public Produits() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	

}
