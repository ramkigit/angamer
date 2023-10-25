package com.angamer.uitests.hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.angamer.uitests.pages.PageContext;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	private PageContext context;

	public Hooks(PageContext context) {
		this.context = context;
	}	

	@Before(order = 1)
	public void beforeScenario(Scenario scenario) {
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		System.out.println("Im in beforeScenario");
		RemoteWebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Options manage = driver.manage();
		manage.timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		context.setDriver(driver);
		context.setWait(wait);
		context.getDriver().get("https://automationteststore.com/");
		manage.window().maximize();
	}

	@After(order = 1)
	public void afterScenario(Scenario scenario) {
		boolean failed = scenario.isFailed();
		System.out.println("is Failed? " + failed);
		if (!failed) {
			byte[] screenshotAs = context.getDriver().getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotAs, "image/png");
		}
		context.getDriver().quit();
	}

}