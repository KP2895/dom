package dom.qc.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckbocHandling {

	
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver.", "chrome.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://formstone.it/components/checkbox/");
		
		//driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		//WebElement str= driver.findElement(By.cssSelector("label[id*='friendsandfamily']"));
		
		//total no  of checkboxes
		
	
		List<WebElement> checkboxes=driver.findElements(By.cssSelector("input[type='checkbox']"));	
		System.out.println("No of checkboxes=>"+checkboxes.size());
		Thread.sleep(5000);
		
		for (WebElement checkbox :checkboxes) {
			
			String value=checkbox.getAttribute("value");
			
			if (value.equalsIgnoreCase("2"))
				   
			{       
				checkbox.click();
				break;
			 }
		
		

		
	}
	
		
		
		
		
		
		
		
		
		

	}

}
