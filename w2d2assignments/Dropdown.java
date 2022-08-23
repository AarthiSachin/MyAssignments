package week2.w2d2assignments;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement favTool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select s1 = new Select(favTool);
		s1.selectByVisibleText("Puppeteer");
		driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[@id='j_idt87:city_label']")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		Thread.sleep(500);
		WebElement course = driver.findElement(By.xpath("//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']"));
		course.click();
		Thread.sleep(500);
		WebElement course1 = driver.findElement(By.xpath("(//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all'])[1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(course1).perform();
		for (int i = 1; i < 4; i++) 
		{
			course.sendKeys(Keys.DOWN);
		}
		course.sendKeys(Keys.ENTER);
		Thread.sleep(500);
//		driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']")).click();
//		driver.findElement(By.xpath("//li[text()='English']")).click();
//		Thread.sleep(500);
		
		

		

	}

}