package Cucumber.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Abdul\\chromedriver_win32\\");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://retailm1.upskills.in/account/login");
		 Thread.sleep(20000);
		 
		//Get current page title
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 String pagetitle=(String)jse.executeScript("return document.title").toString();
		   System.out.println("My Page Title Is  : "+pagetitle);
	}
// need to find out how to fix this error
}
