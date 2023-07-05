package SeleliniumTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	
	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\David\\Chrome\\ChromeSetup.exe");
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		
		 
		WebElement button = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
		List<WebElement> buttons = new ArrayList<WebElement>();

		for(int i=0;i<5;i++) {
			button.click();
		}
		
		buttons = driver.findElements(By.tagName("button"));
		System.out.println("Button size : "+buttons.size());
		
		System.out.println("-------------------------------------------");
		if(buttons != null && buttons.size() == 6) {
			System.out.println("Test successfull");
			
		} else {
			System.out.println("Test Failed");
		}
		System.out.println("-------------------------------------------");
		
		
	 
		
		 
			
	}

}
