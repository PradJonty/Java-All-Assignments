package com.valtech.tx.entity;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="AllTx")
@DiscriminatorColumn(name="disc")
@DiscriminatorValue("tx")

public class Tx {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private float amount;
	private boolean debit;
	private LocalDate txTime;
	private long accountId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public boolean isDebit() {
		return debit;
	}
	public void setDebit(boolean debit) {
		this.debit = debit;
	}
	public LocalDate getTxTime() {
		return txTime;
	}
	public void setTxTime(LocalDate txTime) {
		this.txTime = txTime;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public Tx() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tx(long id, float amount, boolean debit, LocalDate txTime, long accountId) {
		super();
		this.id = id;
		this.amount = amount;
		this.debit = debit;
		this.txTime = txTime;
		this.accountId = accountId;
	}
	public Tx(float amount, boolean debit, LocalDate txTime, long accountId) {
		super();
		this.amount = amount;
		this.debit = debit;
		this.txTime = txTime;
		this.accountId = accountId;
	}
	
	
	
}
