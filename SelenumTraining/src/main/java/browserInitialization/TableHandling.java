package browserInitialization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base{
	public void tablePrint()
	{
		WebElement navigate=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		navigate.click();
		WebElement table=driver.findElement(By.xpath("//a[@href='table-pagination.php']"));
		table.click();
		WebElement tableprint=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(tableprint.getText());
		System.out.println("");
		
		
	}
	public void rawPrint()
	{
		WebElement navigate=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
		navigate.click();
		WebElement table=driver.findElement(By.xpath("//a[@href='table-pagination.php']"));
		table.click();
		WebElement tablerow=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]"));
		// WebElement row = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]"));
		System.out.println(tablerow.getText());
		
		
	}
	public void coulmnPrint()
	{	WebElement navigate=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
	navigate.click();
	WebElement table=driver.findElement(By.xpath("//a[@href='table-pagination.php']"));
	table.click();
	List <WebElement> tablecoulmn=driver.findElements(By.xpath(" //table[@id='dtBasicExample']/tbody/tr/td[1] ")); //call findElements to list more elements
	 for(WebElement menu:tablecoulmn) 
	 { 
	 	System.out.println(menu.getText());
		
	}
	}
	public void elementSearch() 
		{ 
			String input="Ashton Cox"; 
			driver.navigate().to("https://selenium.qabible.in/table-pagination.php"); 
			List<WebElement> table=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]")); 
			for(WebElement element:table) 
			{ 
			if(element.getText().equals(input)) 
			{ 
				System.out.println(element.getText()); 
				 
			} 
			} 
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling obj=new TableHandling();
		obj.initializeBrowser();
		//obj.tablePrint();
		//obj.rawPrint();
		obj.coulmnPrint();

	}

}
