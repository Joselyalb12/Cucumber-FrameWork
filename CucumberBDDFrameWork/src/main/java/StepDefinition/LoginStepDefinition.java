package StepDefinition;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;
	
	
	
	@Given("User is already in login page$")
	public void user_is_already_in_login_page() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver.exe");
		driver.get("https://www.ebay.com");
		;
		
	}

	
	@When("^title of the login page is Ebay$")
	public void title_of_login_page_is_Ebay() {	
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay", title);
		
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws InterruptedException{
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='userid']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("Josely.r.alberto@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("J.A.-39969");
		Thread.sleep(3000);
	}
		
		@Then("^user clicks on login button$")
		public void user_clicks_on_login_button() {
		driver.findElement(By.id("sgnBt")).click();
	}
		@Then("^User is on homepage$")
		public void user_is_on_homepage() {
			String title =driver.getTitle();
			System.out.println("homePage title" + title);
			Assert.assertEquals("Josely", title);
			
		}
	
	
	
	
	
	
}
