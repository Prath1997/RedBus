package page1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BusticketTest {
	WebDriver bo;
	String bpath="https://www.redbus.in/";
	
	
	
  @Test
  public void TC_Busticket() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA3\\Desktop\\prathamesh new\\chromedriver.exe");
	  bo=new ChromeDriver();
	  bo.get(bpath);
	  bo.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  bo.manage().window().maximize();
	  
	
	  bo.findElement(By.xpath("//input[@id='src']")).sendKeys("hyderbad");
	  bo.findElement(By.xpath("//li[contains(text(),'Hyderabad (All Locations)')]")).click();

	  bo.findElement(By.xpath("//input[@id='dest']")).sendKeys("nashik");
	  bo.findElement(By.xpath("//li[contains(text(),'Thakkar Bazaar, Nashik')]")).click();
	  
	  bo.findElement(By.xpath("//input[@id='onward_cal']")).click();
	  
	  bo.findElement(By.xpath("//label[@class='db text-trans-uc tal']")).click();
	  bo.findElement(By.xpath("//div[@id='rb-calendar_return_cal']//button[contains(text(),'>')]")).click();
	  bo.findElement(By.xpath("//td[@class='we day'][contains(text(),'4')]")).click();
  }
}
