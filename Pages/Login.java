package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	//private constructor for this page
	private WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }
    //finding elements and storing in variable.
    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    By errorState = By.tagName("h3");
    
    
    //creating methods 
    
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
    
    public void loginwithoutPassword(String username) {
        enterUsername(username);
        clickLogin();
    }
    
    public void loginwithoutusername(String password) {
    	enterPassword(password);
        clickLogin();
    }
    
    public boolean errorState() {
    	return driver.findElement(errorState).isDisplayed();
    } 
    
    public String verifyTitle() {
    	return driver.getTitle();
    }
    
   
    
}
