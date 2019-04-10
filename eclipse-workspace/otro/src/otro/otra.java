package otro;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class otra {

	private static XSSFWorkbook workbook;

	public static void main(String[] args) {
		String filename="C:\\Users\\SEMILLERO15\\Desktop\\datos.xlsx";
try {
	FileInputStream file = new FileInputStream(filename);
	workbook = new XSSFWorkbook(file);
	XSSFSheet hoja =workbook.getSheetAt(0);
	Iterator row = hoja.rowIterator();
	
} catch (Exception e) {
	// TODO: handle exception
}
		
	}

}
