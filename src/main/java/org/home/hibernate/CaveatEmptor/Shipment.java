package org.home.hibernate.CaveatEmptor;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SHIPMENT")
public class Shipment {

	long Id;
	Integer inspectionPeriodDays;
	ShipmentState state;
	Calendar created;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	public long getId() {
		return Id;
	}
	private void setId(long id) {
		Id = id;
	}
	public Integer getInspectionPeriodDays() {
		return inspectionPeriodDays;
	}
	public void setInspectionPeriodDays(Integer inspectionPeriodDays) {
		this.inspectionPeriodDays = inspectionPeriodDays;
	}
	public ShipmentState getState() {
		return state;
	}
	public void setState(ShipmentState state) {
		this.state = state;
	}
	public Calendar getCreated() {
		return created;
	}
	public void setCreated(Calendar created) {
		this.created = created;
	}
	
	
}
