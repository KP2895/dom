package dom.qc.Ecart;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
	
		
		// for Cucumber=>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
	List<WebElement> products=	driver.findElements(By.cssSelector("div[class='product']"));
	
	for(int i=0;i<products.size();i++) {
		
		String str=products.get(i).getText();
		
		if(str.contains("Cucumber")) {
			
			System.out.println(str);
			driver.findElements(By.xpath("//button[text()=\"ADD TO CART\"]")).get(i).click();
		}
	}
	
	// for Cauliflower=>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
	List<WebElement> Products=driver.findElements(By.cssSelector("div[class='product']"));
	
	for(int i=0;i<Products.size();i++) {
		
		
		String name=Products.get(i).getText();
		if(name.contains("Cauliflower")) {
			
			System.out.println("Name:=>"+name);
			
			
			
			
		}
	}
	for (int j=0;j<=1;j++) {
		
		
		driver.findElements(By.xpath("//a[@class='increment']")).get(j).click();
	}
		
		
		
		////a[@class='increment']
	}

}
