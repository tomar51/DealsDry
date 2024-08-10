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

public class ChromeBrowserThirdURL {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get(" https://www.getcalley.com/page-sitemap.xml");
		driver.findElement(By.linkText("https://www.getcalley.com/see-a-demo/")).click();
		
		TakesScreenshot page = (TakesScreenshot)driver;
		 File thirdpage = page.getScreenshotAs(OutputType.FILE);
		File save = new File("./ChromeScreenShot/ThirdURLPage.jpeg");
		FileHandler.copy(thirdpage, save);
		
		driver.quit();

	}

}
