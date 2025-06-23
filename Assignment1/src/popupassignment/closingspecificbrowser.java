package popupassignment;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closingspecificbrowser {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter specific browser name");
		String name = s.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allwin = driver.getWindowHandles();
		for(String e:allwin)
		{
			driver.switchTo().window(e);
			String title = driver.getTitle();
			if(title.contains(name))
			{
				driver.close();
			}
		}

	}

}
