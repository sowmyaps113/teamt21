package popupassignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindowpopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allwin = driver.getWindowHandles();
		for(String e:allwin)
		{
			driver.switchTo().window(e);
			System.out.println(driver.getTitle());
			driver.close();
		}

	}

}
