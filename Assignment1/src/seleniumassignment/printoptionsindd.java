package seleniumassignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printoptionsindd {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https:/www.facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement month = driver.findElement(By.id("month"));
		Select allopt = new Select(month);
		List<WebElement> opt = allopt.getOptions();
		for(WebElement e:opt)
		{
			System.out.println(e.getText());
		}
	}

}
