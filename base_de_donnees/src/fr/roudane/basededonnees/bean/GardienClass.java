package fr.roudane.basededonnees.bean;

public class GardienClass {


	private String nom ;

	private String prenom;

	private Integer numero;
	
	private Integer age;
	
	
	private String Urlimage;


	public GardienClass(String nom, String prenom, Integer numero, Integer age, String urlimage) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numero = numero;
		this.age = age;
		this.Urlimage = urlimage;
	}


	public GardienClass() {
		super();
		
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getUrlimage() {
		return Urlimage;
	}


	public void setUrlimage(String urlimage) {
		Urlimage = urlimage;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
