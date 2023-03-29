package BasicSelenium;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("http://localhost:8888");
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String ps = driver.getPageSource();
		System.out.println(ps);
		

	}

}
