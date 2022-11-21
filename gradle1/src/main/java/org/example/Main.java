package org.example;
import java.io.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Main {

    public static void main(String args[]) throws Exception
    {
        File f = new File("C:/Users/mano.baskaran/Desktop/Intellij/gradle1/src/main/resources/Grads-Buddies Mapping.xlsx");
        FileInputStream fis = new FileInputStream(f);
        XSSFWorkbook excelWorkbook = new XSSFWorkbook(fis);
        XSSFSheet excelSheet = excelWorkbook.getSheetAt(0);
        int rows = excelSheet.getPhysicalNumberOfRows();
        int cols = excelSheet.getRow(0).getPhysicalNumberOfCells();
        String data[][]= new String[rows][cols];
        XSSFCell cell;
        for(int i =0 ; i< rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                cell = excelSheet.getRow(i).getCell(j);
                System.out.print(cell+",");
//                String cellContents=cell.getValue();
//                data[i][j] = cellContents;
//                System.out.println(data[i][j]);
            }System.out.println("");
        }
        fis.close();
    }
}