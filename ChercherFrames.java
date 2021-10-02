package Week4.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChercherFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		WebElement frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("/html/body/input")).sendKeys("Frames practice");
		
		WebElement innerFrame=driver.findElement(By.id("frame3"));
		driver.switchTo().frame(innerFrame);
		
		driver.findElement(By.id("a")).click();
		
		driver.switchTo().defaultContent();
		
		WebElement frame2=driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frame2);
		
		WebElement sel=driver.findElement(By.className("col-lg-3"));
		
		Select s1=new Select(sel);
		
		s1.selectByIndex(2);
		driver.switchTo().defaultContent();
		
		
		
		
		

	}

}
