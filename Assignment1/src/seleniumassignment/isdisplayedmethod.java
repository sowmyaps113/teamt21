package seleniumassignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayedmethod {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement logo = driver.findElement(By.tagName("img"));
		boolean is = logo.isDisplayed();
		System.out.println(is);
		if(is)
			System.out.println("is displayed");
		else
			System.out.println("not diplayer");
	}
}


