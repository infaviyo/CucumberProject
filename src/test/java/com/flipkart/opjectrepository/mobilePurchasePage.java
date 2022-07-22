package com.flipkart.opjectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resource.commonactions;

public class mobilePurchasePage extends commonactions {
public mobilePurchasePage() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath ="//button[text()='✕']")
private WebElement closeIcone;
public WebElement getCloseIcone() {
	return closeIcone;
}
public WebElement getSearch() {
	return search;
}
public WebElement getMobileName() {
	return MobileName;
}
@FindBy(name="q")
private WebElement search;
@FindBy(xpath ="(//div[@class='_4rR01T'])[1]")
private WebElement MobileName;
@FindBys({
@FindBy(xpath ="(//div[@class='_4rR01T'])[1]"),
@FindBy(id="mi")})
private WebElement AndMobileName;
public WebElement getAndMobileName() {
	return AndMobileName;
}
public WebElement getOrMobileName() {
	return OrMobileName;
}
@FindAll({
	@FindBy(xpath ="(//div[@class='_4rR01T'])[1]"),
	@FindBy(id="mi")
	})
private WebElement OrMobileName;

}
