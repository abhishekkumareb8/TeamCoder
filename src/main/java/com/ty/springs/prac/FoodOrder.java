package com.ty.springs.prac;

public class FoodOrder {
	
	private int id;
	private String name;
	private long totelcost;
	private String hotel;
	private Customer customer;
	
	public FoodOrder(int id, String name, long totelcost, String hotel, Customer customer) {
		super();
		this.id = id;
		this.name = name;
		this.totelcost = totelcost;
		this.hotel = hotel;
		this.customer = customer;
	}
	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public long getTotelcost() {
		return totelcost;
	}

	public String getHotel() {
		return hotel;
	}

	public Customer getCustomer() {
		return customer;
	}

	
	

}
