import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2_form_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/pgun0006/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Prasanna");
		driver.findElement(By.name("email")).sendKeys("pmgunawardana@gmail.com");
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("12345");
		
		
		//System.out.println(driver.findElement(By.id("exampleCheck1")).isSelected());
		Assert.assertFalse(driver.findElement(By.id("exampleCheck1")).isSelected());
		driver.findElement(By.id("exampleCheck1")).click();
		Assert.assertTrue(driver.findElement(By.id("exampleCheck1")).isSelected());
		//System.out.println(driver.findElement(By.id("exampleCheck1")).isSelected());
		
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		
		WebElement genderDropDown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(genderDropDown);
		
		dropdown.selectByIndex(0);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.name("bday")).sendKeys("11/04/2000");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		
	}

}
