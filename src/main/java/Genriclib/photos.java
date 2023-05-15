package Genriclib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class photos {
	public void ScreenShort(WebDriver driver) throws IOException
	{
		TakesScreenshot ts =  (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
	    File fs = new File(Address.Photopath);
        FileUtils.copyFile(file, fs);
	}
}
