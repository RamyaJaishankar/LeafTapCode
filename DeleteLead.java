package week2.da1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();

		//Click Find leads
		driver.findElementByLinkText("Find Leads").click();

		//8	Click on Phone
		driver.findElementByXPath("(//span[@class='x-tab-strip-inner'])[2]").click();

		//9	Enter phone number
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9876543217");

		//10	Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		Thread.sleep(2000);
				
		//11	Capture lead ID of First Resulting lead
		System.out.println(driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText());

		//12	Click First Resulting lead
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();

		//driver.findElementByXPath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a").click();
		//driver.findElementByXPath("(//a[@class='linktext']/parent::div)[2]").click();

		//13	Click Delete
		driver.findElementByClassName("subMenuButtonDangerous").click();

		//14	Click Find leads
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(2000);
		
		//15	Enter captured lead ID
		String id=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		//driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		driver.findElementByName("id").sendKeys(id);

		//String captureId=driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		//driver.findElementByName("id").getAttribute(captureId);
				
				
		//16	Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String verifymessage=driver.findElementByClassName("x-paging-info").getText();
		if(verifymessage.equals("No records to display"))
		{
			System.out.println("This message confirms the successful deletion");
		}
		else
		{
			System.out.println("record not deleted");
		}

		//18	Close the browser (Do not log out)
		driver.close();
		}



		}