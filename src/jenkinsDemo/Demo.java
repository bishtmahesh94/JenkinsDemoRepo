package jenkinsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo {
	
	private WebDriver driver; 
	
	@Test
	public void main(){
		
	System.out.println("hello");
	
	driver=new FirefoxDriver();
	driver.get("http://www.google.com");
	System.out.println(driver.getTitle());
	driver.quit();
			}
	}

