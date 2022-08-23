package week2.w2d2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.findElement(By.xpath("//a[contains(text(),'Dashboard')][1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(text(),'Find the URL without clicking me')]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(text(),'Broken?')]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[contains(text(),'Dashboard')])[2]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(text(),'How many links in this page?')]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(text(),'How many links in this layout?')]")).click();
		driver.navigate().back();
	}
}
