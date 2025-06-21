package seleniumassignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

	public static void main(String[] args) throws InterruptedException {
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https:/www.flipkart.com");
          driver.findElement(By.name("q")).sendKeys("google pixel");Thread.sleep(2000);
          List<WebElement> allsug = driver.findElements(By.tagName("li"));
          int s = allsug.size();
          for(WebElement a:allsug)
          {
        	  System.out.println(a.getText());
          }
         driver.quit();
	}

}
