package Week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		 
		// Enter UserName and Password Using Id Locator
		 
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		 // Click on Login Button using Class Locator
		 driver.findElement(By.className("decorativeSubmit")).click();
		  
		  // Click on CRM/SFA Link
		 
		 driver.findElement(By.partialLinkText("CRM/SFA")).click();
		 
		 //  Click on contacts Button
		 driver.findElement(By.xpath("//li[@class='sectionTabButtonUnselected'][2]//a")).click();
		 
 		//Click on Merge Contacts using Xpath Locator
		 driver.findElement(By.xpath("//ul[@class='shortcuts']/li[4]/a")).click();
		 
		 
		 // 7. Click on Widget of From Contact
		 driver.findElement(By.xpath("//table[@class='twoColumnForm']//a/img")).click();
		 
		 // 8. Click on First Resulting Contact
		 
		 Set<String> winSet=driver.getWindowHandles();
		 List<String> winList= new ArrayList<String>(winSet);
		 
		 driver.switchTo().window(winList.get(1));
		 
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		// driver.close();
		 //Click on Widget of To Contact
		 
		 driver.switchTo().window(winList.get(0));
		 driver.findElement(By.xpath("//table[@class='twoColumnForm']/tbody/tr[2]/td/a/img")).click();
		 
		 //Click on Second Resulting Contact
		 
		 Set<String> winSet1=driver.getWindowHandles();
		 List<String> winList1= new ArrayList<String>(winSet1);
		 
		 driver.switchTo().window(winList1.get(1));
		 
		 driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td[3]/div/a")).click();
		// driver.close();
		 
		
		 // Click on Merge button using Xpath Locator
		 driver.switchTo().window(winList1.get(0));
		 driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		 // 12. Accept the Alert
		 Alert alert=driver.switchTo().alert();
		 alert.accept();
		  
		
		/* 13. Verify the title of the page
		 */
		
		
		

	}

}
