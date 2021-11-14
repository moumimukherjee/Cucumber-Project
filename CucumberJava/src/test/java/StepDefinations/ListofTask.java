package StepDefinations;

import io.cucumber.java.en.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;



public class ListofTask {

	WebDriver driver;
	String taskName = "Task1 to be completed " + currentDateTime();
	@Given("login to the Application URL")
	public void login_to_the_Application_URL() {
		String url = "http://todomvc.com/examples/vue/";	
		System.out.println("Application Page is Open");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		driver = new ChromeDriver (options);
		pause(8000);
		driver.manage().window().maximize();
		pause(8000);
		driver.get(url);
		pause(8000);
	}

	@When("Click on Text Edit box to add a task")
	public void click_on_Text_Edit_box_to_add_a_task() {
		WebElement textField = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/header[1]/input[1]"));		
		pause(3000);
		textField.sendKeys(taskName);
		textField.sendKeys(Keys.ENTER);
		pause(3000);
		WebElement checkBox = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/section[1]/ul[1]/li[1]/div[1]/input[1]"));
		checkBox.click();
		System.out.println("New Task added");
	}

	@Then("complete the added task")
	public void complete_the_added_task() {

		driver.close();
		System.out.println("Added task completed");
	}
	public String currentDateTime() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		return formatter.format(date);
	}
	public void pause(Integer milliseconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
