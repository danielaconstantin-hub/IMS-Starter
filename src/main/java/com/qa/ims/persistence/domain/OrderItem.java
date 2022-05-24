package com.qa.ims.persistence.domain;

public class OrderItem {
	private int orderItemID;
	private int id;
	private float cost;
	private String name;
	private  int itemID;
	public OrderItem(int orderItemID, float cost, String name, int itemID) {
		super();
		this.orderItemID = orderItemID;
		this.cost = cost;
		this.name = name;
		this.itemID = itemID;
	}
	public OrderItem(int orderItemID, int id, float cost, String name, int itemID) {
		super();
		this.orderItemID = orderItemID;
		this.id = id;
		this.cost = cost;
		this.name = name;
		this.itemID = itemID;
	}
	public int getOrderItemID() {
		return orderItemID;
	}
	public void setOrderItemID(int orderItemID) {
		this.orderItemID = orderItemID;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	
	
	
	
	

}
