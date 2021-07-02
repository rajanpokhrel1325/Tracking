package com.pack.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tracking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "sender")
	private String sender;

	@Column(name = "receiver")
	private String reveiver;

	@Column(name = "address")
	private String address;

	// Default Constructor
	public Tracking() {
	}

	// Constructor with parameters
	public Tracking(int id, String sender, String reveiver, String address) {
		this.id = id;
		this.sender = sender;
		this.reveiver = reveiver;
		this.address = address;
	}

	// Getters for the fields.
	public int getId() {
		return id;
	}

	public String getSender() {
		return sender;
	}

	public String getReveiver() {
		return reveiver;
	}

	public String getAddress() {
		return address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public void setReveiver(String reveiver) {
		this.reveiver = reveiver;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
