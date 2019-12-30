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
	  Thread.sleep(1000);
	  bo.findElement(By.xpath("//li[contains(text(),'Hyderabad (All Locations)')]")).click();
	  Thread.sleep(1000);
	  

	  bo.findElement(By.xpath("//input[@id='dest']")).sendKeys("nashik");
	  Thread.sleep(1000);
	  bo.findElement(By.xpath("//li[contains(text(),'Thakkar Bazaar, Nashik')]")).click();
	  Thread.sleep(1000);
	  
	  
	bo.findElement(By.xpath("//label[@class='db text-trans-uc move-up']")).click();
	Thread.sleep(1000);
	bo.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//button[contains(text(),'>')]")).click();
	Thread.sleep(1000);
	bo.findElement(By.xpath("//td[@class='we day'][contains(text(),'4')]")).click();
	Thread.sleep(1000);
	
	
	  bo.findElement(By.xpath("//label[@class='db text-trans-uc tal']")).click();
	  Thread.sleep(1000);
	  bo.findElement(By.xpath("//div[@id='rb-calendar_return_cal']//td[@class='we day'][contains(text(),'12')]")).click();
	
	  bo.findElement(By.xpath("//button[@id='search_btn']")).click();
	  Thread.sleep(1000);
	 
  }
}
