package popupassignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class pibgovinassignment {

	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://pib.gov.in");
        driver.switchTo().alert().accept();
        driver.findElement(By.linkText("Ministry of Education")).click();
        driver.switchTo().alert().accept();
        String pw = driver.getWindowHandle();
       Set<String> alltab = driver.getWindowHandles();
       for(String e:alltab)
       {
    	   driver.switchTo().window(e);
    	   if(!pw.equals(e))
    	   {
    	   System.out.println(driver.getTitle()); 
    	   }
       }
        

	}

}
