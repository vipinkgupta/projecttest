package Scripts;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Excel {
	
	public static String getCellValue(String xl, String sheet, int r,int c)
	{
		try
		{
			FileInputStream fis=new FileInputStream(xl);
			Workbook wb = WorkbookFactory.create(fis);
			Cell cell = wb.getSheet(sheet).getRow(r).getCell(c);
			return cell.getStringCellValue();
		}
		catch(Exception e)
		{
			return"";
		}
	}
	public static int getRowCount(String xl, String sheet)
	{
		try {
			FileInputStream fis=new FileInputStream(xl);
			Workbook wb=WorkbookFactory.create(fis);
			return wb.getSheet(sheet).getLastRowNum();
			} 
		catch (Exception e)
			{
			return 0;
			}
	}

}
