package com.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
//@Inheritance(strategy = InheritanceType.JOINED)
public class Item {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;

	@Column(length = 100)
	protected String title;

	@Column(length = 3000)
	protected String description;

	@Column(name = "unit_cost")
	protected Float unitCost;

	public Item() {
		super();
	}

	public Item(String title, String description, Float unitCost) {
		super();
		this.title = title;
		this.description = description;
		this.unitCost = unitCost;
	}

	public Item(Long id, String title, String description, Float unitCost) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.unitCost = unitCost;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(Float unitCost) {
		this.unitCost = unitCost;
	}
	

}
