package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert; 

public class GreenKartStepDefinition {
public WebDriver driver;
public String productName;
public String offerPageProduct;
	
	@Given("User is on GreenKart page")
	public void user_is_on_green_kart_page() {
	    
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Corado\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
	}
	
	@When("User searched with shortname {string} and extracted actual name of product")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
	    
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
		Thread.sleep(2000);
		productName = driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
		Thread.sleep(2000);
		System.out.println(productName + " is our product");
	  
	}
	
	@Then("User searche for shortname {string} in offers page to check if product exist")
	public void user_searche_for_shortname_in_offers_page_to_check_if_product_exist(String shortName) throws InterruptedException {
		
	    driver.findElement(By.linkText("Top Deals")).click();
	    Set<String> s1 = driver.getWindowHandles();
	    Iterator<String>  i1 = s1.iterator();
	    String parentWindow = i1.next();
	    String childWindow = i1.next();
	    driver.switchTo().window(childWindow);
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
	    Thread.sleep(2000);
	    offerPageProduct = driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
	    
	    Assert.assertEquals(offerPageProduct, productName);
	    System.out.println("Found " + offerPageProduct + " in both pages");
	    
	   
	}

}
