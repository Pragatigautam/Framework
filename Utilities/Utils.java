package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utils {
	//for verifying title
	public boolean verifyTitle(WebDriver driver, String expectedTitle) {
	    String actualTitle = driver.getTitle();
	    return actualTitle.equals(expectedTitle);
	}
	//for select dropdown ith locators
	public void selectDropDown(WebDriver driver,WebElement dropDown, String optionToselect) {
		Select select = new Select(dropDown);
		select.deselectByVisibleText(optionToselect);
	}
	
	public void selectDropDownByIndex(WebDriver driver,WebElement dropDown, int optionToselect) {
		Select select = new Select(dropDown);
		select.selectByIndex(optionToselect);
	}
}
