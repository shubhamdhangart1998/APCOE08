package com.tnsif.dayfive.multilevelinheritance;


//Parent class
public class Country {

	//data members
	
	private String countryName;
	private String currency;
	private String capital;
	private int code;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", currency=" + currency + ", capital=" + capital + ", code="
				+ code + "]";
	}
	
	
	
	
	
	
	
}
