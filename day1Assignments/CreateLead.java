package week2.day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login" 2. Enter UserName
		 * and Password Using Id Locator 3. Click on Login Button using Class Locator 4.
		 * Click on CRM/SFA Link 5. Click on Leads Button 6. Click on Create Lead 7.
		 * Enter CompanyName Field Using id Locator 8. Enter FirstName Field Using id
		 * Locator 9. Enter LastName Field Using id Locator 10. Enter FirstName(Local)
		 * Field Using id Locator 11. Enter Department Field Using any Locator of Your
		 * Choice 12. Enter Description Field Using any Locator of your choice 13. Enter
		 * your email in the E-mail address Field using the locator of your choice 14.
		 * Select State/Province as NewYork Using Visible Text 15. Click on Create
		 * Button 16. Get the Title of Resulting Page. refer the video using
		 * driver.getTitle()
		 */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement elementUserName = driver.findElement(By.id("username"));
		elementUserName.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		WebElement createLeads = driver.findElement(By.linkText("Create Lead"));
		createLeads.click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("My Company");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Aarthi");
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Sachin");
		WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocal.sendKeys("Senorita");
		WebElement department = driver.findElement(By.className("inputBox"));
		department.sendKeys("Testing");
		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("This user is a new lead. The lead has been created for testing purpose.");
		WebElement emailId = driver.findElement(By.name("primaryEmail"));
		emailId.sendKeys("abc@gmail.com");
		WebElement selectProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select s = new Select(selectProvince);
		s.selectByVisibleText("New York");
		WebElement leadLogin = driver.findElement(By.className("smallSubmit"));
		leadLogin.click();
		if(driver.getTitle().contains("View Lead"))
		{
			System.out.println("View Lead page has been opened");
		}
		else
		{
			System.out.println("View Lead page has not been opened");
		}
	}
}
