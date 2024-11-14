package browserInitialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void locators()
	{
		WebElement message=driver.findElement(By.id("single-input-field"));//webelement is an interface
		WebElement name=driver.findElement(By.name("description"));
		WebElement classname=driver.findElement(By.className("header-top"));
		WebElement linktext=driver.findElement(By.linkText("simple-form-demo.php"));
		WebElement partiallinktext=driver.findElement(By.partialLinkText("simple-form"));
		WebElement xpath=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
		
		WebElement relativexpath=driver.findElement(By.xpath("//label[@for='inputEmail4']"));
		WebElement cssselectortagid= driver.findElement(By.cssSelector("div #collapsibleNavbar"));
		WebElement cssselectortagclass= driver.findElement(By.cssSelector("div.collapse navbar-collapse"));
		WebElement cssselectortag= driver.findElement(By.cssSelector("div[id=collapsibleNavbar]"));
		WebElement cssselectortagclaSS= driver.findElement(By.cssSelector("button.navbar-toggler[type=button]"));
		

				
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
