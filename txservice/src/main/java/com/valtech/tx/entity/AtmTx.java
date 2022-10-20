package com.valtech.tx.entity;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("atx")
public class AtmTx extends Tx {

	private int atmNo;
	private String location;
	public int getAtmNo() {
		return atmNo;
	}
	public void setAtmNo(int atmNo) {
		this.atmNo = atmNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public AtmTx() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AtmTx(int atmNo, String location) {
		super();
		this.atmNo = atmNo;
		this.location = location;
	}
	
}
