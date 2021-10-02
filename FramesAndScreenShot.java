package Week4.day1.assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesAndScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		WebElement ClickMe=driver.findElement(By.id("Click"));
		
		ClickMe.click();
		
	File src=	ClickMe.getScreenshotAs(OutputType.FILE);
	File dst=new File("./snaps/Click.png");
	FileUtils.copyFile(src,dst);
	
	
		
		
		
		
		

	}

}
