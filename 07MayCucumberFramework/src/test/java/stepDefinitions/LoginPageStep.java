package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStep {

	WebDriver driver;
	
    @Given("User should open browser")
    public void user_should_open_browser() throws Throwable {
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
    }
    
    @And("hit the url")
    public void hit_the_url() throws Throwable {
    	driver.get("https://demoblaze.com/index.html");
    }
    
    @And("user is on home page")
    public void user_is_on_home_page() throws Throwable {
    	 String expected_url = "https://demoblaze.com/index.html";
    	 String actual_url = driver.getCurrentUrl();
    	 Assert.assertEquals(expected_url, actual_url);
    	 
    }

    @When("user clicks on login")
    public void user_clicks_on_login() throws Throwable {
    	 driver.findElement(By.xpath("//a[@id='login2']")).click();
    	 Thread.sleep(2000);
    }

    @And("entered valid username and password")
    public void entered_valid_username_and_password() throws Throwable {
    	driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("testacc3");
    	driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("test");
    }

    @And("clicked on login button")
    public void clicked_on_login_button() throws Throwable {
    	driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
    	 Thread.sleep(2000);
        }
    
    @Then("user is logged in")
    public void user_is_logged_in() throws Throwable {
    	String user_detail = driver.findElement(By.xpath("//a[@id='nameofuser']")).getText();
    	boolean aa = user_detail.contains("testacc3");
    	Assert.assertEquals(true, aa);
    }
    
    //---------------------------------------------------------------------
    @When("user click on Phones")
    public void user_click_on_phones() throws InterruptedException {
    	driver.findElement(By.xpath("//a[contains(text(),'Phones')]")).click();
    	Thread.sleep(2000);
        
    }
    @When("click on Samsung galaxy s6")
    public void click_on_samsung_galaxy_s6() {
    	driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]")).click();
    }
    
    @When("click on Nokia lumia1520")
    public void click_on_nokia_lumia1520() {
    	driver.findElement(By.xpath("//a[contains(text(),'Nokia lumia 1520')]")).click();
    }
    
    //---------------------------------------------------------------
    @When("click on add to cart")
    public void click_on_add_to_cart() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
    	Thread.sleep(2000);
    }
    @Then("shows Product added text on popup")
    public void shows_product_added_text_on_popup() {
        String text = driver.switchTo().alert().getText();
        String expected_text = "Product added";
        System.out.println(text);
        Assert.assertEquals(expected_text, text);
    }
    @Then("click on Ok button of popup")
    public void click_on_ok_button_of_popup() {
    	driver.switchTo().alert().accept();
        
    }
    

}