package seleniumassignment;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findLoginButton {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement buttion = driver.findElement(By.name("login"));
	String atti = buttion.getCssValue("background-color");
	System.out.println(atti);
	buttion.click();
	WebElement text = driver.findElement(By.xpath("//div[@id='email_container']"));
	 String color = text.getCssValue("color");
	 System.out.println(color);
	String text1 = text.getText();
	System.out.println(text1);
	WebElement url = driver.findElement(By.linkText("Forgotten password?"));
	String url1 = url.getAttribute("href");
	System.out.println(url1);
	Dimension size = url.getSize();
	System.out.println(size);
	driver.quit();
	}

}
