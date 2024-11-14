package browserInitialization;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptExecutorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver(); 
 		driver.get("https://www.amazon.in/"); 
 		   driver.manage().window().maximize(); 
 		   JavascriptExecutor js = (JavascriptExecutor) driver;   
 			js.executeScript("window.scrollBy(0,2000)",""); 
 			js.executeScript("window.scrollBy(0,-1000)",""); //1000 is height
 			//js.executeScript("window.scrollBy(0,-100)", "");
 			WebElement search=driver.findElement(By.id("twotabsearchtextbox")); 
 			js.executeScript("arguments[0].click();",search); 
 			search.click();
	}

}
