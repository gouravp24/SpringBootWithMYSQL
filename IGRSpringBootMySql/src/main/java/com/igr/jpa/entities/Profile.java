package com.igr.jpa.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Profile {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String address;
	private String phoneNumber;
// one profile is with one user && mapped with same of the profile (same table ni join kel tyana)
//	@JsonBackReference  it indecate that we go with backword ly
	@OneToOne(mappedBy = "profile")
	@JsonBackReference
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profile(int id, String address, String phoneNumber, User user) {
		super();
		this.id = id;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Profile [id=" + id + ", address=" + address + ", phoneNumber=" + phoneNumber + ", user=" + user + "]";
	}

}
