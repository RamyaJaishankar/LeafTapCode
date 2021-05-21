package week2.da1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByXPath("(//a)[2]").click();
		driver.findElementByXPath("//a[text()='Accounts']").click();
		driver.findElementByXPath("//a[text()='Create Account']").click();
		driver.findElementByXPath("//input[@id='accountName']").sendKeys("Debit Limited Account");
		driver.findElementByName("description").sendKeys("Selenium Automation Tester");
		driver.findElementByXPath("//input[@id='groupNameLocal']").sendKeys("Ramya");
		driver.findElementByXPath("//input[@id='officeSiteName']").sendKeys("AKM Test");
		driver.findElementByXPath("(//input[@class='inputBox'])[5]").sendKeys("50000000");
		
		//12. Select Industry as ComputerSoftware
		WebElement industry = driver.findElementByName("industryEnumId");
		Select dropDown = new Select(industry);
		dropDown.selectByValue("IND_SOFTWARE"); 
		 
		 //* 13. Select OwnerShip as S-Corporation using SelectByVisibletext
		WebElement OwnerShip = driver.findElementByName("ownershipEnumId");
		Select dropDown1 = new Select(OwnerShip);
		dropDown1.selectByVisibleText("S-Corporation"); 
		
		//* 14. Select Source as Employee using SelectByValue
		WebElement Source = driver.findElementById("dataSourceId");
		Select dropDown2 = new Select(Source);
		dropDown2.selectByValue("LEAD_EMPLOYEE"); 
		
		//* 15.Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
		WebElement Marketing = driver.findElementById("marketingCampaignId");
		Select dropDown3 = new Select(Marketing);
		dropDown3.selectByIndex(7);
		
		//* 16. Select State/Province as Texas using SelectByValue 
		WebElement State = driver.findElementById("generalStateProvinceGeoId");
		Select dropDown4 = new Select(State);
		dropDown4.selectByValue("TX");
		
		 //* 17. Click on Create Account using Xpath Locator
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
	    driver.close();
	}

}
