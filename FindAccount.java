package week2.da1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Accounts']").click();
		driver.findElementByXPath("//a[text()='Find Accounts']").click();
		//* 7. Enter AccountName as "Credit Limited Account" 
		driver.findElementByXPath("(//input[@name='accountName'])[2]").sendKeys("Credit Limited Account");
		//* 8. Click on Find Accounts using xpath Locator
		driver.findElementByXPath("//button[text()='Find Accounts']").click();
		//click on acc list
		driver.findElementByXPath("//a[text()='Credit Limited Account']").click();
		
		//driver.findElementByLinkText("Credit Limited Account").click();
		
		// driver.findElementByXPath("(//a[contains(text(),'Credit')])[2]").click();
		//* 9. Click on the edit Button
		driver.findElementByXPath("//a[text()='Edit']").click();
		 
		//* 10. Get the Text of Account Name and verify 
		WebElement text=driver.findElementByXPath("//input[@id='accountName']");
		//System.out.println("The Title `is" +text.getAttribute(accountName));
		
	http://leaftaps.com/crmsfa/control/viewAccount?partyId=accountlimit100	
		System.out.println(driver.findElementByXPath("//input[@id='accountName']").getText());
		System.out.println("the title is ");
		
		
		// * 12. Get the title of the page and verify it.
	}
	//leaftaps.com/crmsfa/control/viewAccount?partyId=accountlimit100
	
	}


