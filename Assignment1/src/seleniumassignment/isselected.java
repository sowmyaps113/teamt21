package seleniumassignment;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement login = driver.findElement(By.xpath("//a[text()='Create new account']"));
	    login.click();
	  WebElement  radio2 = driver.findElement(By.xpath("//label[text()='Male']"));
	   radio2.click();
	   Thread.sleep(3000);
	   WebElement  radio3 = driver.findElement(By.xpath("//label[text()='Male']//input[1][@id='sex'][1]"));
	   boolean b = radio3.isSelected();
	   System.out.println(b);
	   driver.quit();
	   if(b)
	   {
		   System.out.println("is selected");
	   }
	   else {
		   System.out.println("is not selected"); 
	   }
	   
	}

}
