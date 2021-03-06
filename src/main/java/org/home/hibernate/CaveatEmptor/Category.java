package org.home.hibernate.CaveatEmptor;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORY")
public class Category {

	
	long Id;
	String name;
	Category parentCategory;
	Set<Category> childCategories = new HashSet<Category>();
	Set<Item> items = new HashSet<Item>();

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return Id;
	}

	private void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}

	public Set<Category> getChildCategories() {
		return childCategories;
	}

	public void setChildCategories(Set<Category> childCategories) {
		this.childCategories = childCategories;
	}
	
	
	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	public void addChildCategory(Category childCategory) {
		if (childCategory == null) {
			throw new IllegalArgumentException("Null child category");
		}
		
		if (childCategory.getParentCategory() != null) {
			childCategory.getParentCategory().getChildCategories().remove(childCategory);
		}
		
		childCategory.setParentCategory(this);
		childCategories.add(childCategory);
	}
	
}
