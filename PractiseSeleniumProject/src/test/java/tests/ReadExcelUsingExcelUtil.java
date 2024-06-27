package tests;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import utility.ExcelUtil;

public class ReadExcelUsingExcelUtil {
  @Test
  public void readExcelData() {
	  ExcelUtil util = new ExcelUtil("\\src\\test\\resources\\TestData\\SampleTestData.xlsx", "Sheet1");
//	  int rowsCount = util.getRowsCount();
//	  int cellCount = util.getCellCount(0);
	  
//	  for (int i = 0; i < rowsCount; i++) {
//		for (int j = 0; j < cellCount; j++) {
//			System.out.print(util.getCellValue(i, j)+"\t");
//		}
//		System.out.println();
//	}
	  List<HashMap<String, String>> data = util.readExcelSheetData();
	  util.quitExcel();
	  System.out.println(data);
	  System.out.println("*****************************************");
	  System.out.println(data.get(1).get("First Name"));
	  System.out.println(data.get(1).get("Last Name"));
	  System.out.println(data.get(1).get("ID"));
			  
	  
  }
}
