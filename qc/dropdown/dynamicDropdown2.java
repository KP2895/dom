package dom.qc.dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class dynamicDropdown2 {
	
	
	
	private static final boolean True = false;

	void Parentchild() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//for From City
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		//Thread.sleep(3000);
	//	System.out.println("From city=>"+driver.findElement(By.id("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).getText());
		
//for TO City
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click();
		//System.out.println("To city+> "+driver.findElement(By.id("destinationStation1_CTXT")).getText());
		
//for Departure data
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		driver.findElement(By.xpath("//td[@data-month='1'] //a[text()=7]")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date1")).getText());
		
//For Return Data
		
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		driver.findElement(By.xpath("//td[@data-month='2'] //a[text()=10]")).click();
		
		if(driver.findElement(By.id("div[id='Div1']")).getAttribute("style").contains("1")) {
			
			System.out.println("Calender is disabled");
			////Assert.assertTrue(True);
	
		}
		else {
			
			//Assert.assertFalse(false);
		}
		
//for Passenger==>
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		for(int i=1;i<3;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();//adult
		
		}
		
		int i=1;
		while(i<2) {
		driver.findElement(By.id("hrefIncChd")).click();//child
		driver.findElement(By.id("hrefIncInf")).click();//infant
		i++;
		
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.findElement(By.id("btnclosepaxoption")).click(); //done
		
//for Currency=>>
		
		WebElement wb=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select drop=new Select(wb);
		drop.selectByIndex(0);
		System.out.println(drop.getFirstSelectedOption().getText());
		
		drop.selectByIndex(1);
		System.out.println(drop.getFirstSelectedOption().getText());
		
		drop.selectByIndex(2);
		System.out.println(drop.getFirstSelectedOption().getText());
		
		drop.selectByIndex(3);
		System.out.println(drop.getFirstSelectedOption().getText());
		
//For search=>
		//driver.findElement(By.xpath("//span[@class='btn-find-flight-home']/input[@type='submit']")).click();
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		dynamicDropdown2 drop=new dynamicDropdown2();
		drop.Parentchild();
	
	}
	

}
