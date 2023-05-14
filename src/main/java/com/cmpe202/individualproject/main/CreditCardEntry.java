package com.cmpe202.individualproject.main;


import java.time.LocalDate;
import java.util.Date;

public class CreditCardEntry {
	
	String cardNumber;
	Date expirationDate;
	String nameOfCardholder;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getNameOfCardholder() {
		return nameOfCardholder;
	}

	public void setNameOfCardholder(String nameOfCardholder) {
		this.nameOfCardholder = nameOfCardholder;
	}



	public CreditCardEntry(String cardNumber, Date expirationDate, String nameOfCardholder) {
		// TODO Auto-generated constructor stub
		this.cardNumber = cardNumber;
		this.expirationDate =  expirationDate;
		this.nameOfCardholder = nameOfCardholder;
	}

	public CreditCardEntry(String cardNumber, String nameOfCardholder) {
		this.cardNumber = cardNumber;
		this.nameOfCardholder = nameOfCardholder;
	}
}
