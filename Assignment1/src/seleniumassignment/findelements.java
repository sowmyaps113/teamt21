package seleniumassignment;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class findelements {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("samsung phone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	   driver.findElement(By.xpath("(//div[contains(text(),'SAMSUNG Galaxy')])[3]")).click();
	  
	   
	  
	 
	}

}
