package week2.w2d2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement createNew = driver.findElement(By.xpath("//a[contains(text(),'Account')]"));
		createNew.click();
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("New User");
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.sendKeys("sample");
		WebElement mobNum = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobNum.sendKeys("9876543210");
		WebElement password = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		password.sendKeys("abc@123");
		WebElement day = driver.findElement(By.xpath("//select[@id='day']/option[@value='10']"));
		day.click();
		WebElement date = driver.findElement(By.xpath("//select[@id='month']/option[@value='8']"));
		date.click();
		WebElement year = driver.findElement(By.xpath("//select[@id='year']/option[@value='2000']"));
		year.click();
		WebElement gender = driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/label[contains(text(),'Female')]"));
		gender.click();
		WebElement login = driver.findElement(By.xpath("//button[@name='websubmit']"));
		login.click();
	}	

}
