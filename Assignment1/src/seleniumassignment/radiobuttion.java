package seleniumassignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		boolean select = driver.findElement(By.xpath(("(//input[@type='radio'])[1]"))).isSelected();
		System.out.println(select);
		if(select)
			System.out.println("it is selected");
		else
			System.out.println("it is not selected");
		driver.quit();
	}

}
