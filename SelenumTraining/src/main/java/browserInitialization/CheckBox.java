package browserInitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends Base {
	public void checkBoxTest()
	{
		
		WebElement inputForm=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputForm.click();
		//a[@href='check-box-demo.php']
		WebElement checkBox=driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));
		checkBox.click();
		WebElement singlecheckBox=driver.findElement(By.xpath("//input[@id=\"gridCheck\"]"));
		singlecheckBox.click();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBox obj=new CheckBox();
		obj.initializeBrowser();
		obj.checkBoxTest();

	}

}
