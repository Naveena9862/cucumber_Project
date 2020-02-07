package classfile;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class casestudy2 {
		static {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2d.02.11\\chromedriver\\chromedriver_win32\\chromedriver.exe");
			   }	
		 WebDriver driver=new ChromeDriver();
		@Given("user is on the login page")
		public void user_is_on_the_login_page() 
		{

			driver.get("http://10.232.237.143:443/TestMeApp/");
			WebElement signin=driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li/a"));
			signin.click();
		}

		@When("user enters the cresdentials {string} and {string}")
		public void user_enters_the_cresdentials_and(String string, String string2) 
		{
			 WebElement username= driver.findElement(By.name("userName"));
			 username.sendKeys(string);//entering username
			 WebElement password= driver.findElement(By.name("password"));
			 password.sendKeys(string2);//entering password
			 WebElement button= driver.findElement(By.name("Login"));
			 button.click();//clicking login button
		}

		@Then("user logins successfully")
		public void user_logins_successfully() 
		{
			System.out.println("user login successfully");
		}


	}


