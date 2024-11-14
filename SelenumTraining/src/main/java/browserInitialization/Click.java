package browserInitialization;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Click extends Base {
public void inputform()
{
WebElement element=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));	
element.click();
}
public void enterMessage()
{
	WebElement element1=driver.findElement(By.xpath("//input[@type='text']"));
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25)); 
	element1.sendKeys("Hello");
	wait.until(ExpectedConditions.visibilityOf(element1));//IF ANY EXCEPTION COMES HERE ADD WAIT AND CHECK WHETHER TEXT IS SHOWN
	WebElement element2=driver.findElement(By.xpath("//button[@id='button-one']"));
	
	wait.until(ExpectedConditions.elementToBeClickable(element2));
	wait.until(ExpectedConditions.elementToBeSelected(element2));
	element2.click();
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Click obj=new Click();
		
		obj.initializeBrowser();
		obj.inputform();
		obj.enterMessage();

	}

}
