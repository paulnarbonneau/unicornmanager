/**
 * 
 */
package com.assu.techweek.unicornmanager.unicorn.model;

import java.io.Serializable;

/**
 * @author x738235
 *
 */
public class Unicorn implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1163176647777389149L;
	
	private long id;

	private String nom;
	
	private String couleur;
	
	private int age;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
