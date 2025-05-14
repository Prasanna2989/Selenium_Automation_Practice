import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// Invoking Browser
		//Users/pgun0006/Documents
		//System.setProperty("webdriver.chrome.driver", "/Users/pgun0006/Documents/chromedriver");
		//WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "/Users/pgun0006/Documents/geckodriver");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver", "/Users/pgun0006/Documents/msedgedriver");
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		//driver.close();

	}

}
