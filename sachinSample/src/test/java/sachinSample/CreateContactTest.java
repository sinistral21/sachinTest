package sachinSample;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import genericLibrary.javaLibrary;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		javaLibrary jlib=new javaLibrary();
		
		
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
		
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sachin.m.n"+jlib.randomNum());
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(5000);
		String act = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(act.contains("sachin"))
		{
			System.out.println("tc pass");
		}
		else {
			System.out.println("tc fail");
			
		}
			

	}

}
