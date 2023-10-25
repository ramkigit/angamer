package com.angamer.apitest.utils.data;

import java.util.List;

public class CarsResponse {
	private List<CarDetails> carList;
	public CarsResponse() {
		
	}
	public List<CarDetails> getCarList() {
		return carList;
	}
	public void setCarList(List<CarDetails> carList) {
		this.carList = carList;
	}
}
