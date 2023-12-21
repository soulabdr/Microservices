package com.EMSI.Voiture.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;
import lombok.Data;

@Entity
@Data
public class voiture {

	@Id
	@GeneratedValue
	private Long id;
	
	private String matricule;
	
	private String marque;
	
	private String model;
	
//	@Transient @ManyToOne
	private String client;


	public voiture() {
		super();
	}
	
	public voiture(Long id, String matricule, String marque, String model,String client) {
		super();
		this.id = id;
		this.matricule = matricule;
		this.marque = marque;
		this.model = model;
		this.client=client;
	}

	

	public voiture(String matricule, String marque, String model,String client) {
		super();
		this.matricule = matricule;
		this.marque = marque;
		this.model = model;
		this.client=client;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	
//	public Client getClient() {
//		return client;
//	}
//
//	public void setClient(Client client) {
//		this.client = client;
//	}
	
	
	
}
