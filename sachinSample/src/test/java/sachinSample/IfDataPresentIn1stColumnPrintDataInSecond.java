package sachinSample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class IfDataPresentIn1stColumnPrintDataInSecond {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/Book1.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		
		Sheet sh = wb.getSheet("Sheet4");
		int count= sh.getLastRowNum();
		
		String actdata = "sachin";
		
		for(int i=0; i<count; i++) {
			
			Row row = sh.getRow(i);
			String firstcell = row.getCell(0).getStringCellValue();
			if(firstcell.equals(actdata)) {
				String secondcell = row.getCell(1).getStringCellValue();
				System.out.println(firstcell+"\t"+secondcell);
				break;
			}
		}
		
		
		

	}

}
