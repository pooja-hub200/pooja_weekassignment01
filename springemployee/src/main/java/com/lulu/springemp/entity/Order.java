package com.lulu.springemp.entity;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	float billamount;
	String address;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the billamount
	 */
	public float getBillamount() {
		return billamount;
	}

	/**
	 * @param billamount the billamount to set
	 */
	public void setBillamount(float billamount) {
		this.billamount = billamount;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", billamount=" + billamount + ", address=" + address + "]";
	}

	public Order(int id, String name, float billamount, String address) {
		super();
		this.id = id;
		this.name = name;
		this.billamount = billamount;
		this.address = address;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

}
