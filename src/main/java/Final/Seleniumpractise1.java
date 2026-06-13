package Final;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpractise1 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	  WebElement user_nametext=driver.findElement(By.xpath("//input[@placeholder='Username']"));
	 
		
	  user_nametext.sendKeys("standard_user");
	 
	
	  WebElement pass_nametxt=driver.findElement(By.xpath("//input[@placeholder='Password']"));

	 
	
	  pass_nametxt.sendKeys("secret_sauce");
	 
	 
	  WebElement button= driver.findElement(By.xpath("//input[@type='submit']"));
	 
	 
	  button.click();
	
	
	
	
	 System.out.println(driver.getCurrentUrl());
	
	
	 WebElement add_button=driver.findElement(By.xpath("//button[normalize-space()='Add to cart']"));
	
	
	 add_button.click();
	
	
	 WebElement newbutton=driver.findElement(By.xpath("//span[contains(@class,'shopping_cart_badge')]"));
	
	
	 newbutton.click();
	
	
     WebElement check_button=	driver.findElement(By.xpath("//button[normalize-space()='Checkout']"));
	
    
     check_button.click();
  
    
    
     WebElement fname=  driver.findElement(By.xpath("//input[@placeholder='First Name']"));
  
  
  
     fname.sendKeys("shivam");
    
    
    
      WebElement lname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
    
    
    
     lname.sendKeys("pandey");
    
    
    
     WebElement zip= driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
    
    
     zip.sendKeys("208005");
    
    
     WebElement submit=  driver.findElement(By.xpath("//input[@type='submit']"));
    
    
     submit.click();
     
     
     Thread.sleep(5000);
     
    
     WebElement submit_button=  driver.findElement(By.id("finish"));
   
    
     submit_button.click();
    
     
     

    
    
	
	}

}



