import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handles= driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowID = it.next();
		String childWindowID = it.next();
		
		driver.switchTo().window(childWindowID);
		driver.get("https://courses.rahulshettyacademy.com/");
		
		String courseName =driver.findElements(By.cssSelector("a[href*='/p']")).get(1).getText();
		
		driver.switchTo().window(parentWindowID);

		WebElement name=driver.findElement(By.cssSelector("[name='name']"));

		name.sendKeys(courseName);
		
		//Get screenshot
		
		File file = name.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("logo.png"));
		
		
		//Get Height & Width

		System.out.println(name.getRect().getDimension().getHeight());

		System.out.println(name.getRect().getDimension().getWidth());

	}

}
