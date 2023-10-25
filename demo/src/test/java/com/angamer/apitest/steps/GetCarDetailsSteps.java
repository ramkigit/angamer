package com.angamer.apitest.steps;

import org.testng.Assert;

import com.angamer.apitest.utils.data.CarDetails;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;

public class GetCarDetailsSteps {
	String url;
	// CarsResponse response;
	CarDetails[] details;
	Response response;
	Response resp;
	String carType;
	
	@Given("{string} is used as a query parameter")
	public void userPerformsGetCallOnTheGetDetailsApiEndpoint(String carType) {
		this.url = String.format("http://localhost:54356/api/cars/%s",carType);
		this.carType = carType;
	}

	@Given("user performs get call on the get details api endpoint")
	public void passesTheValidCarTypeAsPartOfTheUrl() {
		RestAssured.defaultParser = Parser.JSON; //Could be setup as part of hooks
		this.response = RestAssured.get(this.url);
	}

	@Then("relevant car details must be returned successfully as response")
	public void theRelevantCarDetailsMustBeReturnedSuccessfully() {
		this.details = RestAssured.get(this.url).body().as(CarDetails[].class);
		System.out.println("= = =");
		System.out.printf("Total number of cars for Car Type: %s is Number: %d",carType,details.length);
		System.out.println("");
		Assert.assertEquals(response.getStatusCode(),200);		
		for(CarDetails car:details) {
			System.out.println("Checking details of car : "+ car.toString());			
			Assert.assertEquals(car.getType().toLowerCase(),this.carType.toLowerCase());		
			Assert.assertTrue(car.getModel().length() > 0);
			Assert.assertTrue(car.getZeroToSixty() > 0);
			Assert.assertTrue(car.getMake().length() > 0);
			Assert.assertTrue(car.getYear().length() > 0);
			Assert.assertTrue(car.getPrice() > 1000);
		}
	}
	
	@But("no car details should not be displayed with status 404")
	public void noCarDetailsShouldBeDisplayedWith() {
		Assert.assertEquals(response.getStatusCode(),404);
	}
}
