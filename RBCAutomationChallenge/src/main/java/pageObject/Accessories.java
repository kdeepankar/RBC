package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Accessories {

	public WebDriver driver;
	int itemcounter;
	//Constructor
	public Accessories(WebDriver driver) {
		this.driver=driver;
		itemcounter=0;
	}
	// Locators
	By addtocart = By.xpath("//div[@class='default_product_display product_view_40 accessories group']/div[2]/form/div[2]/div[1]/span/input");
	By checkout = By.xpath("//a[@class='cart_icon']");
	By Cart = By.xpath("//em[@class='count']");
	
	//Methods to get elements
	public WebElement getCartItem() {
		return driver.findElement(Cart);
	}
	
	public WebElement getAddToCart() {
		itemcounter+=1;
		return driver.findElement(addtocart);
	}
	
	public String getItemCount() {
		return String.valueOf(itemcounter);
	}
	
	public WebElement getCheckOut() {
		return driver.findElement(checkout);
	}
	
}
