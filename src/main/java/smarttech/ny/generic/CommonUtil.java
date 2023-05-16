package smarttech.ny.generic;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import smarttech.ny.basepage.ParentClass;


public class CommonUtil extends ParentClass{
	
	public static void actionClick(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.click(ele).build().perform();
	}
	public static void jsClick() {//Better option for Click but makes it slow
		//JavaScriptExecuter js = (JavaScriptExecuter) driver;
	}
}
