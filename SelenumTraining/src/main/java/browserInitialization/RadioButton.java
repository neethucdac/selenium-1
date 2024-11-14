package browserInitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButton extends Base{
	public void radioButtonHandling()
	{
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiobutton =driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		radiobutton.click();
		WebElement radiobutton1 =driver.findElement(By.xpath("//button[@id='button-one']"));
		radiobutton1.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButton obj=new RadioButton();
		obj.initializeBrowser();
		obj.radioButtonHandling();

	}

}
