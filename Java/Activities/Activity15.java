import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class Activity15
{
    private static String filepath="C:\\Users\\0022IN744\\Desktop\\Bell TCOE - 14-Mar-2022 Skill Carinval Event participation list v.xlsx";


    public static void main(String[] args) throws IOException {

        XSSFWorkbook xssf=new XSSFWorkbook();
        XSSFSheet sheet=xssf.createSheet("Hello");
        Object[][] obj={
                {"Hello",123,"Hello"},
                {"welcome",111,"Welcome"},
                {"Thanks",124,"Thanks"}
        };
        int rowNum = 0;

        for (Object[] datatype : obj) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : datatype) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }

        FileOutputStream fs=new FileOutputStream(filepath);
        xssf.write(fs);
    }

}
