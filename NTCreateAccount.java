package week2.da1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Accounts").click();
		driver.findElementByLinkText("Create Account").click();
		
		 //7. Select preferred currency as Indian Rupee using SelectByValue
		WebElement currency = driver.findElementById("currencyUomId");
		Select dropDown=new Select(currency);
		dropDown.selectByValue("INR");
		
		 //* 8. Enter the Description text as "NRI Account"
		driver.findElementByName("description").sendKeys("NRI Account");
		
		 //* 9. Enter LocalName Field Using Xpath Locator
		driver.findElementByXPath("//input[@id='groupNameLocal']").sendKeys("Ramya");
		
		 //* 10. Enter SiteName Field Using Xpath Locator
		driver.findElementByXPath("//input[@id='officeSiteName']").sendKeys("Chennai");
	
		 //* 11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		driver.findElementByXPath("(//input[@class='inputBox'])[5]").sendKeys("4560000");
	     
		
		//* 12. Select Industry as ComputerSoftware
		WebElement industry = driver.findElementByName("industryEnumId");
		Select dropDown1 = new Select(industry);
		dropDown1.selectByValue("IND_SOFTWARE");
		
		// * 13. Select OwnerShip as S-Corporation using SelectByVisibletext
		WebElement OwnerShip = driver.findElementByName("ownershipEnumId");
		Select dropDown2 = new Select(OwnerShip);
		dropDown2.selectByVisibleText("S-Corporation"); 
		
		
		 //* 14. Select Source as Employee using SelectByValue
		WebElement Source = driver.findElementById("dataSourceId");
		Select dropDown3 = new Select(Source);
		dropDown3.selectByValue("LEAD_EMPLOYEE");
	

		// * 15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
		WebElement Marketing = driver.findElementById("marketingCampaignId");
		Select dropDown4 = new Select(Marketing);
		dropDown4.selectByIndex(7);
		 
		 //* 16. Select State/Province as Texas using SelectByValue
		WebElement State = driver.findElementById("generalStateProvinceGeoId");
		Select dropDown5 = new Select(State);
		dropDown5.selectByValue("TX");
		 
		 //* 17. Click on Create Account using Xpath Locator
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
		// * 18. Get the Text of Error Message Displayed (hint: Red Texts)
		System.out.println(driver.findElementByXPath("//li[@class='errorMessage']").getText());
	}

}
