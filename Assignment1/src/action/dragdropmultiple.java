package action;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdropmultiple {

	public static void main(String[] args) {
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.get("https://demoapps.qspiders.com/ui?scenario=1");
       driver.findElement(By.xpath("//section[text()='Web Elements']")).click();
       driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
       driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
       driver.findElement(By.linkText("Drag Multiple")).click();
       List<WebElement> allopt = driver.findElements(By.className("draggable-elemment"));
      System.out.println( allopt.size());
       WebElement moblie = driver.findElement(By.xpath("//div[text()='Mobile Accessories']/.."));
       WebElement laptop = driver.findElement(By.xpath("//div[text()='Laptop Accessories']/.."));
       Actions a=new Actions(driver);
       for(int i=0;i<allopt.size();i++)
       {
    	   
    	  WebElement drag = allopt.get(i);
    	   String text = drag.getText();
    	   if(text.contains("Mobile")) {
    		   drag.click();
    		   a.dragAndDrop(drag, moblie).perform();
    	   }
    	   else if(text.contains("Laptop")){
    		   drag.click();
    		   a.dragAndDrop(drag, laptop).perform();
    	   }
       }
       
       
	}

}
