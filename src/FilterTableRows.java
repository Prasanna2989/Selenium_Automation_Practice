import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterTableRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> fileredList = elementsList.stream().filter(s -> s.getText().contains("Rice")).map(s -> s.getText()).collect(Collectors.toList());
		System.out.println(fileredList);
		Assert.assertEquals(originalList.size(),(fileredList.size()));
	}

}
