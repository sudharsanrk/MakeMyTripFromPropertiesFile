package Genriclib;





import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Libaries 
{
	public WebDriver driver;
	 
	

	public void Scrollbar(WebElement ele) throws InterruptedException
	{
		
		Point loc=ele.getLocation();
		int X = loc.getX();
		int Y = loc.getY();
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("windows.scrollBy("+X+"+"+Y+")");
		 
		Thread.sleep(10000);
		}
	
	public String PropertiesFile (String ele) throws IOException
	{
		Properties pro = new Properties();
        FileInputStream file = new FileInputStream(Address.propertiesfile);
        pro.load(file);
        return   pro.getProperty(ele);

	
	}

	

	
	
	
	
	
	
}
