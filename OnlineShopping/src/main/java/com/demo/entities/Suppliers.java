package com.demo.entities;

public class Suppliers {
	
	private String supplierName;
	private double itemPrice;
	
	
	public Suppliers(String supplierName, double itemPrice) {
		super();
		this.supplierName = supplierName;
		this.itemPrice = itemPrice;
	}


	public String getSupplierName() {
		return supplierName;
	}


	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}


	public double getItemPrice() {
		return itemPrice;
	}


	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}


	@Override
	public String toString() {
		return "Suppliers [supplierName=" + supplierName + ", itemPrice=" + itemPrice + "]";
	}
	
	
	

	
	
}
