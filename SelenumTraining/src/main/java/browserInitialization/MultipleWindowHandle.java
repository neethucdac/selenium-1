package browserInitialization;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandle extends Base {
	public void windowhandle() 
 	{ 
 		driver.navigate().to("https://webdriveruniversity.com/"); 
 		WebElement contactus=driver.findElement(By.xpath("//h1[text()=\"CONTACT US\"]")); 
 		//contactus.click(); 
 		 
 		WebElement loginportal=driver.findElement(By.xpath("//h1[text()=\"LOGIN PORTAL\"]")); 
 		loginportal.click(); 
 		contactus.click(); 
 		 
 		String parent=driver.getWindowHandle(); 
 		System.out.println("parent" +parent); 
 		 
 		Set<String> allwindows=driver.getWindowHandles(); //since morethan one windows are there used getWindowHandles
 		
 		 
 		for(String temp:allwindows) 
 		{ 
 			if(!temp.equals(parent)) 
 			{ 
 			System.out.println("window:"+temp); 
 			driver.switchTo().window(temp); 
 			 
 			System.out.println(driver.getTitle()); 
 			System.out.println(driver.getCurrentUrl()); 
 			System.out.println("********************************************************************"); 
 			 
 		 
 		} 
 		} 
 		 
 		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleWindowHandle obj=new MultipleWindowHandle();
		obj.initializeBrowser();
		obj.windowhandle();

	}

}
