import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/pgun0006/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//1.counts of the links on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		

	}

}
