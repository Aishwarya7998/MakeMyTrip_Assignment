package Objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	
	
	@FindBy(how=How.XPATH, using= "//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]")
	WebElement Login;
	
	
	@FindBy(name ="username") 
	WebElement Email;
	
	@FindBy(xpath = "//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button")
	WebElement ContBtn;
	
	@FindBy(xpath ="//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[2]")
	WebElement RoundTrip;
	
	@FindBy(id = "fromCity")
	WebElement Fromcity;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")
	WebElement EnterCity;
	
	
	@FindBy(id ="toCity")
	WebElement Tocity;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label/p[1]")
	WebElement Departure;
	
	@FindBy(xpath ="/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[6]/div/p")
	List<WebElement> SelectDepDate;
	
   
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[4]/label/span")
	WebElement Return;
	
	@FindBy(xpath= "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[4]")
	WebElement ReturnDate;
	
    @FindBy(xpath ="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/div[1]/ul/li[3]")
    WebElement FareType;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")
	WebElement SearchFlights;	
	
	@FindBy(xpath="//*[@id=\"flightCard-333\"]/div/div[2]/div[2]/span/span/span")
	WebElement DepartureFlight;

	
    public Login(WebDriver d) {
    	
    		//this.driver =driver;
    		driver =d;
    		PageFactory.initElements(d, this);
    	
		}
	
	public void LoginBtn() {
		Login.click();
	}
	
	public void EmailAdd(String email) {
		Email.sendKeys(email);
	}
	
	public void ContinueBtn() {
		ContBtn.submit();
	}
	
	public void RoundTEnable() {
		RoundTrip.click();
	}
	
	public void From() {
		Fromcity.click();
	}
	
	public void EnterFrmCity(String CityName)
	{
		EnterCity.sendKeys(CityName);
	}
	
    public void ToCity(String TocityName) {
		Tocity.sendKeys(TocityName);
	}
	
	public void DepatureDate() {
		Departure.click();
	}
	
	
	
	public void SelectDeptDate() {
		((WebElement) SelectDepDate).submit();
	}
	
	public void ClickReturn() {
		Return.click();
	}
	
	public void SelectReturnDate() {
		ReturnDate.submit();
	}
	
	public void SelectStudent() {
		FareType.click();
	}
	
	public void Search() {
		SearchFlights.click();
	}
	
	public void DepartureFlight() {
      DepartureFlight.click();
 }
}
		