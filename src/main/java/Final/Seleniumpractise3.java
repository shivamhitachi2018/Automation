package Final;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpractise3 {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame("frame-top");
        
	    
		driver.switchTo().frame("frame-left");
		
		
	    WebElement first_text=driver.findElement(By.xpath("//body[normalize-space()='LEFT']"));
	   
	   
	    System.out.println(first_text.getText());
	   
	    
	    driver.switchTo().parentFrame();
	    
	    
	    
	    driver.switchTo().frame("frame-right");
	    
	    
	   WebElement right_text= driver.findElement(By.xpath("//body[normalize-space()='RIGHT']"));
	   
	   
	   System.out.println(right_text.getText());
	}

}
