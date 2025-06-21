package popupassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class conformationpopup {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      driver.get("https://demo.automationtesting.in/Alerts.html");
	      driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	      driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
	      driver.switchTo().alert().dismiss();
	}

}
