package week4.w4d1Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceCustService {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password#123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//span[@dir='ltr'])[2]")).click();
		Set<String> s = driver.getWindowHandles();
		List<String> l = new ArrayList<String>(s);
		driver.switchTo().window(l.get(1));
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("The title of the opened window is : "+driver.getTitle());
		Thread.sleep(500);
		driver.switchTo().window(l.get(0));
		driver.quit();	
	}
}
 