package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "ACCOUNT_TABLE")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_number")
	private int accountNumber;
	@Column(name = "account_holder_name")
	private String accountHolderName;
	@Column(name = "account_balance")
	private double accountBalance;
	@Column(name = "active_status")
	private boolean isActive;
	public Account(String accountHolderName, double accountBalance, boolean isActive) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.isActive = isActive;
	}
	
	

}
