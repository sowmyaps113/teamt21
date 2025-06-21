package popupassignment;

import java.net.MulticastSocket;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingmultitab {

	public static void main(String[] args) {
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
          driver.get("https://demoapps.qspiders.com/ui/browser");
          driver.findElement(By.linkText("Multiple Tabs")).click();
          driver.findElement(By.xpath("//button[text()='Click to open multiple tabs']")).click();
          Set<String> alltab = driver.getWindowHandles();
          for(String e:alltab)
          {
        	  driver.switchTo().window(e);
        	  System.out.println(driver.getTitle());
        	  System.out.println(driver.getCurrentUrl());
          }
        
	}

}
