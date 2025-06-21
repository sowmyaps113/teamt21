package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkallignment 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement login = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		int c = login.getLocation().getX();
		System.out.println(c);
		login.click();
		WebElement radio1 = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		int a = radio1.getLocation().getY();
		System.out.println(a);
		WebElement radio2 = driver.findElement(By.xpath("//label[text()='Male']"));
		int b = radio2.getLocation().getY();
		System.out.println(b);
		driver.quit();
		if(a==b)
		{
			System.out.println("is allined");
		}
		else 
		{
			System.out.println("is not allined"); 

		}
	}
}


