import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/pgun0006/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTNR")).click();
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();

		if (driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5")) {
			System.out.println("It is Disabled");
			Assert.assertTrue(true);
		} else {
			System.out.println("It is disabled");
			Assert.assertTrue(false);
		}

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(2000);
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		// driver.findElement(By.cssSelector("//input[@value='Search']")).click();
		// driver.findElement(By.cssSelector("input[value='Search']")).click();
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
	}

}
