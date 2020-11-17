package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class CD extends Item {
	
	

	@Column(name = "total_duration")
	private Float totalDuration;

	private String genre;

	public CD() {
		super();
	}

	public CD(String title, String description, Float unitCost, Float totalDuration, String genre) {
		super(title, description, unitCost);
		
		this.totalDuration = totalDuration;
		this.genre = genre;
	}

	public CD(Long id, String title, String description, Float unitCost, Float totalDuration, String genre) {
		super(id, title, description, unitCost);
		
		this.totalDuration = totalDuration;
		this.genre = genre;
	}

	

	public Float getTotalDuration() {
		return totalDuration;
	}

	public void setTotalDuration(Float totalDuration) {
		this.totalDuration = totalDuration;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "\n\tCD [id=" + id + ", title=" + title + ", description=" + description + ", unitCost=" + unitCost
				+ ", totalDuration=" + totalDuration + ", genre=" + genre + "]";
	}
	
}
