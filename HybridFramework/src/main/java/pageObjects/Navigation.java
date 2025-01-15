package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Navigation extends BasePage {
		
	WebDriver driver;
	public Navigation (WebDriver driver) 
	{
		super(driver);
	}

	
//TOP RAIL
@FindBy(xpath="//a[@title='My Account']")
WebElement topMyAccount;

/**

@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='My Account']")
WebElement topMyAccountLink;

@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Order History']")
WebElement topOrderHistoryLink;

@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Transactions']")
WebElement topTransactionsLink;

@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Downloads']")
WebElement topDownloadsLink;

@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")
WebElement topLogoutLink;

@FindBy(className="fa fa-heart")
WebElement topMyFavoritesLink;

@FindBy(xpath="//a[@title='Shopping Cart']//i[@class='fa fa-shopping-cart']")
WebElement topShoppingCartLink;

@FindBy(className="fa fa-share")
WebElement topShareLink;

**/



//ITEMS BAR
@FindBy(xpath="//a[normalize-space()='Desktops']")
WebElement hoverDesktop;

@FindBy(xpath="//a[normalize-space()='Show All Desktops']")
WebElement showAllDesktop;


public void showAllDesktopItems() {
	hoverDesktop.click();
	showAllDesktop.click();
}




}
