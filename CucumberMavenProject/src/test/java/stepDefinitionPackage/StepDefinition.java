package stepDefinitionPackage;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	@Given("the user launches the particular url {string}")
	public void the_user_launches_the_particular_url(String url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
//	@When("the user given username and password {string} {string}")
	@When("the user given username and password")
	
	public void the_user_given_username_and_password(DataTable table) {
//		List<String> credital = table.asList();
//		String uname = credital.get(0);
//		String pass = credital.get(1);
		Map<String, String> creditial = table.asMap(String.class, String.class);
		String uname = creditial.get("username");
		String pass = creditial.get("password");
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
	}
	
	@And("the user clicks login button")
	public void the_user_clicks_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Then("the user verifies the Title and url of the application")
	public void the_user_verifies_the_Title_and_url_of_the_application()
	{
		String actualTitle = driver.getTitle();
		String currenturl = driver.getCurrentUrl();
		System.out.println("Actual Title:"+" " +actualTitle +"\n" +"Current URL:"+" " +currenturl);
	}
	

}
