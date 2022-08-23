package week2.w2d2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement elementUserName = driver.findElement(By.xpath("//input[@id='username']"));
		elementUserName.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.xpath("//input[@id='password']"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLogin = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));;
		elementLogin.click();
		WebElement elementCRMSFA = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		elementCRMSFA.click();
		WebElement lead = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		lead.click();
		WebElement findLead = driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]"));
		findLead.click();
		WebElement firstName = driver.findElement(By.xpath("//input[@id='ext-gen248']"));
		firstName.sendKeys("Suraj");
		WebElement findLead1 = driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]"));
		findLead1.click();
		Thread.sleep(5000);
		WebElement findFirstLead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		findFirstLead.click();
		if(driver.getTitle().contains("View Lead"))
		{
			System.out.println("Title has been verified");
		}
		else
		{
			System.out.println("Title hasn't been verified");
		}
		WebElement clickEdit = driver.findElement(By.xpath("//a[contains(text(),'Edit')]"));
		clickEdit.click();
		WebElement updateLeadCompany = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		updateLeadCompany.clear();
		updateLeadCompany.sendKeys("My New Updated Company");
		WebElement update = driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]"));
		update.click();
		if(driver.getTitle().contains("View Lead"))
		{
			System.out.println("Title has been verified again");
		}
		else
		{
			System.out.println("Title hasn't been verified");
		}
	}
}
