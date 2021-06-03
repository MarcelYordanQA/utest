package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsRegistro {
	
	public static WebDriver driver;
	
	@Given("^open browser and type web page$")
	public void open_browser_and_type_web_page() throws Throwable {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AUTOMATIZACION 6\\eclipse-workspace\\qprueba\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.utest.com/signup/personal");
	}

	@When("^fill camps tell us about yourself$")
	public void fill_camps_tell_us_about_yourself() throws Throwable {
	    //Verify and check if is the correct page first
	}

	@When("^fill \"([^\"]*)\" camps and \"([^\"]*)\" input$")
	public void fill_camps_and_input(String nombre, String apellido) throws Throwable {
	    driver.findElement(By.id("firstName")).sendKeys(nombre);
	    driver.findElement(By.id("lastName")).sendKeys(apellido);
	}

	@When("^fill camps add your adress \"([^\"]*)\" input$")
	public void fill_camps_add_your_adress_input(String correo) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(correo);
		//Fill too Date of birth
		driver.findElement(By.id("birthMonth")).sendKeys("July");
		driver.findElement(By.id("birthDay")).sendKeys("10");
		driver.findElement(By.id("birthYear")).sendKeys("1995");
		
		WebElement actionBtn ;
		actionBtn = driver.findElement(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a/span"));
		actionBtn.click();
		driver.findElement(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a")).click();
		driver.findElement(By.cssSelector("#regs_container > div > div:nth-child(2) > div > div.ui-view > div > form > div.form-group.col-xs-12.text-right > a")).click();
		Thread.sleep(2000);
		
	}

	@When("^fill tell us about \"([^\"]*)\" devices$")
	public void fill_tell_us_about_devices(String arg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span")).sendKeys("HP");
		driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span")).sendKeys("Veer");
		driver.findElement(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span")).sendKeys("WebOsS 2.2");
	}

	@When("^type \"([^\"]*)\" and type \"([^\"]*)\"$")
	public void type_and_type(String arg1, String arg2) throws Throwable {
	   
	}

	@When("^create valid \"([^\"]*)\" password$")
	public void create_valid_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^send and complete$")
	public void send_and_complete() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
}
