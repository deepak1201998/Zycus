package com.demo.entities;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long itemId;
	
	@NotNull()
	private String itemName;
	
	@NotNull()
	private String description;
	
	@OneToMany()
	private Set<Suppliers> suppliers;
	@ElementCollection
	Map<String, String> specifications = new HashMap<String, String>();
	
	
	public Item(Long itemId, @NotNull String itemName, @NotNull String description, Set<Suppliers> suppliers,
			Map<String, String> specifications) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.description = description;
		this.suppliers = suppliers;
		this.specifications = specifications;
	}


	public Long getItemId() {
		return itemId;
	}


	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Set<Suppliers> getSuppliers() {
		return suppliers;
	}


	public void setSuppliers(Set<Suppliers> suppliers) {
		this.suppliers = suppliers;
	}


	public Map<String, String> getSpecifications() {
		return specifications;
	}


	public void setSpecifications(Map<String, String> specifications) {
		this.specifications = specifications;
	}


	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", description=" + description + ", suppliers="
				+ suppliers + ", specifications=" + specifications + "]";
	}
	
	
	
	
	
	
	
	

}
