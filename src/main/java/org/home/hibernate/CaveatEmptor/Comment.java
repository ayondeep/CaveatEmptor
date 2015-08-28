package org.home.hibernate.CaveatEmptor;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Test Comment
@Entity
@Table(name="COMMENT")
public class Comment {

	long Id;
	Rating rating;
	String text;
	Calendar created;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return Id;
	}

	private void setId(long id) {
		Id = id;
	}
	public Rating getRating() {
		return rating;
	}
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Calendar getCreated() {
		return created;
	}
	public void setCreated(Calendar created) {
		this.created = created;
	}
	
	
}
