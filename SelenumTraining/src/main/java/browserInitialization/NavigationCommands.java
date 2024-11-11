package browserInitialization;

public class NavigationCommands extends Base{
	public void navigateCommands() 
 	{ 
 		driver.navigate().to("https://www.amazon.in/"); 
 		driver.navigate().back(); 
 		driver.navigate().forward(); 
 		driver.navigate().refresh(); 
 	} 
  
 	public static void main(String[] args) { 
 		NavigationCommands n=new NavigationCommands(); 
 		n.initializeBrowser(); 
 		n.navigateCommands(); 
 		n.driverQuit(); 
  
 	}



}
