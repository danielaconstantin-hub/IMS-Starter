package com.qa.ims.persistence.domain;

public class Item {
	private int id;
	private float cost;
	private String name;
	public Item(float cost, String name) {
		super();
		this.cost = cost;
		this.name = name;
	}
	public Item(int id, float cost, String name) {
		super();
		this.id = id;
		this.cost = cost;
		this.name = name;
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
	@Override
	public String toString() {
		return "Item [id=" + id + ", cost=" + cost + ", name=" + name + "]";
	}
	
	
}
