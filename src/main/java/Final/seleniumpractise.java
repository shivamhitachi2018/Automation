package Final;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumpractise {

	public static void main(String[] args) {
	
		
		WebDriver driver=new ChromeDriver();
		


		
		driver.get("https://demoqa.com/automation-practice-form");
		
		
		
		driver.manage().window().maximize();
		
		
		
		
		System.out.println(driver.getTitle());
		
		
		
		
		
	    WebElement first_txt=driver.findElement(By.id("firstName"));
	    
	    
	    
	    
	    first_txt.sendKeys("vaishnavi");
	    
	    
		
		WebElement last_txt=driver.findElement(By.id("lastName"));
		
		
		
		
		last_txt.sendKeys("pandey");
		
		
		
		
		WebElement mail_txt=driver.findElement(By.id("userEmail"));
		
		
		
		
		 mail_txt.sendKeys("shivamhitachi2018@gmail.com");
		 
		 
		 
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 
		 
		 
		
		WebElement button=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[normalize-space()='Male']")));
		
		
		
		
		button.click();
		
		
	
		 
		
		
		WebElement number_txt=driver.findElement(By.id("userNumber"));
		
		
		
		number_txt.sendKeys("7565045407");
		
		
		
		WebElement checkbox=driver.findElement(By.xpath("//input[contains(@class,'form-check-input') and  @id='hobbies-checkbox-1']"));
		
		
		checkbox.click();
		
		
		
		
	   WebElement picture=driver.findElement(By.id("uploadPicture"));
	   
	   
	 
	   
	   picture.sendKeys("C:\\Users\\shiva\\Downloads\\students.json");
	   
	   
	   
	   WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
	   
	   
	   
	   
	   WebElement address_txt=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Current Address']")));
	   
	  
	
		
		
	  address_txt.sendKeys("267/9 shastri nagar, kanpur");
	  
	  
	  
	   
		
      WebElement state=driver.findElement(By.id("state"));
      
      
	  
	  
	  state.click();
		  
	   
	  
	  WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
	  
	  
	  
	  
	  wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Haryana']"))).click();
	  
	  
	  
	  
	
	   
	  
	  WebElement city1=driver.findElement(By.xpath("//div[normalize-space()='Select City']"));
	  
	  
	  city1.click();
	   
	  
	  WebDriverWait wait3= new WebDriverWait(driver, Duration.ofSeconds(10));
	  
	  
	
	  
	   
	
	  WebElement city2= wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[normalize-space()='Karnal']")));
	  
	  
	  city2.click();
	  
	  
	  
	  
	  WebDriverWait wait4= new WebDriverWait(driver, Duration.ofSeconds(10));
	
	  
	  
	
	WebElement btn_click= wait4.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
	   
	
	   
	 btn_click.click();
	  
	  
	
	WebElement msg= driver.findElement(By.xpath("//div[normalize-space()='Thanks for submitting the form']"));
	
	
	
	
	
    	String msg1= msg.getText();
	
	
	  
	  if(msg1.equals("Thanks for submitting the form"))
	  {
		  
		  System.out.println("message verified");
		  
		   
		  
	  }
		
	  else
	  {
		  
		  
		  System.out.print("message not  verified");
		  
		  
		  
	  }

	}

}
