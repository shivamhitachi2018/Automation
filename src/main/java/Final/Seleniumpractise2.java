package Final;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpractise2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
      	WebElement button=	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
      	
		
      	
      	button.click();
      	
      	
		
	   Alert alert=	driver.switchTo().alert();
		
		
		alert.accept();
		
		
		WebElement txt=driver.findElement(By.xpath("//p[normalize-space()='You successfully clicked an alert']"));
		
		
		if(txt.getText().equals("You successfully clicked an alert"))
		{
			
			

		System.out.println("text is verified");
			
		
		}
		
		else
		{
			
			System.out.println("text is not verified");
			
		
			
			
		}
		
		
	     WebElement button1=	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"));
		
		
		button1.click();
		
		
	     Alert alert1=driver.switchTo().alert();
		
		
		alert1.dismiss();
		
		
	   WebElement txt2=	driver.findElement(By.xpath("//p[normalize-space()='You clicked: Cancel']"));
		
		
	   if(txt2.getText().equals("You clicked: Cancel"))
		
	  {
		  
		  System.out.println("text verified");
			  
		  
	  }
	  else
	  {
		  
		  
  	  System.out.println("text is not verified");
		  
		 	 	  
	  }
		
	   
	  WebElement button2=  driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
		
	 
	 
	  button2.click();
		
	
		
	  Alert alert3=driver.switchTo().alert();
		
		
		
	  alert3.sendKeys("shivam");
	  
	 
		
	  if(alert3.getText().equals("I am a JS prompt"))
		
		{
			
			System.out.println("text is ok");
			
				
		}
		
	 else
	 {
		 	 
			 
		 System.out.println("text is not fine");
	 }
		
		
	}

}
