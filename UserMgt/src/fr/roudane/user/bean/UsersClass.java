package fr.roudane.user.bean;

public class UsersClass {

	
	
	
	
	
	
private String nom;
	
	private String prenom;
	
	private String urlImage;

	private int age;

	public UsersClass(String nom, String prenom, String urlImage, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.urlImage = urlImage;
		this.age = age;
	}

	public UsersClass() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
