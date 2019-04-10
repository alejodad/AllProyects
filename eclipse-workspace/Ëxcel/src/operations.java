
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
public class operations {
	private int rows;
	private Sheet sheet;
	public operations(Sheet sheet) {		
		this.sheet = sheet;
		this.rows = this.sheet.getLastRowNum() - this.sheet.getFirstRowNum();
	}
	
	public Sheet getSheet() {
		return sheet;
	}
	
	public int getRows() {
		return rows;
	}	
	
	public List<String> listExcelData() {
		List<String> datos = new ArrayList<String>();
		for(int i = 0; i < this.getRows(); i++) {
			datos.add(this.getSheet().getRow(i).getCell(0).getStringCellValue());
		}
		return datos;
	}
	
	public void writeExcel(Row currentRow, String value) {
		Cell cell = currentRow.createCell(currentRow.getLastCellNum());
		cell.setCellValue(value);
	}
}
