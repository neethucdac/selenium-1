package browserInitialization;

public class BrowserCommands extends Base {
	 public void browserCommands() 
	 	{ 
	 		String title=driver.getTitle(); //title of lanuch browser
	 		System.out.println(title); 
	 		String url=driver.getCurrentUrl(); //to get current url
	 		System.out.println(url); 
	 		String pagesource=driver.getPageSource(); //to get html code
	 		System.out.println(pagesource); 
	 	} 
	  
	 	public static void main(String[] args) { 
	 		BrowserCommands b=new BrowserCommands(); 
	 		b.initializeBrowser(); 
	 		b.browserCommands(); 
	 		b.driverQuit(); 
	  
	 	}


}
