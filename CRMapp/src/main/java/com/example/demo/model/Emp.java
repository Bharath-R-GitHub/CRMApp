package com.example.demo.model;

public class Emp {
	private int eno;
	private String name;
	private String address;
	private String email;

	public Emp() {

	}

	public Emp(int eno, String name, String address, String email) {
		super();
		this.eno = eno;
		this.name = name;
		this.address = address;
		this.email = email;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
