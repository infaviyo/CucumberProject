package com.flipkart.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.opjectrepository.mobilePurchasePage;
import com.flipkart.resource.commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobilePurchaseSteps extends commonactions{
	commonactions c =new commonactions();
	mobilePurchasePage n =new mobilePurchasePage();
	@Given("user launches flipkart application")
	public void user_launches_flipkart_application() {
		//c.Lunch();
	}

	@Given("user Login into flipkart")
	public void user_Login_into_flipkart() {
		try {
			n.getCloseIcone().isDisplayed();
		n.getCloseIcone().click();}
		catch(Exception e) {
			System.out.println("cancel");}
	}

	@When("user search moblie")
	public void user_search_moblie() {
		n.getSearch();
		c.insertText( n.getSearch(), "MIPhone");
			}

	@When("user choose the mobile and doing payment")
	
	public void user_choose_the_mobile_and_doing_payment() {
		n.getMobileName().click();
		c.windowHandeling();}
	

	@Then("user receive order confirmation message")
	public void user_receive_order_confirmation_message() {
		
		
	     
	
	}
	@When("user search moblie by useing one dim list")
	public void user_search_moblie_by_useing_one_dim_list(DataTable dataTable) {
		List<String> asList = dataTable.asList();
		
	WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
	
	search.sendKeys(asList.get(2),Keys.ENTER);
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	String text = search.getText();


	}
	@When("user search moblie by useing one dim Map")
	public void user_search_moblie_by_useing_one_dim_Map(DataTable dataTable) {
		Map<String, String> asMap = dataTable.asMap(String.class,String.class);
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		
		search.sendKeys(asMap.get("phone2"),Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		String text = search.getText();
	}
	@When("user search moblie{string}")
	public void user_search_moblie(String string) {
		
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		
		search.sendKeys(string,Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		String text = search.getText();
		
	}  
	}



