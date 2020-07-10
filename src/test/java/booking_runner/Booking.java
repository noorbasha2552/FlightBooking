package booking_runner;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import base.Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
	features= "src\\test\\resources\\featurefiles",
	glue= {"stepdefinition"},
	monochrome=true,
	dryRun=false,
	
	plugin= {"pretty","json:target/jsonreport.json","html:target/result.html"}
	
	
	
)

public class Booking extends AbstractTestNGCucumberTests{
	
	@Parameters({"browser"})
	@BeforeTest
	public void initialization(String browser) {
		Base.initbrwoser(browser);
	}
	
	

	

}
