package com.igr.jpa.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	@Id
	private int id;
	private String name;
	private String city;
	//onetoone annotation is use for mapp wirh one user to one profile
	//@JsonManagedReference  this use for going parent to child (User to profile)
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private Profile profile;

	public User(int id, String name, String city, Profile profile) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.profile = profile;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + ", profile=" + profile + "]";
	}

}
