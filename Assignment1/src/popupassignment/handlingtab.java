package popupassignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingtab {

	public static void main(String[] args) {
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://www.flipkart.com/");
          driver.findElement(By.name("q")).sendKeys("iphone 16 pro max"+Keys.ENTER);
          driver.findElement(By.xpath("(//div[contains(text(),'Apple iPhone 16 Pro Max')])[2]")).click();
          Set<String> alltab = driver.getWindowHandles();
          for(String e:alltab)
          {
        	  driver.switchTo().window(e);
          }
          driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
	}

}
