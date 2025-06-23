package seleniumassignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printduplicate {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/santhosh/Documents/locations%20-%20Copy.html");
		WebElement list = driver.findElement(By.id("city"));
		Select opt = new Select(list);
		List<WebElement> allopt = opt.getOptions();
		Set<String> obj=new HashSet();
		for(WebElement e:allopt)
		{
			String text = e.getText();
			 boolean f = obj.add(text);
			 if(f==false)
				 System.out.println(text);
		}
		driver.quit();
		

	}

}
