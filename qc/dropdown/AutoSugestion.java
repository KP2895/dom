package dom.qc.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugestion {

//	void autosuggest() throws InterruptedException {
//		
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
//		//Thread.sleep(3000);
//		List<WebElement> options =driver.findElements(By.xpath("//li[@class='ui-menu-item'] /a"));
//		
//		
//		
//		for(WebElement option :options) 
//		{
//			
//			if(option.getText().equalsIgnoreCase("India")) 
//			{
//				
//			option.click();
//				
//			}
//			
//			
//		}
//		
//		
//	}
	
	
	//On google fr searching selenium and click
	
	void googlesearch() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		
	    List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	    
	    for(WebElement option : options) {
	    	
	    	
	    if(option.getText().equalsIgnoreCase("India")) {
	    	
	    	option.click();
	    }
	    	
	    }
	    
		
		
		
		
		
		System.out.println("HI");
		//driver.close();
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		AutoSugestion suggest=new AutoSugestion();
		//suggest.autosuggest();
		suggest.googlesearch();
	}

}
