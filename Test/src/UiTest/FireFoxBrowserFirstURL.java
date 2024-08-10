package UiTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class FireFoxBrowserFirstURL {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(" https://www.getcalley.com/page-sitemap.xml");
		driver.findElement(By.linkText("https://www.getcalley.com/")).click();
		
		TakesScreenshot firefox = (TakesScreenshot)driver;
		 File firstpage = firefox.getScreenshotAs(OutputType.FILE);
		File page = new File("./FireFoxScreenShot/FirstURLPage.jpeg");
		FileHandler.copy(firstpage,page );
		
		driver.quit();

	}

}
