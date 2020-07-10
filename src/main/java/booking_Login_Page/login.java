package booking_Login_Page;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;

public class login extends Base {
	// public static WebDriver driver;
	static WebDriver driver;
	static int time;

	public static void main(String args[]) throws InterruptedException {
		
		login initpage =new login();
		driver =Base.getdriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);	
	driver.findElement(By.xpath("//li[@data-cy='account']")).click();
	
	driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("Bengaluru");
	driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("Delhi");
	
	driver.findElement(By.xpath("//p[contains(text(),'Delhi')]")).click();
	
	driver.findElement(By.xpath("//div[@aria-label='Sat Jul 11 2020']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
	WebDriverWait wait =new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='sorting-togglers']"))));
	List<WebElement> price=driver.findElements(By.xpath("//span[@class='actual-price']"));
	ArrayList<Integer> pri=new ArrayList<Integer>();
	for(WebElement e:price) {
		//System.out.println("*"+e.getText().toString().replaceAll("[^0-9]", "").trim()+"*");
		try {
		
			pri.add(Integer.parseInt(e.getText().toString().replaceAll("[^0-9]", "").trim()));
			//System.out.println("Added");}
		}
		catch (Exception e1){
			//System.out.println("not added");
		}
		
		//System.out.println(pri.toString());
		}

	//System.out.println("min price");
	//System.out.println(pri.indexOf(Collections.min(pri)));
	//System.out.println(Collections.min(pri));
	
	
	List<WebElement> duration=driver.findElements(By.xpath("//p[@class='fli-duration']"));
	ArrayList<Integer> dur=new ArrayList<Integer>();
	
	for(WebElement z:duration) {
		
		dur.add(Integer.parseInt(z.getText().toString().replaceAll("[^0-9]","").trim()));
		
		}
	//System.out.println("minimum duration");
	//System.out.println(dur.indexOf(Collections.min(dur)));
	//System.out.println(dur.size());
	
	List<WebElement> start=driver.findElements(By.xpath("//div[@class='dept-time']"));
	ArrayList<Integer> star=new ArrayList<Integer>();
	for(WebElement x:start) {
		star.add(Integer.parseInt(x.getText().toString().replaceAll("[^0-9]","").trim()));
	}
	System.out.println("generated all arraylist");
	System.out.println(pri.toString());
	System.out.println(dur.toString());
	System.out.println(star.toString());
	
	
	int s=0;
	for(int i=0;i<pri.size();i++) {
		
		if(pri.get(i).equals(Collections.min(pri))) {
			System.out.println("compared");
			s=s+1;
		}		
	System.out.println("in first loop"+pri.get(i));
	
	}
	System.out.println("similar price flights"+s);
	int similar_duration=0;
	for(int j=0;j<s;j++) {
		if(dur.get(j).equals(Collections.min(dur))) {
			similar_duration=similar_duration+1;
		}
	}
	
	System.out.println("similar duration flights"+similar_duration);
	
	if(s==1) {
		driver.findElement(By.xpath("//span[contains(@class,'fli-arrow arrow-down-icon')]")).click();
	System.out.println("opening first option");
	}
	else if(s>1 && similar_duration>1) {
		System.out.println("similar duration flights are"+ similar_duration);
		System.out.println("got multiple options");
		for(int k=0;k<similar_duration;k++) {
			if(star.get(k)>=1700 && star.get(k)<=2000) {
				//int inx=star.indexOf(stime);
				System.out.println("filtered evening flight");
				driver.findElement(By.xpath("//span[contains(@class,'fli-arrow arrow-down-icon')]["+k+"]")).click();
				System.out.println(k);
				break;
			}
		}
	}

	}}
