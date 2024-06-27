package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	public File file;
	public FileInputStream fis;
	public XSSFWorkbook wb;
	public Sheet sheet;
	
	public ExcelUtil(String filePath, String sheetName) {
		file = new File(System.getProperty("user.dir")+filePath);
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found by path: "+filePath);
			e.printStackTrace();
		}
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sheet = wb.getSheet(sheetName);
		
	}
	
	
	public ExcelUtil(String filePath, int sheetIndex) {
		file = new File(System.getProperty("user.dir")+filePath);
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found by path: "+filePath);
			e.printStackTrace();
		}
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sheet = wb.getSheetAt(sheetIndex);
	}
	

/**
 * Method to Count total no of Used Rows
 * @author Srikanth P
 * @return Integer value
 */
public int getRowsCount() {
	return sheet.getPhysicalNumberOfRows();
}


/**
 * Method to count total no of cells used in a Row
 * @author Srikanth P
 * @param rowIndex
 * @return
 */
public int getCellCount(int rowIndex) {

	return sheet.getRow(rowIndex).getPhysicalNumberOfCells();
}

/**
 * Method to getCell Value from Execel Sheet
 * @param rowIndex
 * @param cellIndex
 * @return
 */
public String getCellValue(int rowIndex, int cellIndex) {
	Object value = null;
	CellType cellType = sheet.getRow(rowIndex).getCell(cellIndex).getCellType();
	switch (cellType) {
	case STRING:
		value = sheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		break;
	case NUMERIC:
		value = sheet.getRow(rowIndex).getCell(cellIndex).getNumericCellValue();
		break;
	case BOOLEAN:
		value = sheet.getRow(rowIndex).getCell(cellIndex).getBooleanCellValue();
		break;
	case FORMULA:
		value = sheet.getRow(rowIndex).getCell(cellIndex).getCellFormula();
		break;
		}
	return String.valueOf(value);
}
	
public void quitExcel() {
	try {
		wb.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		fis.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public List<HashMap<String, String>> readExcelSheetData(){
	
	List<HashMap<String, String>> listData = new ArrayList<HashMap<String,String>>();
	int rowsCount = getRowsCount();
	for (int i = 1; i < rowsCount; i++) {
		HashMap<String, String> map = new HashMap<String, String>();
		int cellCount = getCellCount(i);
		for (int j = 0; j <cellCount; j++) {
			map.put(getCellValue(0, j), getCellValue(i, j));
		}
		listData.add(map);
	}
	
	return listData;
}

	
	
	
	

}
