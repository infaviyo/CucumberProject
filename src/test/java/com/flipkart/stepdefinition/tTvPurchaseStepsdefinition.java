package com.flipkart.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.flipkart.opjectrepository.tvPurchasePage;
import com.flipkart.resource.commonactions;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class tTvPurchaseStepsdefinition extends commonactions {
	commonactions c =new commonactions();
	tvPurchasePage p=new tvPurchasePage();
		
	@When("user search TV")
	public void user_search_TV() {
		p.getSearch();
		c.insertText( p.getSearch(), "MIPhone");
	}
	@When("user choose the TV and doing payment")
	public void user_choose_the_TV_and_doing_payment() {
		p.getTVName().click();
		c.windowHandeling();
		
	}
		
		@When("user search TV by useing one dim list")
		public void user_search_TV_by_useing_one_dim_list(DataTable dataTable) {
			List<String> asList = dataTable.asList();
			p.getSearch();
			p.getSearch().sendKeys(asList.get(2),Keys.ENTER);
			p.getTVName().click();
			String text = p.getSearch().getText();}
		
		@When("user search TV by useing one dim Map")
		public void user_search_TV_by_useing_one_dim_Map(DataTable dataTable) {
			Map<String, String> asMap = dataTable.asMap(String.class,String.class);
			p.getTVName();
			
			p.getSearch().sendKeys(asMap.get("phone2"),Keys.ENTER);
			p.getTVName().click();
			String text = p.getSearch().getText();
		}
		@When("user search TV{string}")
		public void user_search_TV(String string) {
			
			WebElement search=p.getSearch();
			
			search.sendKeys(string,Keys.ENTER);
			p.getTVName().click();
			String text = search.getText();
		}  

		}