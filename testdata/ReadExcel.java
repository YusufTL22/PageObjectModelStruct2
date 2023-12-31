package testdata;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static String[][] readData() throws IOException {
        //Step1: setup the path for the workbook
                XSSFWorkbook wb = new XSSFWorkbook("./data/EditLead.xlsx");
                
                //Step2: Get into the respective sheet
                XSSFSheet ws = wb.getSheet("sheet1"); // using sheet name
                //wb.getSheetAt(0); // using sheet index
                
                //to get the row count
                int rowCount = ws.getLastRowNum(); // row count without header
                
                //to get the cell count
                int cellCount = ws.getRow(0).getLastCellNum();
                
                //Declare 2D String array 
                String[][] data = new String[rowCount][cellCount];
                
                for (int i = 1; i <= rowCount; i++) { // rows
                                        
                    for (int j = 0; j < cellCount; j++) { // cells 0,1,2
                        
                        String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
                        System.out.println(cellValue);
                        data[i-1][j] = cellValue; //0,0
                    }
                
                }        
                        
                //to close the workbook
                wb.close();
                
                return data;
}
}