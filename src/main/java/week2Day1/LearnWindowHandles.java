package week2Day1;

import java.io.IOException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LearnWindowHandles {

	@Test
	public void sample() throws IOException{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("http://legacy.crystalcruises.com/");	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElementByLinkText("GUEST CHECK-IN").click();

		Set<String> allWindows = driver.getWindowHandles();

		System.out.println(allWindows.size());

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		String parentWindow = driver.getWindowHandle();

		for (String eachWindow : allWindows) {			
			driver.switchTo().window(eachWindow);			
		}

		System.out.println("*************************");
		
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		System.out.println(driver.getTitle());
		
		
		


	}

}





































