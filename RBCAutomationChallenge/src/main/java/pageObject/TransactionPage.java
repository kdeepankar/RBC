package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransactionPage {

	WebDriver driver;

	// Constructor
	
	public TransactionPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locator
	By message = By.className("entry-title");

	// Getter
	public WebElement getMessage() {
		return driver.findElement(message);
	}
}
