package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;



public class Base{
	
	
	
	private static WebDriver driver;
	public static int timeout=20;
	
	
	public static void initbrwoser(String browser) {
		
	if(browser.equalsIgnoreCase("chrome"))	{
		System.out.println("in process ofselecting chrome browser");
		
		
	String exe=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver",exe+"\\src\\test\\resources\\executable\\chromedriver.exe");
	driver =new ChromeDriver();}
	if(browser.equalsIgnoreCase("opera")) {
		System.out.println("in process ofselecting opera browser");
	String exe=System.getProperty("user.dir");
	System.setProperty("webdriver.opera.driver", exe+"\\src\\test\\resources\\executable\\operadriver.exe");
	driver= new OperaDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	System.out.println("in constructor");
	}	
	
	
	public static WebDriver getdriver(){
		
		
		
		return driver;
	}
	public static void closedriver() {
		driver.quit();
	}
	
	

}
