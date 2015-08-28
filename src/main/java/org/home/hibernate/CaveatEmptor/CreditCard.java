package org.home.hibernate.CaveatEmptor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CREDITCARD")
public class CreditCard {

	long Id;
	CreditCardType type;
	String number;
	String expMonth;
	String expYear;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return Id;
	}

	private void setId(long id) {
		Id = id;
	}
	public CreditCardType getType() {
		return type;
	}
	public void setType(CreditCardType type) {
		this.type = type;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getExpMonth() {
		return expMonth;
	}
	public void setExpMonth(String expMonth) {
		this.expMonth = expMonth;
	}
	public String getExpYear() {
		return expYear;
	}
	public void setExpYear(String expYear) {
		this.expYear = expYear;
	}
	
	
}
