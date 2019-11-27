package com.adminportal.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ShippingAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String ShippingAddressname;
	private String ShippingAddressStreet1;
	private String ShippingAddressStreet2;
	private String ShippingAddressCity;
	private String ShippingAddressState;
	private String ShippingAddressCountry;
	private String ShippingAddressZipCode;
	private boolean ShippingAddressDefault;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getShippingAddressname() {
		return ShippingAddressname;
	}

	public void setShippingAddressname(String ShippingAddressname) {
		this.ShippingAddressname = ShippingAddressname;
	}

	public String getShippingAddressStreet1() {
		return ShippingAddressStreet1;
	}

	public void setShippingAddressStreet1(String ShippingAddressStreet1) {
		this.ShippingAddressStreet1 = ShippingAddressStreet1;
	}

	public String getShippingAddressStreet2() {
		return ShippingAddressStreet2;
	}

	public void setShippingAddressStreet2(String ShippingAddressStreet2) {
		this.ShippingAddressStreet2 = ShippingAddressStreet2;
	}

	public String getShippingAddressCity() {
		return ShippingAddressCity;
	}

	public void setShippingAddressCity(String ShippingAddressCity) {
		this.ShippingAddressCity = ShippingAddressCity;
	}

	public String getShippingAddressState() {
		return ShippingAddressState;
	}

	public void setShippingAddressState(String ShippingAddressState) {
		this.ShippingAddressState = ShippingAddressState;
	}

	public String getShippingAddressCountry() {
		return ShippingAddressCountry;
	}

	public void setShippingAddressCountry(String ShippingAddressCountry) {
		this.ShippingAddressCountry = ShippingAddressCountry;
	}

	public String getShippingAddressZipCode() {
		return ShippingAddressZipCode;
	}

	public void setShippingAddressZipCode(String ShippingAddressZipCode) {
		this.ShippingAddressZipCode = ShippingAddressZipCode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isShippingAddressDefault() {
		return ShippingAddressDefault;
	}

	public void setShippingAddressDefault(boolean ShippingAddressDefault) {
		this.ShippingAddressDefault = ShippingAddressDefault;
	}
	
	
}
