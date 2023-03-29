package sachinSample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writeDataInExcel {
	
	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/Book1.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sh = wb.getSheet("Sheet2");
	    Row rw = sh.createRow(0);
	    Cell cl = rw.createCell(1);
	    cl.setCellValue("sachin");
	   
	    FileOutputStream fos=new FileOutputStream("./src/test/resources/Book1.xlsx");
	    wb.write(fos);
	    wb.close();
	
		
		
	}

}
