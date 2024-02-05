package dom.qc.dropdown;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class staticDrowpdown {
	
	
	void NormalCurrencyDropdown() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//Implicite wait=>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.getTitle();
		
		//for dropdown we have to use select class
		
		WebElement wb=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select drop=new Select(wb);
		drop.selectByValue("USD");
		
		System.out.println(drop.getFirstSelectedOption().getText());
		
		drop.selectByIndex(1);
	
		System.out.println(drop.getFirstSelectedOption().getText());
		driver.quit();
	}
		
		void Passengerselection() {
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
			
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			
			driver.findElement(By.id("divpaxinfo")).click();
			
			
			//For selecting Adults=>>>>>>>>>>>
			for (int i=1;i<=4;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
			}
			
			//For Selecting Childs & Infants=>>>>>>>>>>>>
			int i=1;
			while(i<3) {
				
				driver.findElement(By.id("hrefIncChd")).click();
				driver.findElement(By.id("hrefIncInf")).click();
				
				i++;
				
				
			}
			
			driver.findElement(By.id("btnclosepaxoption")).click();
			
			String str=driver.findElement(By.id("divpaxinfo")).getText();
			System.out.println("No of passenger list:"+str);
			
			
			
			driver.close();
		}
		
		
		
		
		

		
	
	
	public static void main(String[] args) {
	
		staticDrowpdown Drwp=new staticDrowpdown();
		//Drwp.NormalCurrencyDropdown();
		Drwp.Passengerselection();
		
		
		
		

		
	}

}
