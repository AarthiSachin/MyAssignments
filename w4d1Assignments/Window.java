package week4.w4d1Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/window.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Thread.sleep(1000);
		Set<String> s = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(s);
		driver.switchTo().window(list.get(1));
		System.out.println("Title of opened window : "+driver.getTitle());
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().window(list.get(0));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> s1 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>(s1);
		System.out.print("No.of.windows opened : ");
		System.out.println(list1.size()-1);
		for (int i = 1; i < list1.size(); i++) 
		{
			driver.switchTo().window(list1.get(i)).close();
		}
		driver.switchTo().window(list1.get(0));
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> s2 = driver.getWindowHandles();
		List<String> list2 = new ArrayList<String>(s2);
		System.out.print("No.of.windows opened : ");
		System.out.print(list2.size()-1);
		for (int i = 1; i < list2.size(); i++) 
		{
			String str = list2.get(i);
			driver.switchTo().window(str).close();
		}
		driver.switchTo().window(list2.get(0));
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Thread.sleep(3000);
		Set<String> s3 = driver.getWindowHandles();
		List<String> list3 = new ArrayList<String>(s3);
		System.out.print("No.of.windows opened : ");
		System.out.println(list3.size()-1);
		for (int i = 1; i < list3.size(); i++) 
		{
			driver.switchTo().window(list3.get(i)).close();
			Thread.sleep(500);
		}
		driver.switchTo().window(list3.get(0));		
	}
}
