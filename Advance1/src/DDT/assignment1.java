package DDT;

import java.io.Closeable;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.remote.server.handler.GetAlertText;

import practice.geckoDriver;

public class assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./Softwares/chromeDriver.exe");
                 ChromeDriver driver = new ChromeDriver();
                 driver.get("https://www.amazon.in//");
                 Thread.sleep(2000);
                 driver.findElement(By.xpath("//input[@type='text']")).sendKeys(" iphone 13 green");
                 Thread.sleep(2000);
                 driver.findElement(By.xpath("//input[@type='submit']")).click();
                 Thread.sleep(2000);
             WebElement a= driver.findElement(By.xpath("(//span[text()='72,989'])[1]"));
             Thread.sleep(2000);
             String b = a.getText();
                 System.out.println(b);
       Thread.sleep(4000);
                 driver.get("https://www.flipkart.com/");
                 Thread.sleep(2000);
                driver.findElement(By.xpath("//input[@type='text']")).sendKeys(" iphone 13 green");
                 Thread.sleep(2000);
                driver.findElement(By.xpath("//button[text()='✕']")).click();
                 Thread.sleep(2000);
                 driver.findElement(By.xpath("//button[@type='submit']")).click();
                Thread.sleep(2000);
            WebElement a1= driver.findElement(By.xpath("//div[text()='₹71,999']"));
             Thread.sleep(2000);
             String b1 = a1.getText();
                 System.out.println(b1);
                if(b==b1 )
                
                {
            System.out.println("price are same");	
                }
                else
                {
                	System.out.println("price are not same,amazon price are changes with flipkart");
                }
                
               
                 
	}

	
	}

	

