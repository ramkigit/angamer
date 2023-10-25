package com.angamer.apitest.utils.data;

public class CarDetails {
	@Override
	public String toString() {
		return "CarDetails [make=" + make + ", model=" + model + ", year=" + year + ", type=" + type + ", zeroToSixty="
				+ zeroToSixty + ", price=" + price + "]";
	}

	String make; // "Toyota",
	String model; //"Land Cruiser",
	String year; //"2018",
	String type; //"Suv",
	double zeroToSixty;  //12,
	double price; //45000
	
	public CarDetails() {
		
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getZeroToSixty() {
		return zeroToSixty;
	}

	public void setZeroToSixty(double zeroToSixty) {
		this.zeroToSixty = zeroToSixty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
