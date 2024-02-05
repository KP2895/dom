package dom.qc.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdown {

	WebDriver driver=null;
	void SysProperty() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	}
	
	void CityPicker() {
		SysProperty();
		driver.findElement(By.cssSelector("input[id=ctl00_mainContent_ddl_originStation1_CTXT]")).click();
		driver.findElement(By.xpath("//a[@value=\"DEL\"]")).click();
		String Str=driver.findElement(By.cssSelector("input[id=ctl00_mainContent_ddl_originStation1_CTXT]")).getText();
		System.out.println("Departure city name: "+Str);
		
		//input[@value='Arrival City' and @id='ctl00_mainContent_ddl_destinationStation1_CTXT']
		driver.findElement(By.xpath("//input[@value='Arrival City' and @id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("(//a[@value=\"GOI\"])[2]")).click();
		String Str1=driver.findElement(By.xpath("(//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT'])[1]")).getText();
		System.out.println(Str1);
		//driver.close();
	}
	
	
	public static void main(String[] args) {
		
		dynamicDropdown Drop=new dynamicDropdown();
		
		
	}

}
