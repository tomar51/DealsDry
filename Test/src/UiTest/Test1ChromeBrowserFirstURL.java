package UiTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test1ChromeBrowserFirstURL {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(" https://www.getcalley.com/page-sitemap.xml");
		driver.findElement(By.linkText("https://www.getcalley.com/")).click();
		
		TakesScreenshot page = (TakesScreenshot)driver;
		 File firstpage = page.getScreenshotAs(OutputType.FILE);
		File add = new File("./ChromeScreenShot/FirstURLPage.jpeg");
		FileHandler.copy(firstpage, add);
		
		driver.quit();

	}

}
