package week2.w2d2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		WebElement phone = driver.findElement(By.xpath("//span[contains(text(),'Phone')]"));
		phone.click();
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		phoneNumber.sendKeys("1234567890");
		WebElement findLead2 = driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]"));
		findLead2.click();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
		System.out.println(text);
		WebElement findFirst = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		findFirst.click();
		WebElement delete = driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']"));
		delete.click();
		WebElement findLead1 = driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]"));
		findLead1.click();
		WebElement enterId = driver.findElement(By.xpath("(//input[@class=' x-form-text x-form-field'])[24]"));
		enterId.sendKeys(text);
		WebElement findLead3 = driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]"));
		findLead3.click();
		Thread.sleep(5000);
		String text2 = driver.findElement(By.xpath("//div[@id='ext-gen437']")).getText();
		System.out.println(text2);
		if(text2.equalsIgnoreCase("No records to display"))
		{
			System.out.println("Deletion of the lead is successful");
		}
		else 
		{
			System.out.println("Deletion of the lead is not successful");
		}
		
	}

}
