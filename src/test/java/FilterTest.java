import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FilterTest {
	  @BeforeTest(groups= {"sanity","regression","full"})
	  public void CompileNDeployFilter() {
		  System.out.println("CompileNDeployFilter");
	  }
	  @Test (groups= {"sanity","regression","full"})
	  public void A_SanityFilter() {
		  System.out.println("SanityFilter");
		//Create Driver Object
		  System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		  //Actions on browser
		  driver.get("https://www.google.com");
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  //Close browser
		  driver.close();
	  }
	  @Test (groups= {"regression","full"}) 
	  public void B_RegrssionFilter() {
		  System.out.println("RegrssionFilter");
		//Create Driver Object
		  System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		  //Actions on browser
		  driver.get("https://www.google.com");
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  //Close browser
		  driver.close();
	  }
	  @Test (groups= {"full"})
	  public void C_FullFilter() {
		  System.out.println("FullFilter");
		//Create Driver Object
		  System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		  //Actions on browser
		  driver.get("https://www.google.com");
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  //Close browser
		  driver.close();
	  }
}
