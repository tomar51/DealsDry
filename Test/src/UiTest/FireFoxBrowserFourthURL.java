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

public class FireFoxBrowserFourthURL {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		
		driver.get(" https://www.getcalley.com/page-sitemap.xml");
		driver.findElement(By.linkText("https://www.getcalley.com/calley-teams-features/")).click();
		
		TakesScreenshot page = (TakesScreenshot)driver;
		 File fourthpage = page.getScreenshotAs(OutputType.FILE);
		File save = new File("./FireFoxScreenShot/FourthURLPage.jpeg");
		FileHandler.copy(fourthpage, save);
		
		driver.quit();


	}

}
