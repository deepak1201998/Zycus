package com.entities;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Book  extends Item{
	
	

	@Column(length = 15)
	private String isbn;

	@Column(name = "nb_of_pages")
	private Integer nbOfPage;

	@Column(name = "publication_date")
	private LocalDate publicationDate;
	
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Author> authors;

	public Book() {
		super();
	}

	public Book(String title, String description, Float unitCost, String isbn, Integer nbOfPage,
			LocalDate publicationDate,Set<Author> authors ){
		super(title, description, unitCost);
		
		this.isbn = isbn;
		this.nbOfPage = nbOfPage;
		this.publicationDate = publicationDate;
		this.authors = authors;
	}

	public Book(Long id, String title, String description, Float unitCost, String isbn, Integer nbOfPage,
			LocalDate publicationDate, Set<Author> authors) {
		super(id, title, description, unitCost);
		this.isbn = isbn;
		this.nbOfPage = nbOfPage;
		this.publicationDate = publicationDate;
		this.authors = authors;
	}

	

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getNbOfPage() {
		return nbOfPage;
	}

	public void setNbOfPage(Integer nbOfPage) {
		this.nbOfPage = nbOfPage;
	}

	public LocalDate getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(LocalDate publicationDate) {
		this.publicationDate = publicationDate;
		
		
	}
	
	
	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", nbOfPage=" + nbOfPage + ", publicationDate=" + publicationDate + ", authors="
				+ authors + "]";
	}

	

	

	
   
	
	
	

	

	
	


}
