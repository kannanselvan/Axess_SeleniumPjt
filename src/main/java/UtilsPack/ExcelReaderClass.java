package UtilsPack;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class ExcelReaderClass {
    public static Map<String, String> getData(String FilePath, String Sheetname, String TestCase) {

        Map<String, String> data = new HashMap<>();

        try {
            FileInputStream fileIS = new FileInputStream(FilePath);
            Workbook workbook = new XSSFWorkbook(fileIS);
            Sheet sheet = workbook.getSheet(Sheetname);
            Row headRow = sheet.getRow(0);
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row.getCell(0).getStringCellValue().equalsIgnoreCase(TestCase)) {
                    System.out.println("Match Found");
                    for (int j = 0; j < headRow.getLastCellNum(); j++) {
                        data.put(headRow.getCell(j).getStringCellValue(), row.getCell(j).toString());

                    }
                    break;
                }

            }
            workbook.close();
            fileIS.close();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return data;
    }
}


