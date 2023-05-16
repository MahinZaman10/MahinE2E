package smarttech.ny.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

    public class ParentClass {
    	
	public static Properties prop;
	public static WebDriver driver;
	public static FileInputStream ip;
	
	public ParentClass()  {
	    try { //not required to know yet but at the end of class we will learn about this 
			prop = new Properties();
		    ip = new FileInputStream("./src/main/java/smarttech/ny/config/Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Intialization() {
		String browser = prop.getProperty("browserName"); 
		
		
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}
		else if (browser.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver(); 
		}
		 else if (browser.equalsIgnoreCase("firefox")){
					WebDriverManager.firefoxdriver().setup();
					 driver = new FirefoxDriver();
		 }
					 
	     else {
	    	    	System.out.println(">>There is no browser for testing<<");
        }
					 driver.manage().window().maximize();
					 driver.manage().deleteAllCookies();
					 driver.get(prop.getProperty("QA_ENB"));
	    
	}
}