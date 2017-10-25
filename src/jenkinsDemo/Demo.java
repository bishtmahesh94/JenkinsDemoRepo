package jenkinsDemo;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
public class Demo {
	
	private WebDriver driver; 
	static Logger log = Logger.getLogger(Demo.class.getName());
	@Test
	public void main() throws Exception{
		 DOMConfigurator.configure("log4j.xml");
	
		 log.info("hello LOGGER");
		 System.out.println("hello");
	
	 driver=new FirefoxDriver();
	 log.info("Browser Launch");
	 
	 driver.get("http://www.google.com");
	 log.info("url access");
	System.out.println(driver.getTitle());
	  try 
	    {
	        driver.close();
	        log.info("browser closed");
	        Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe");

	    }
	    catch (Exception anException) 
	    {
	    	 log.info("Exception");
	        anException.printStackTrace();
	    }
			}
	}

