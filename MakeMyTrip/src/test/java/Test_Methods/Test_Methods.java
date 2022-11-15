package Test_Methods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.Login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Methods {

	
	private static final String LoginPage = null;
	WebDriver driver;
	
	@Test
	 public void beforetest() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Login MMT = new Login(driver);
		
		
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		MMT.LoginBtn();
		Thread.sleep(1000);
		MMT.EmailAdd("9100045109");
		Thread.sleep(1000);
		MMT.ContinueBtn();
		Thread.sleep(1000);
		MMT.RoundTEnable();
		Thread.sleep(1000);
		MMT.From();
		Thread.sleep(1000);
		MMT.EnterFrmCity("Delhi");
		Thread.sleep(2000);	
	    MMT.ToCity("Bengaluru");
		Thread.sleep(1000);
		MMT.DepatureDate();
		Thread.sleep(1000);
		MMT.SelectDeptDate();
		Thread.sleep(2000);
		MMT.ClickReturn();
		Thread.sleep(1000);
		MMT.SelectReturnDate();
		Thread.sleep(2000);
		MMT.SelectStudent();
     	Thread.sleep(1000);
        MMT.Search();
        Thread.sleep(2000);
        MMT.DepartureFlight();
        Thread.sleep(2000);

	

	
		
	
		
	}
}
