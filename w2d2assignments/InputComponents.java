package week2.w2d2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class InputComponents {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");
		WebElement name = driver.findElement(By.xpath("//input[@id='j_idt88:name']"));
		name.sendKeys("New User");
		WebElement appendCountry = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']"));
		appendCountry.sendKeys(" India");
		boolean isEnabled = driver.findElement(By.xpath("//input[@aria-disabled='true']")).isEnabled();
		if(isEnabled)
		{
			System.out.println("The textbox is not disabled");
		}
		else
		{
			System.out.println("The textbox is disabled");
		}
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).clear();
		String a = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")).getAttribute("value");
		System.out.println(a);
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys("abc@gmail.com",Keys.TAB);
		Thread.sleep(1000);
		boolean isSelected = driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']")).isSelected();
		Thread.sleep(1000);
		if(isSelected)
		{
			System.out.println("The next element has been selected");
		}
		else
		{
			System.out.println("The next element has not been selected");
		}
		driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']")).sendKeys("I am a test engineer looking for greater oppurtunities");
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("This is a textbox. Texts can be written in bold or anything.");
		driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
		WebElement errMsg = driver.findElement(By.xpath("//span[@class='ui-message-error-detail']"));
		if(errMsg.getText().contains("Age is mandatory"))
		{
			System.out.println("Error message confirmed");
		}
		else
		{
			System.out.println("Error message not confirmed");
		}
		WebElement b = driver.findElement(By.xpath("//input[@id='j_idt106:float-input']"));
		b.click();
		Thread.sleep(1000);
		String z = b.getText();
		if(z.isEmpty())
		{
			System.out.println("Label position changed");
		}
		else
		{
			System.out.println("Label position hasn't changed");
		}
		WebElement findElement = driver.findElement(By.xpath("//input[@id='j_idt106:auto-complete_input']"));
		findElement.sendKeys("Aarthi");
		//WebElement selectThird = driver.findElement(By.xpath("//span[@class='ui-button-text']"));
		Thread.sleep(4000);
		WebElement first = driver.findElement(By.xpath("//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all'][1]"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(first).perform();
		
		for (int i = 1; i < 3; i++) {
			findElement.sendKeys(Keys.DOWN);
		}
		findElement.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']")).sendKeys("19/06/1997");
		WebElement findElement2 = driver.findElement(By.xpath("//input[@id='j_idt106:j_idt118_input']"));
		findElement2.sendKeys("47");
		driver.findElement(By.xpath("//a[@class='ui-spinner-button ui-spinner-down ui-corner-br ui-button ui-widget ui-state-default ui-button-text-only']")).click(); 
		String attribute1 = findElement2.getAttribute("aria-valuenow");
		System.out.println(attribute1);
		int i = Integer.parseInt(attribute1);
		if(i<47)
		{
			System.out.println("The entered value has been reduced");
		}
		driver.findElement(By.xpath("//input[@id='j_idt106:slider']")).sendKeys("65");
		Thread.sleep(1000);
		WebElement slider = driver.findElement(By.xpath("//div[@class='ui-slider-range ui-corner-all ui-widget-header ui-slider-range-min']"));
		System.out.println(slider.getAttribute("style"));
		WebElement keyBoardConfirm = driver.findElement(By.xpath("//input[@id='j_idt106:j_idt122']"));
		keyBoardConfirm.click();
		Thread.sleep(1000);
		boolean j = driver.findElement(By.xpath("//div[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']")).isDisplayed();
		if(j)
		{
			System.out.println("The keyboard is displayed");
		}
		else
		{
			System.out.println("The keyboard is not displayed");
		}
		driver.findElement(By.xpath("//button[@class='keypad-special keypad-close ui-corner-all ui-state-default ui-state-highlight']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//button[@class='ql-bold'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='ql-italic'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='ql-underline'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_editor']//p")).sendKeys("Selenium is Awesome");		
	}
}
