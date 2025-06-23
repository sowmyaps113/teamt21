package seleniumassignment;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tocheckcityname {

	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter city name");
		String name = s.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/santhosh/Documents/locations%20-%20Copy.html");
		WebElement city = driver.findElement(By.id("city"));
		Select option = new Select(city);
		List<WebElement> allopt = option.getOptions();
		int count=0;
		for(WebElement e:allopt)
		{
			String text = e.getText();
		
	
	 if(name.equalsIgnoreCase(text))
			{
				count++;
			break;
			}
		}
		
		if(count==1)
		{
			System.out.println("the city name is exist in dd");
		}
		else
		{
			System.out.println("the city name is not exist in dd");
		}
	
	driver.quit();

	}

}

