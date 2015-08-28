package org.home.hibernate.CaveatEmptor;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM")
public class Item {

	long Id;
	String name;
	String description;
	BigDecimal initialPrice;
	BigDecimal reserverPrice;
	Calendar startDate;
	Calendar endDate;
	ItemState state;
	Calendar approvalDateTime;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return Id;
	}

	private void setId(long id) {
		Id = id;
	}
	
	Set<Category> categories = new HashSet<Category>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getInitialPrice() {
		return initialPrice;
	}
	public void setInitialPrice(BigDecimal initialPrice) {
		this.initialPrice = initialPrice;
	}
	public BigDecimal getReserverPrice() {
		return reserverPrice;
	}
	public void setReserverPrice(BigDecimal reserverPrice) {
		this.reserverPrice = reserverPrice;
	}
	public Calendar getStartDate() {
		return startDate;
	}
	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}
	public Calendar getEndDate() {
		return endDate;
	}
	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}
	public ItemState getState() {
		return state;
	}
	public void setState(ItemState state) {
		this.state = state;
	}
	public Calendar getApprovalDateTime() {
		return approvalDateTime;
	}
	public void setApprovalDateTime(Calendar approvalDateTime) {
		this.approvalDateTime = approvalDateTime;
	}
	public Set<Category> getCategories() {
		return categories;
	}
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	
	public void addCategory(Category category) {
		if (category == null) {
			throw new IllegalArgumentException("Null category");
			
		}
		category.getItems().add(this);
		categories.add(category);
	}
	
}
