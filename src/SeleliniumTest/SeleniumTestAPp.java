package SeleliniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestAPp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\David\\Chrome\\ChromeSetup.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://zero.webappsecurity.com/login.html");
		
		//Find user Name and set userName 
		WebElement txtbx_username = driver.findElement(By.name("user_login"));
		
		txtbx_username.sendKeys("username");
		
		//password is set 
		driver.findElement(By.name("user_password")).sendKeys("password");
		
		
		driver.findElement(By.name("submit")).click();
		//driver.findElement(By.xpath("//input[@value='Sign in' and @type='submit']")).click();
		
		String expected_title = "Zero - Account Summary";
		String actual_title = driver.getTitle();
		
		System.out.println("-------------------------------------------");
		// check point
		if(expected_title.equals(actual_title)) {
			System.out.println("Login successfull");
		} else {
			System.out.println("Login Failed");
		}
		System.out.println("-------------------------------------------");
		
		

	}

}
