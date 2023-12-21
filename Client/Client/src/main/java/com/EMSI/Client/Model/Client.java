package com.EMSI.Client.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor 
public class Client {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nom;
	
	private int age;

	public Client() {
		super();
	}
	
	public Client(Long id, String nom, int age) {
		super();
		this.id = id;
		this.nom = nom;
		this.age = age;
	}

	public Client(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	
}
