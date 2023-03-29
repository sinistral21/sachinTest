package sachinSample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import genericLibrary.javaLibrary;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
 
    
    javaLibrary jlib=new javaLibrary();
	
	
	FileInputStream fis1 = new FileInputStream("./src/test/resources/sachi.properties");
	Properties pobj = new Properties();
	pobj.load(fis1);

	String BROSWER = pobj.getProperty("browser");
	String URL = pobj.getProperty("url");
	String USERNAME = pobj.getProperty("username");
	String PASSWORD = pobj.getProperty("password");
	
	   FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Book1.xlsx");
	     Workbook wb = WorkbookFactory.create(fis);
	     Sheet sh = wb.getSheet("Sheet1");
	     Row rw = sh.getRow(0);
	     Cell ce = rw.getCell(0);
	    String data = ce.getStringCellValue();
	    System.out.println(data);

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
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(data+jlib.randomNum());
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


