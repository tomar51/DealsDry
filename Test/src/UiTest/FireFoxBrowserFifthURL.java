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

public class FireFoxBrowserFifthURL {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
		
		driver.get(" https://www.getcalley.com/page-sitemap.xml");
		driver.findElement(By.linkText("https://www.getcalley.com/calley-pro-features/")).click();
		
		TakesScreenshot shot1 = (TakesScreenshot)driver;
		 File fifthpage = shot1.getScreenshotAs(OutputType.FILE);
		File takes = new File("./FireFoxScreenShot/FifthURLPage.jpeg");
		FileHandler.copy(fifthpage,takes );
		
		driver.quit();


	}

}
