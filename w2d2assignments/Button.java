package week2.w2d2assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		driver.navigate().back();
		boolean isEnableD = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).isEnabled();
		if(isEnableD)
		{
			System.out.println("The button is not disabled");
		}
		else
		{
			System.out.println("The button is disabled");
		}
		Point location = driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).getLocation();
		System.out.println(location);
		System.out.println(driver.findElement(By.xpath("//span[(text()='Save')]")).getCssValue("color"));
		System.out.println(driver.findElement(By.xpath("(//span[(text()='Submit')])[2]")).getSize());
		
		WebElement beforeColor = driver.findElement(By.xpath("(//span[(text()='Success')])[1]"));
		String cssValue = beforeColor.getCssValue("background-color");
		System.out.println(cssValue);
		Actions builder = new Actions(driver);
		builder.moveToElement(beforeColor).perform();
		String cssValue1 = beforeColor.getCssValue("background-color");
		System.out.println(cssValue1);
		if(!cssValue.equals(cssValue1))
		{
			System.out.println("Color changed");
		}
		else
		{
			System.out.println("Color not changed");
		}
		driver.findElement(By.xpath("//span[(text()='Image')]")).click();
		List<WebElement> roundedButton = driver.findElements(By.xpath("//button[contains(@class,'rounded-button')]"));
		int i = roundedButton.size();
		System.out.println(i);
		
	}

}
