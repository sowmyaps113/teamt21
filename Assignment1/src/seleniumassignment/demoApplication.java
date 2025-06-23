package seleniumassignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoApplication {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.tagName("p")).click();Thread.sleep(5000);
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();Thread.sleep(3000);
		//WebElement table = driver.findElement(By.tagName("tr"));
		WebElement row1 = driver.findElement(By.xpath("//th[@scope='col']/.."));
		String e = row1.getText();
		System.out.println(e+"    ");
		WebElement row2 = driver.findElement(By.xpath("(//td/..)[1])"));
		String e1 = row2.getTagName();
		System.out.println(e1+"   ");
		/*for(int i=0;i<row1.size();i++)
		{
		String n = row1.get(1).getText();
		System.out.print(n+"     ");
		}
		
		
		/*int s = table.size();
		for(int i=0;i<s;i++)
		{
			System.out.println(table.get(i).getText());

		}*/
   driver.quit();
	}
}
