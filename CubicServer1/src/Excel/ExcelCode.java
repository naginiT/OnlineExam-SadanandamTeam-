package Excel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import Repository.InspectElements;

public class ExcelCode {

	
	@Test
	public static void perform() throws Exception{
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\NSSS KKISHORE\\Downloads\\BookStoreSummary.xlsx");
		 XSSFWorkbook workbook= new XSSFWorkbook(fis);
		 XSSFSheet sheet= workbook.getSheet(" Test Data for Admin login");
		// System.out.println(sheet.getSheetName());//To get sheet name
				//System.out.println("sheet.getLastRowNum()  "+sheet.getLastRowNum()); // To get row count
			//	System.out.println("Before retrive row data  "+sheet.getRow(3).getCell(1));
				XSSFCell cell;
				//driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
		/*		for(int i=1;i<=sheet.getLastRowNum();i++)
		{*/
					
					cell=sheet.getRow(1).getCell(1);
					Thread.sleep(3000);
					cell.setCellType(cell.CELL_TYPE_STRING);   
					String data0= cell.getStringCellValue();
					System.out.println("Test data from excel   "  +data0);
	          InspectElements.user().sendKeys(cell.getStringCellValue());
	                    Thread.sleep(3000);
					cell=sheet.getRow(1).getCell(2);
					Thread.sleep(3000);
					
	                  InspectElements.pswd().sendKeys(cell.getStringCellValue());
	          		InspectElements.Btn().click();
	                 Thread.sleep(4000); 
		
		/*InspectElements.user().sendKeys("admin@gmail.com");
		InspectElements.pswd().sendKeys("jon.7ash");*/
		//InspectElements.Btn().click();
		//Thread.sleep(3000);
	
		//break;

		}
	}

