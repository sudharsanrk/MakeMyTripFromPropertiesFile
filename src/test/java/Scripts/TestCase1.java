package Scripts;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Genriclib.Baseclass;
import PomPages.CompleteBooking;
import PomPages.CompleteYourBooking;
import PomPages.Flights;
import PomPages.HomePage;
import PomPages.ProceedPay;

public class TestCase1 extends Baseclass{
	public ExtentReports extent;
	public ExtentTest test;

	
	@Test
	public void tc1() throws IOException, InterruptedException, AWTException 
	{
		test=extent.createTest("tc1");
	    HomePage Ho = new HomePage(driver);
		Ho.From(driver);
		Ho.TO();
		Ho.Chennai(driver);
		Ho.Next(driver);
		Ho.Date(driver);		
		Ho.Search();
		
		
		Flights fl = new Flights(driver);
		Thread.sleep(8000);
	    fl.Close(driver);
	    fl.ViewPrices();
		fl.Booking(driver);
		
		
		CompleteYourBooking co = new CompleteYourBooking(driver);
		Thread.sleep(9000);
		co.view(driver);
		co.AddNew(driver);
		co.FirstName();
		co.LastName();
		co.Male();
		co.PhoneNO();
		co.EmailId(driver);
		co.Continue();
		co.Confirm();
		
		CompleteBooking cp = new CompleteBooking(driver);
		cp.NoLetMeChoose();
		cp.Continue();
	    ProceedPay pay = new ProceedPay(driver);
	    pay.ProceedPayButton();
	   
	    
		}

}
