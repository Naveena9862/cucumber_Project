package classfile;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.cucumber.java.en.*;
	public class casestudy3 {
		static {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2d.02.11\\chromedriver\\chromedriver_win32\\chromedriver.exe");
			   }	
		 WebDriver driver=new ChromeDriver();
		 @Given("User should be on home page")
		 public void user_should_be_on_home_page() {
			 driver.get("http://10.232.237.143:443/TestMeApp/");
		 	}

	@When("User should able to Search the Headphone")
	public void user_should_able_to_Search_the_Headphone() {

	      driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li/a")).click();
		  driver.findElement(By.name("userName")).sendKeys("lalitha");
		  driver.findElement(By.name("password")).sendKeys("Password123");//entering password
		  driver.findElement(By.name("Login")).click();
		  driver.findElement(By.xpath("//div[@class='autocomplete']/input")).sendKeys("head");
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		  driver.findElement(By.linkText("Add to cart")).click();//for adding to cart
		  driver.get("http://10.232.237.143:443/TestMeApp/displayCart.htm");
		  System.out.println("Product added to cart succesfully");
	}

	@Then("Successfully added into cart")
	public void successfully_added_into_cart() {
		//driver.close();
		System.out.println("Done");
	   }
	}


