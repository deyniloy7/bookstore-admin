package com.adminportal.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BillingAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	private String BillingAddressname;
	private String BillingAddressStreet1;
	private String BillingAddressStreet2;
	private String BillingAddressCity;
	private String BillingAddressState;
	private String BillingAddressCountry;
	private String BillingAddressZipCode;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Order order;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getBillingAddressname() {
		return BillingAddressname;
	}

	public void setBillingAddressname(String BillingAddressname) {
		this.BillingAddressname = BillingAddressname;
	}

	public String getBillingAddressStreet1() {
		return BillingAddressStreet1;
	}

	public void setBillingAddressStreet1(String BillingAddressStreet1) {
		this.BillingAddressStreet1 = BillingAddressStreet1;
	}

	public String getBillingAddressStreet2() {
		return BillingAddressStreet2;
	}

	public void setBillingAddressStreet2(String BillingAddressStreet2) {
		this.BillingAddressStreet2 = BillingAddressStreet2;
	}

	public String getBillingAddressCity() {
		return BillingAddressCity;
	}

	public void setBillingAddressCity(String BillingAddressCity) {
		this.BillingAddressCity = BillingAddressCity;
	}

	public String getBillingAddressState() {
		return BillingAddressState;
	}

	public void setBillingAddressState(String BillingAddressState) {
		this.BillingAddressState = BillingAddressState;
	}

	public String getBillingAddressCountry() {
		return BillingAddressCountry;
	}

	public void setBillingAddressCountry(String BillingAddressCountry) {
		this.BillingAddressCountry = BillingAddressCountry;
	}

	public String getBillingAddressZipCode() {
		return BillingAddressZipCode;
	}

	public void setBillingAddressZipCode(String BillingAddressZipCode) {
		this.BillingAddressZipCode = BillingAddressZipCode;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}
