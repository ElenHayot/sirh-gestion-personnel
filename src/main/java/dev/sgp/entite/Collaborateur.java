package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {

	private int cpt = -1;
	private String matricule = "M" + cpt;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private String dateNaissanceS;
	private String adresse;
	private String numeroSecu;
	private String emailPro;
	private String photo;
	private ZonedDateTime dateHCreation;
	private Boolean actif;
	
	public Collaborateur() {
		super();
	}
	
	
	public Collaborateur(String nom, String prenom, LocalDate dateNaissance, String adresse, String numeroSecu) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.numeroSecu = numeroSecu;
	}

	public String toString(){
		String string = this.getNom() +", " + this.getPrenom();
		return string;
		
	}

	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.cpt ++;
		this.matricule = matricule;
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
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNumeroSecu() {
		return numeroSecu;
	}
	public void setNumeroSecu(String numeroSecu) {
		this.numeroSecu = numeroSecu;
	}
	public String getEmailPro() {
		return emailPro;
	}
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public ZonedDateTime getDateHCreation() {
		return dateHCreation;
	}
	public void setDateHCreation(ZonedDateTime dateHCreation) {
		this.dateHCreation = dateHCreation;
	}
	public Boolean getActif() {
		return actif;
	}
	public void setActif(Boolean actif) {
		this.actif = actif;
	}


	public String getDateNaissanceS() {
		return dateNaissanceS;
	}


	public void setDateNaissanceS(String dateNaissanceS) {
		this.dateNaissanceS = dateNaissanceS;
	}
	
}
