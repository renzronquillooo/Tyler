package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Navigation_Desktops extends BasePage {
		
	WebDriver driver;
	public Navigation_Desktops (WebDriver driver) 
	{
		super(driver);
	}

//DESKTOP ITEMS LIST
@FindBy(xpath="//a[normalize-space()='Apple Cinema 30\"']")
WebElement appleCinemaItem;

@FindBy(xpath="//a[normalize-space()='Sony VAIO']")
WebElement sonyVaioItem;

public void clickappleCinemaItem() {
	appleCinemaItem.click();
}




}
