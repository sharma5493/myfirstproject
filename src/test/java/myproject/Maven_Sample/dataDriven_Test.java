package myproject.Maven_Sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven_Test {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\CG-DTE\\Desktop\\Selenium\\Cricket Nomination_2020 v01 .xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(fis);

		int no_of_Sheets = wbook.getNumberOfSheets();

		for (int i = 0; i < no_of_Sheets; i++) {
			if (wbook.getSheetName(i).contains("Team Nomination"))
				;
			{
				XSSFSheet sheet = wbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row first_row = rows.next();

				Iterator<Cell> ce = first_row.cellIterator();
				int k = 0;
				int column;
				while (ce.hasNext()) {
					Cell value = ce.next();
					if (value.getStringCellValue().contains("Captain")) {
						System.out.println(value);
						column = k;
						System.out.println(column);
					}
					k++;
				}

			}

		}

	}

}
