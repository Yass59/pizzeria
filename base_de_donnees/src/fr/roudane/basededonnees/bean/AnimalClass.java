package fr.roudane.basededonnees.bean;

public class AnimalClass {
	
	private String nom ;

	private String type;

	private Integer espDeVie;

	public AnimalClass(String nom, String type, Integer espDeVie) {
		super();
		this.nom = nom;
		this.type = type;
		this.espDeVie = espDeVie;
	}

	public AnimalClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getEspDeVie() {
		return espDeVie;
	}

	public void setEspDeVie(Integer espDeVie) {
		this.espDeVie = espDeVie;
	}
	
	
	
	
	
	
	

}
