package action;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.linkText("Button")).click();
		driver.findElement(By.linkText("Double Click")).click();
		WebElement click = driver.findElement(By.id("btn20"));
		Actions a=new Actions(driver);
		a.doubleClick(click).perform();
		 WebElement text = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
		boolean displayed = text.isDisplayed();
		if(displayed)
			System.out.println("the text is displayed :"+text.getText());
		else
			System.out.println("the text is not displayed");
		driver.quit();
	    
	}

}
