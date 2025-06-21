package seleniumassignment;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment5 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://online.actitime.com/ssandeep/login.do");
String url = driver.getCurrentUrl();
System.out.println(url);
String title = driver.getTitle();
System.out.println(title);
String page = driver.getPageSource();
System.out.println(page);
	}

}
