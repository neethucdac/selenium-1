package browserInitialization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver; //is an interface,declared globally
 	public void initializeBrowser() 
 	{ 
 	driver=new ChromeDriver(); 
 	//driver=new EdgeDriver(); 
 	//driver=new FirefoxDriver(); 
 	driver.get("https://selenium.qabible.in/index.php"); 
 	driver.manage().window().maximize(); 
 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait
 	} 
 public void driverQuit() 
 { 
 	//driver.close(); //closes only current page
 	//driver.quit(); //closes all pages
 } 
 	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b=new Base(); 
	 	b.initializeBrowser(); 
	 	b.driverQuit(); 
	  

	}

}
