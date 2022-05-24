package com.qa.ims.persistence.domain;

public class Order {
 private int orderItemID;
 private int customerID;
public Order(int orderItemID, int customerID) {
	super();
	this.orderItemID = orderItemID;
	this.customerID = customerID;
}
public int getOrderItemID() {
	return orderItemID;
}
public void setOrderItemID(int orderItemID) {
	this.orderItemID = orderItemID;
}
public int getCustomerID() {
	return customerID;
}
public void setCustomerID(int customerID) {
	this.customerID = customerID;
}
 
 
}
