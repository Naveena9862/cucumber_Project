package classfile;




	import java.util.List;
	import java.util.Map;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.cucumber.datatable.DataTable;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class casestudy1 
	{
		static {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2d.02.11\\chromedriver\\chromedriver_win32\\chromedriver.exe");
			   }	
		 WebDriver driver=new ChromeDriver();
		
		@Given("User should be on the login page")
		public void user_should_be_on_the_login_page()
		{
			driver.get("http://10.232.237.143:443/TestMeApp/");
			WebElement signin=driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li/a"));
			 signin.click();
			 WebElement register1=driver.findElement(By.xpath("//a[@class='btn btn-link col-md-3']"));
			 register1.click();
		}

		
		@When("User should enter the details and click register button")
		public void user_should_enter_the_details_and_click_register_button(DataTable dt) 
		{
			List<Map<String,String>> list=dt.asMaps(String.class, String.class);
		    for(int i=0;i<list.size();i++)
		    {
		    	WebElement username=driver.findElement(By.name("userName"));
		    	username.click();
		    	username.sendKeys(list.get(i).get("Username"));
		    	WebElement firstname=driver.findElement(By.id("firstName"));
		    	firstname.click();
		    	firstname.sendKeys(list.get(i).get("firstname"));
		    	WebElement lastname=driver.findElement(By.id("lastName"));
		    	lastname.click();
		    	lastname.sendKeys(list.get(i).get("lastName"));
		    	WebElement password2=driver.findElement(By.id("password"));
		    	password2.click();
		    	password2.sendKeys(list.get(i).get("password"));
		    	WebElement cpassword=driver.findElement(By.id("pass_confirmation"));
		        cpassword.click();
		    	cpassword.sendKeys(list.get(i).get("password_confirmation"));
		    	WebElement gen=driver.findElement(By.cssSelector("input[value='Female']"));
		  	    gen.click();
		  	    WebElement email=driver.findElement(By.id("emailAddress"));
		  	    email.click();
		  	    email.sendKeys(list.get(i).get("E_mail"));
		  	    WebElement mobile=driver.findElement(By.id("mobileNumber"));
		  	    mobile.click();
		  	    mobile.sendKeys(list.get(i).get("mobilenumber"));
		  	    WebElement dob=driver.findElement(By.id("dob"));
		  	    dob.click();
		  	    dob.sendKeys(list.get(i).get("DOB"));
		  	    WebElement address=driver.findElement(By.id("address"));
		  	    address.click();
		  	    address.sendKeys(list.get(i).get("Address"));
		    	Select s=new Select(driver.findElement(By.id("securityQuestion")));
		   	    s.selectByValue(list.get(i).get("security_ques"));
		   	    WebElement ans=driver.findElement(By.id("answer"));
		   	    ans.sendKeys(list.get(i).get("Answer"));
		   	    WebElement regis=driver.findElement(By.xpath("//div[@class='col-md-12 remove-default-padding']/input"));
			    regis.click();
		    }
		}

		@Then("Successfull user registration")
		public void successfull_user_registration()
		{
			System.out.println("USER NAME PASSWORD SUCCESSFULLY REGISTERED!!!");
		}
	}


