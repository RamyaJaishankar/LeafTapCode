package week2.da1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("CTS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Ramya");
		driver.findElementById("createLeadForm_lastName").sendKeys("Jaishankar");   
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropDown=new Select(source);
		dropDown.selectByVisibleText("Employee");
		
		WebElement MarketingCampaignId = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropDown1=new Select(MarketingCampaignId);
		dropDown1.selectByValue("9001");
		
		WebElement OwnerShip = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropDown2=new Select(OwnerShip);
		dropDown2.selectByIndex(5);
        
		driver.findElementByName("submitButton").click();
        
		String title=driver.getTitle();
		System.out.println("the title is" + title);
	
	}

}
