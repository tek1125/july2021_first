package lauchBrowser;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {

	WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("This is before class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("This is after class");
	}

	@After
	public void tearDown() {
		System.out.println("This is After");
		driver.close();
		driver.quit();
	}

	@Before
	public void launchBrowser() {
		System.out.println("This is Before");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\June2021_Selenium\\crm\\driver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=admin/");
	}

	@Test
	public void loginTest() throws InterruptedException {
		System.out.println("This is test1");
		// identify element
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);

	}

	@Test
	public void loginTestNeg() throws InterruptedException {
		System.out.println("This is test2");
		// identify element
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password1")).sendKeys("abc1233423");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);

	}

}
