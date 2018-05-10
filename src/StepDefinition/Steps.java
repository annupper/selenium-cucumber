
package StepDefinition;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				

    WebDriver driver;			
    		
    @Given("^Open the Chrome and launch the application$")					
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\anna.zhuravleva\\Documents\\Alrquitectura\\WebDrivers\\ChromeDriver\\chromedriver.exe");					
       driver= new ChromeDriver();					
       driver.manage().window().maximize();			
       driver.get("http://www.demo.guru99.com/v4");					
    }		

    @When("^Enter the Username (User\\d+) and Password (password\\d+)$")
    public void enter_the_Username_User_and_Password_password(String username, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	 driver.findElement(By.name("uid")).sendKeys(username);					
         driver.findElement(By.name("password")).sendKeys(password);		
        throw new PendingException();
    }
    	

    @Then("^Reset the credential$")					
    public void	Reset_the_credential() throws Throwable 							
    {		
       driver.findElement(By.name("btnReset")).click();					
    }		
}
