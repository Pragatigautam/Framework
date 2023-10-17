package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products {
	private WebDriver driver;

	public Products(WebDriver driver) {
		this.driver = driver;
	}

	// All elements of product page.
	
	By productTitle = By.className("inventory_item_name");
	By addToCartButton = By.className("btn_inventory");
	By shoppingCartBadge = By.className("shopping_cart_badge");

	public String getProductTitle(int index) {
		return driver.findElements(productTitle).get(index).getText();
	}

	public void clickAddToCartButton(int index) {
		driver.findElements(addToCartButton).get(index).click();
	}

	public void clickShoppingCartBadge() {
		driver.findElement(shoppingCartBadge).click();
	}
}
