package seleniumassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class caresuranceweb {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
        driver.findElement(By.name("policynumber")).sendKeys("123");
        driver.findElement(By.id("dob")).click();
       WebElement dd = driver.findElement(By.className("ui-datepicker-year"));
       Select s = new Select(dd);
       s.selectByVisibleText("1999");
       WebElement dd1 = driver.findElement(By.className("ui-datepicker-month"));
       Select s1 = new Select(dd1);
       s1.selectByVisibleText("Mar");
       driver.findElement(By.xpath("//a[text()='2']")).click();
       driver.findElement(By.id("alternative_number")).sendKeys("9876543210");
       driver.findElement(By.id("renew_policy_submit")).click();
       WebElement text = driver.findElement(By.id("policynumberError"));
       String msg = text.getText();
       System.out.println(msg);
	}

}
