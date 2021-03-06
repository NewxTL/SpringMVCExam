package com.yq.entity;

import java.util.Date;

public class Customer extends IDEntity {

	private int customer_id;
	private String first_name;
	private String last_name;
	private String email;
	private int address_id;
	private Date create_date;
	
	public Customer (int customer_id,String first_name,String last_name ,String email,int address_id,Date create_date) {
		  this.customer_id = customer_id;
		  this.first_name = first_name;
		  this.last_name = last_name;
		  this.email = email;
		  this.address_id = address_id;
		  this.create_date = create_date;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	@Override
	public String toString() {
		return "Customer [first_name=" + first_name + ", id=" + id + "]";
	}

}
