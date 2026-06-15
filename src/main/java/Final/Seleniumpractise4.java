package Final;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Seleniumpractise4 {

	public static void main(String[] args) {
	
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		
		driver.manage().window().maximize();
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		
	     WebElement strt_button=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Start']")));
	   
	    
	    strt_button.click();
	   
	    WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(20));
	    
	    WebElement text=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Hello World!']")));

	    
	    if(text.getText().equals("Hello World!"))
	    {
	    	
	    	
	    	System.out.print("text verified");
	    	
    	
	    }
	    
	    else
	    {
	    	
	    	
	    	System.out.print("text not verified");
	    	
	   	
	    	
	    }
	}

}
