package ma.ac.emi.ginfo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClientModel {
	public ClientModel( String nom_societe, String personne_contact, int tél, String mail) {
		super();
		
		this.nom_societe = nom_societe;
		this.personne_contact = personne_contact;
		this.tél = tél;
		this.mail = mail;
	}
	
	public ClientModel() {
		super();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id ;
	private String nom_societe;
	private String personne_contact;
	private int tél;
	private String mail;
	

	public String getNom_societe() {
		return nom_societe;
	}
	public void setNom_societe(String nom_societe) {
		this.nom_societe = nom_societe;
	}
	public String getPersonne_contact() {
		return personne_contact;
	}
	public void setPersonne_contact(String personne_contact) {
		this.personne_contact = personne_contact;
	}
	public int getTél() {
		return tél;
	}
	public void setTél(int tél) {
		this.tél = tél;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

}
