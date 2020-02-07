package classfile;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class casestudy4 {
		static {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\training_c2d.02.11\\\\chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
			
			}
			WebDriver driver=new ChromeDriver();
		@Given("Alex has registered in TestMeApp")
		public void alex_has_registered_in_TestMeApp() {
			
			driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
			WebElement element=driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li/a"));
			element.click();
			WebElement uname=driver.findElement(By.name("userName"));
			uname.sendKeys("lalitha");
			WebElement pass=driver.findElement(By.name("password"));
			pass.sendKeys("Password123");
			WebElement click=driver.findElement(By.name("Login"));
			click.click();
		}

		@When("Alex Search a particular producvt like headphones")
		public void alex_Search_a_particular_producvt_like_headphones() {
			WebElement element=driver.findElement(By.xpath("//div[@class='autocomplete']/input"));
			element.click();
			element.sendKeys("Head phone");
			WebElement search=driver.findElement(By.xpath("//input[@value='FIND DETAILS']")); 
			search.click();
		  
		}

		@When("try to proceed to payment without adding any item in the cart")
		public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() {
			if(driver.findElement(By.xpath("//div[@class='shop-menu pull-right']/a[2]")).isDisplayed())
			{
				System.out.println("Item is added to the cart");
			}
			else
				System.out.println("Please add item into the cart before proceeding to the checkout");    
		}

		@Then("TestMeApp doesn't display the cart icon")
		public void testmeapp_doesn_t_display_the_cart_icon() {
			driver.close();
		}


	}



