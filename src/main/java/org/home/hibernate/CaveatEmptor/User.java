package org.home.hibernate.CaveatEmptor;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User implements Serializable{

	long Id;
	String firstName;
	String lastName;
	String userName;
	String password;
	String email;
	Integer ranking;
	Boolean admin;
	
	@Embedded
	Address address;
	
	public User() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	public long getId() {
		return Id;
	}
	private void setId(long id) {
		Id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getRanking() {
		return ranking;
	}
	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}
	public Boolean getAdmin() {
		return admin;
	}
	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public BigDecimal calcShippingCosts(Address fromLocation) {
		
		throw new RuntimeException("Method not implmented");
	}
	
}
