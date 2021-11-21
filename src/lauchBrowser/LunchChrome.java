package lauchBrowser;


import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChrome {
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner ui = new Scanner(System.in);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15202\\July2021_Selenium\\1stSelenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//object variable
		
		//maximize
		driver.manage().window().maximize();
		
		//get web site
		driver.get("https://www.google.com/");
		
		//idendify web element and perforn action
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		//driver.findElement(By.className("btnK")).click();
		
		//wait
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
	}

}
