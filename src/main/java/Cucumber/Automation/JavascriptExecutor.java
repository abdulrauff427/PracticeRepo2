package Cucumber.Automation;

import java.io.File;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.TakesScreenshot;
public class JavascriptExecutor {
 
 
 public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver","C:\\Abdul\\chromedriver_win32\\");
 WebDriver driver = new ChromeDriver();
 
 driver.get("http://retailm1.upskills.in/account/login");
 Thread.sleep(20000);
 //JavascriptExecutor jse = (JavascriptExecutor)driver;
 
 //Get current page title
 JavascriptExecutor js = (JavascriptExecutor)driver;
 //js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
 //js.executeScript("arguments[0].click();", button);
 
 String pagetitle=(String)jse.executeScript("return document.title").toString();
   System.out.println("My Page Title Is  : "+pagetitle);
  
  
  
 
   //Get current page URL
   String CurrentURL = driver.getCurrentUrl();
   System.out.println("My Current URL Is  : "+CurrentURL);
  
   // User name-Input
 jse.executeScript("document.getElementById('input-email').setAttribute('value', 'chandu@gmail.com')");
 
 
 //password filed -Input
 
 WebElement password = driver.findElement(By.id("input-password"));
 // Flash the text field
 
 String color = "#FF0000";
 
 jse.executeScript("arguments[0].style.backgroundColor = '" + color + "'",password);
 
 
 
 
 // DrawBorder
 
 jse.executeScript("arguments[0].style.border= '3px solid red'", password);
 
 jse.executeScript("arguments[0].value='mehadi';", password);
 
 //jse.executeScript("document.getElementById('input-password').setAttribute('value', 'admin@123')");
 
 // to return value from the text field -Get Attribute
 
 Thread.sleep(20000);
 
 String text = driver.findElement(By.id("input-password")).getAttribute("innerHTML");
 
 //String text = jse.executeScript("return document.getElementById('input-password').getAttribute("innerHTML");.toString();
    System.out.println("Text on passwordfield- " +text );
 
 //Perform Click on LOGIN button using JavascriptExecutor 
 
 WebElement button =driver.findElement(By.xpath("//input[@type='submit']")); 
 
 
 jse.executeScript("arguments[0].click();", button);
 
 
 
 //Click on Checkbox button
   
    //Javascript command sometimes check box status is false
 
   // JavascriptExecutor js = (JavascriptExecutor)driver;
   // js.executeScript("document.getElementsByName('DelId').checked=false;");
   
    //Javascript command
   
   // jse.executeScript("document.getElementById('u_0_b').click();");
   
   
    // Create an alert
      
   jse.executeScript("alert('Test Case Execution Is started Now..');");
    Thread.sleep(2000);
    driver.switchTo().alert().accept();
   
    // Scroll the Window
   
    WebElement element = driver.findElement(By.xpath("//*[@id=\"IconList_RSaTAtQ5\"]/ul/li[3]/div/a"));
    jse.executeScript("arguments[0].scrollIntoView(true);", element);
      
   
    
   
 }
 public void finalize()
 {
	 
 }
 
}
