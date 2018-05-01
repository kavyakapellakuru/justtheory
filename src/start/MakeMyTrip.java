package start;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class MakeMyTrip {
	public static void main(String Args[])throws WebDriverException,InterruptedException{
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\kavyaka\\Downloads\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		//driver.quit();
		/*driver.findElement(By.xpath(".//*[@id='dwnApp_save_strip1']/span[1]")).getText().contains("South India, Mysore");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='dwnApp_save_closeIcon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='close-link']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath(".//*[@id='dwnApp_save_closeIcon']")).click();*/
		driver.findElement(By.xpath(".//*[@id='widget_row']/div[1]/div/div[2]/ul/li[1]/a/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='cls_btn']")).click();
		Thread.sleep(22000);
		//driver.findElement(By.xpath(".//*[@id='close-link']")).click();
		//Thread.sleep(6000);
		driver.quit();
		
	}
	

}
