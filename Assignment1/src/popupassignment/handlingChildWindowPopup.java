package popupassignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingChildWindowPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		String a = driver.getWindowHandle();
		Set<String> opt = driver.getWindowHandles();
		for(String e:opt)
		{
		  driver.switchTo().window(e);
		  System.out.println(driver.getTitle());
		  driver.close();
		}
	}

}
