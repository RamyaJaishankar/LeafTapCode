package week1.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		 
		// Click on contacts Button
		driver.findElementByLinkText("Contacts").click();
		
		//* 6. Click on Create Contact
		driver.findElementByLinkText("Create Contact").click();
		
		//* 7. Enter FirstName Field Using id Locator
		driver.findElementById("firstNameField").sendKeys("Ramya");
		
		//* 8. Enter LastName Field Using id Locator
		driver.findElementById("lastNameField").sendKeys("Jaishankar");
		
		// * 9. Enter FirstName(Local) Field Using id Locator
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("XXX");
		
		// * 10. Enter LastName(Local) Field Using id Locator
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("YYY");
		
		// * 11. Enter Department Field Using any Locator of Your Choice
		driver.findElementById("createContactForm_departmentName").sendKeys("Production support");
		
		// * 12. Enter Description Field Using any Locator of your choice 
		driver.findElementById("createContactForm_description").sendKeys("Automation testing");
		 
		//* 13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElementById("createContactForm_primaryEmail").sendKeys("xyz@gmail.com");
		
		// * 14. Select State/Province as NewYork Using Visible Text
		WebElement State = driver.findElementById("createContactForm_generalStateProvinceGeoId");
		Select dropDown=new Select(State);
		dropDown.selectByVisibleText("Armed Forces Americas");
		
		// * 15. Click on Create Contact
		driver.findElementByClassName("smallSubmit").click();
		
		// * 16. Click on edit button
		driver.findElementByXPath("//a[@class='subMenuButton']").click();
		 
		// * 17. Clear the Description Field using .clear
		driver.findElementById("updateContactForm_description").clear();
		
		 // * 18. Fill ImportantNote Field with Any text
		driver.findElementById("updateContactForm_importantNote").sendKeys("Automation testing");
		
		// * 19. Click on update button using Xpath locator
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
		 //* 20. Get the Title of Resulting Page.
		System.out.println("The Title is" +driver.getTitle());
		
		driver.close();
	}

}
