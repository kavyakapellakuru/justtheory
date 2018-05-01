package start;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class DriverConcept {
	public static void main(String Args[])throws WebDriverException,InterruptedException{
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\kavyaka\\Downloads\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.quit();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("cavya.reddy_85@yahoo.co.in");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("#brighthour3");
	}
	

}
