package org.home.hibernate.CaveatEmptor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BILLINGDETAILS")
public class BillingDetails {

	long Id;
	String ownerName;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return Id;
	}

	private void setId(long id) {
		Id = id;
	}
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	
}

