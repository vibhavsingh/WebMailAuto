package WebM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class checkMail {
	static Properties prop;

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vibhavsingh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			// BufferedReader
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")
					+ "C:\\Users\\vibhavsingh\\eclipse-workspace\\WebMailAuto\\src\\main\\java\\WebM\\store.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		driver.get("http://webmail.qainfotech.com");
		driver.findElement(By.cssSelector("input#username")).sendKeys("vibhavsingh");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Vibhav@321#");
		driver.findElement(By.cssSelector("input.ZLoginButton.DwtButton")).click();
		// driver.findElement(By.cssSelector("td[id='zb__NEW_MENU_title']").click();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord("n", "m"));
		String selectAll = Keys.chord("n", "m");
		driver.findElement(By.cssSelector("body")).sendKeys(selectAll);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("div[id=\"DWT97\"]")).sendKeys("TOmailID");
		driver.findElement(By.cssSelector("div[id=\"DWT100\"]")).sendKeys("CCmailID");
		driver.findElement(By.cssSelector("input[id=\"zv__COMPOSE-2_subject_control\"]")).sendKeys(timeStamp);
		driver.findElement(By.cssSelector("body[data-id=\"ZmHtmlEditor2_body\"]")).sendKeys("Text");
		driver.close();
	}
}
