package generic;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Lib implements IAutoConstant {
	public static Workbook wb;
 public static String getPropertyValue(String propertyName){
	String propertyValue="";
	Properties prop=new Properties();
	try {
		prop.load(new FileInputStream(CONFIG_FILE_PATH));
		propertyValue=prop.getProperty(propertyName);
	} catch (Exception e) {
	
}
	return propertyValue;
}
public static String getCellValue(String sheetName,int rowNum,int colNum) {
	String cellValue="";
		 
		try{
		Workbook wb=WorkbookFactory.create(new FileInputStream(EXCEl_PATH));
		cellValue=wb.getSheet(sheetName).getRow(rowNum).getCell(colNum).toString();
		} catch(Exception e){
		}
		return cellValue;
		}
public static int getRowCount(String sheetName){


	int rowCOunt=0;
	try {
	wb=WorkbookFactory.create(new FileInputStream(CONFIG_FILE_PATH));
	rowCOunt=wb.getSheet(sheetName).getLastRowNum();
	} catch(Exception e){
		
	}
	
	return rowCOunt;
}

public static void captureScreenshot(WebDriver driver, String testMethodName)
{
	try{
		
		Date date=new Date();
		String currentDate = date.toString().replaceAll(":", "_");
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File(SCREENSHOT_PATH+ testMethodName +"_"+currentDate+".png");
		FileUtils.copyFile(srcFile, destFile);
		} catch(Exception e){
	}
}

}