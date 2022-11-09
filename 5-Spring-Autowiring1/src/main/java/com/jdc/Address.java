package com.jdc;

public class Address {
	
	private String landmark;
	private String city;
	private String country;
	
	@Override
	public String toString() {
		return "Address [landmark=" + landmark + ", city=" + city + ", country=" + country + "]";
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
