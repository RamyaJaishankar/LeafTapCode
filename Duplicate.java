package week2.da1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		String title=driver.getTitle();
		System.out.println("the title is" + title);
		if(title.contains("TestLeaf"))
		{
			System.out.println("Correctr Title");
		}
		else
		{
		System.out.println("incorrect title");
		}
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("CTS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Ramya");
		driver.findElementById("createLeadForm_lastName").sendKeys("Jaishankar");   
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		 Select dropDown=new Select(source);
		 dropDown.selectByVisibleText("Employee");
		WebElement marketing =driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropDown1=new Select(marketing);
		dropDown1.selectByValue("CATRQ_AUTOMOBILE");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Ramya");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Jaishankar");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("xyz");
		driver.findElementById("createLeadForm_birthDate").sendKeys("8/21/98");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Testing");
		driver.findElementById("createLeadForm_departmentName").sendKeys("amazon");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("500000");
		WebElement currrency =driver.findElementById("createLeadForm_currencyUomId");
		Select dropDown2=new Select(currrency);
		dropDown2.selectByValue("INR");
		WebElement industry =driver.findElementById("createLeadForm_industryEnumId");
		Select dropDown3=new Select(industry);
		dropDown3.selectByValue("IND_SOFTWARE");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("120000");
		WebElement owner =driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropDown4=new Select(owner);
		dropDown4.selectByValue("OWN_CCORP");
		driver.findElementById("createLeadForm_sicCode").sendKeys("345");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("12@");
		driver.findElementById("createLeadForm_description").sendKeys("Im working in cts");
		driver.findElementById("createLeadForm_importantNote").sendKeys("password should not be shared");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("2");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("234");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9876543217");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("qwer");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Ramya");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("xyz@gmail.com");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("amazon");
		driver.findElementById("createLeadForm_generalToName").sendKeys("Praveen");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("Kumar");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("kambar street");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("tvk nagaer");
		driver.findElementById("createLeadForm_generalCity").sendKeys("chennai");
		WebElement state =driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select dropDown5=new Select(state);
		dropDown5.selectByValue("IN");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("64");
		WebElement country =driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dropDown6=new Select(country);
		dropDown6.selectByValue("IND");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("1234");
		driver.findElementByClassName("smallSubmit").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		driver.findElementById("createLeadForm_companyName").clear();
		driver.findElementById("createLeadForm_companyName").sendKeys("Amazon");
		driver.findElementByClassName("smallSubmit").click();
		WebElement name=driver.findElementById("viewLead_companyName_sp");
		String verifyName=name.getText();
		String duplicateName="Amazon";
		if(verifyName.contains(duplicateName))
		{
			System.out.println("verification successfull");
		}
		else
		{
			System.out.println("verification failed");
		}
		driver.close();
		
		
	}
}
