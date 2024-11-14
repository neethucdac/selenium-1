package browserInitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base {
	public void dropDownHandling()

	{
		WebElement inputForm=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		inputForm.click();
		WebElement checkBox=driver.findElement(By.xpath("//a[@href='select-input.php']"));
		checkBox.click();
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(dropDown);
		//select.selectByValue("Red");
		//select.selectByVisibleText("Yellow");
		select.selectByIndex(2);

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DropDown obj=new DropDown();
		obj.initializeBrowser();
		obj.dropDownHandling();
		
	}

}
