package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Login;
import Pages.Products;

public class LoginTest {
	private WebDriver driver;
    private Login loginPage;
    private Products productPage;
    
    
    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        loginPage = new Login(driver);
        productPage = new Products(driver);
        
    }
    
    @Test
    public void loginAndAddToCartTest() {
    	loginPage.login("standard_user", "secret_sauce");
//        productPage.clickAddToCartButton(0);
//        productPage.clickShoppingCartBadge();
        
    }
    
    
    
    
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
    
}
