package week2Day1;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LearnAlert {

	@Test
	public void sample() throws MalformedURLException{
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		driver.findElementById("loginbutton").click();
		
		System.out.println(driver.getTitle());
		
		//SwitchTo Alert
		Alert alt = driver.switchTo().alert();
		
		//Get the Text
		String txt = alt.getText();
		
		System.out.println(txt);		
		
		
		
		
		
		//Accept alert
		alt.accept();
		
		

	}

}












