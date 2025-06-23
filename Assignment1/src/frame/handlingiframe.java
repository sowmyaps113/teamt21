package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingiframe {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/santhosh/Documents/T1.html");
		driver.findElement(By.id("t1")).sendKeys("1");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("2");
		driver.switchTo().frame("f2");
		driver.findElement(By.id("t3")).sendKeys("3");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t2")).sendKeys("4");
		WebElement ele = driver.findElement(By.name("f2"));
		driver.switchTo().frame(ele);
		driver.findElement(By.id("t3")).sendKeys("5");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("6");
	}

}
