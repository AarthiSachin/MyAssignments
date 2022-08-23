package week2.w2d2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).click();
		boolean b = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isEnabled();
		if(b)
		{
			System.out.println("The checkbox is disabled");
		}
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
		driver.findElement(By.xpath("(//label[text()='Berlin'])[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//label[text()='Amsterdam'])[2]")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();	
	}
}
