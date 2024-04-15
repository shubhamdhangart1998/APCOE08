package com.tnsif.dayfive.multilevelinheritance;


//child of state 
public class City extends State {
	
	//data members
	
	private String cityName;
	private float area;
	private double population;
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public double getPopulation() {
		return population;
	}
	public void setPopulation(double population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", area=" + area + ", population=" + population + ", getStateName()="
				+ getStateName() + ", getLanguage()=" + getLanguage() + ", toString()=" + super.toString()
				+ ", getCountryName()=" + getCountryName() + ", getCurrency()=" + getCurrency() + ", getCapital()="
				+ getCapital() + ", getCode()=" + getCode() + "]";
	}
	

}
