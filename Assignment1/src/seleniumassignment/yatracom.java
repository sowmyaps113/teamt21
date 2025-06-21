package seleniumassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yatracom {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("//p[text()='Departure From']")).click();
		driver.findElement(By.id("input-with-icon-adornment")).sendKeys("bangalore");
		driver.findElement(By.xpath("//div[text()='Kempegowda International ']")).click();
		driver.findElement(By.xpath("//p[text()='Going To']")).click();
		driver.findElement(By.id("input-with-icon-adornment")).sendKeys("kolkata");
		driver.findElement(By.xpath("//div[text()='Netaji Subhas Chandra Bose ']")).click();
		
		

	}

}
