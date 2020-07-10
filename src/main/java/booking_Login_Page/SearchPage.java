package booking_Login_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;

public class SearchPage extends Base{
	
	static WebDriver driver;
	static int time;
	
	public static void openportal() {
		
		
			
		driver=Base.getdriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
	}
	
	public static void Enterflightdetails() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("Bengaluru");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("Delhi");
		
		driver.findElement(By.xpath("//p[contains(text(),'Delhi')]")).click();
		
		driver.findElement(By.xpath("//div[@aria-label='Sat Jul 11 2020']")).click();
	}
	
	public static BookinPage searchflight() {
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
		return new BookinPage();
	}
	
	

	
}
