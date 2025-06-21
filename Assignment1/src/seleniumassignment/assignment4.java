package seleniumassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fb.com");
		driver.findElement(By.id("email")).sendKeys("abc@gmail"+Keys.CONTROL+"a"+"c");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.name("pass")).sendKeys(Keys.CONTROL+"v");
		WebElement ele = driver.findElement(By.linkText("Create new account"));
		String color = ele.getCssValue("background-color");
         String font = ele.getCssValue("font-size");
         String tagname = ele.getTagName();
         String tagtext = ele.getText();
         System.out.println("color :"+color);
         System.out.println("font size :"+font);
         System.out.println("tagname :"+tagname);
         System.out.println("tagtext :"+tagtext);
         String tooltiptext = driver.findElement(By.xpath("//a[text()='Sign Up']")).getAttribute("title");
         System.out.println("tooltiptext :"+tooltiptext);
         boolean button = driver.findElement(By.name("login")).isEnabled();
         if(button)
         {
        	 System.out.println("login button is enable");
         }
         else
         {
        	 System.out.println("login button is not enable");
         }
         ele.click();
         Dimension size1 = driver.findElement(By.name("birthday_day")).getSize();
         Dimension size2 = driver.findElement(By.name("birthday_month")).getSize();
        Dimension size3 = driver.findElement(By.name("birthday_year")).getSize();
        System.out.println("size of date button :"+size1);
        System.out.println("size of month button :"+size2);
        System.out.println("size of year button :"+size3);
        int y1 = driver.findElement(By.name("birthday_day")).getLocation().getY();
        int y2 = driver.findElement(By.name("birthday_month")).getLocation().getY();
        int y3 = driver.findElement(By.name("birthday_year")).getLocation().getY();
        if(y1==y2 && y1==y3)
        {
        	System.out.println("dropdown button is alligned");
        }
        else
        {
        	System.out.println("dropdown button is not alligned");
        }
        driver.findElement(By.name("websubmit")).submit();
        driver.quit();

}
}
