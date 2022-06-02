package BaseAccountFinance.entities;

import java.util.*;

public class Account {
	public String accountNumber;
	public String AccountName;
	public String phoneNumber;
	public Date creationDate;
	public Date modificationDate;
	public double accountBalance;
	public String accountType;
	
	public Account(String accountName, String phoneNumber, Date creationDate,
			Date modificationDate, double accountBalance, String accountType) {
		
		AccountName = accountName;
		this.phoneNumber = phoneNumber;
		this.creationDate = creationDate;
		this.modificationDate = modificationDate;
		this.accountBalance = accountBalance;
		this.accountType = accountType;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", AccountName=" + AccountName + ", phoneNumber="
				+ phoneNumber + ", creationDate=" + creationDate + ", modificationDate=" + modificationDate
				+ ", accountBalance=" + accountBalance + ", accountType=" + accountType + "]";
	}

	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return AccountName;
	}
	public void setAccountName(String accountName) {
		AccountName = accountName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getModificationDate() {
		return modificationDate;
	}
	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	} 
	
	
	
}
