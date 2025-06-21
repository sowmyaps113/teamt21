package popupassignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closingchildwindowusingiterator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		String pw = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		Iterator<String> i = allwin.iterator();
		while(i.hasNext())
		{
			String wid = i.next();
			driver.switchTo().window(wid);
			if(!pw.equals(wid))
			{
				driver.close();
			}
		}

	}

}
