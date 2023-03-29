package sachinSample;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginToApp {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
//    WebDriver driver = WebDriverManager.chromedriver().create();
//    driver.get("http://localhost:8888");
//    driver.manage().window().maximize();
//    Thread.sleep(3000);
//    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
//    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
//    driver.findElement(By.xpath("//input[@type='submit']")).click();
//    Thread.sleep(5000);
		FileInputStream fis = new FileInputStream("./src/test/resources/sachi.properties");
		Properties pobj = new Properties();
		pobj.load(fis);

		String BROSWER = pobj.getProperty("browser");
		String URL = pobj.getProperty("url");
		String USERNAME = pobj.getProperty("username");
		String PASSWORD = pobj.getProperty("password");

		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get(URL);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);

	}
}
