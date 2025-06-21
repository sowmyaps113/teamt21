package frame;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingnestedframe {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		//WebElement frame = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(0);
		String email = driver.findElement(By.xpath("(//p[@class='para'])[1]")).getText();
		System.out.println(email);
		String pwd = driver.findElement(By.xpath("(//p[@class='para'])[2]")).getText();
		String rped = driver.findElement(By.xpath("(//p[@class='para'])[3]")).getText();
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys(email);


	}

}
