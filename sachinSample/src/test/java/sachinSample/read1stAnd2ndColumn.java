package sachinSample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class read1stAnd2ndColumn {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("./src/test/resources/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet3");
		int count = sh.getLastRowNum();
		
		for(int i=1; i<count; i++) {
			
			Row row = sh.getRow(i);
			String firstCell = row.getCell(0).getStringCellValue();
			String secondCell = row.getCell(1).getStringCellValue();
			String thirdcell = row.getCell(2).getStringCellValue();
			System.out.println(firstCell+"\t"+secondCell+"\t"+thirdcell);
		}
		

	}

}
