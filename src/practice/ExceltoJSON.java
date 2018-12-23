package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import gvjava.org.json.JSONArray;
import gvjava.org.json.JSONException;
import gvjava.org.json.JSONObject;

public class ExceltoJSON {

	public static void main(String args[])
			throws FileNotFoundException, InvalidFormatException, IOException, JSONException {
		FileInputStream inp = new FileInputStream("C:\\OA Expense Report .xlsx");
		// POIFSFileSystem fs = new POIFSFileSystem(inp);
		Workbook workbook = WorkbookFactory.create(inp);

		// Get the first Sheet.
		Sheet sheet = workbook.getSheetAt(0);

		// Start constructing JSON.
		JSONObject json = new JSONObject();

		// Iterate through the rows.
		JSONArray rows = new JSONArray();
		for (Iterator<Row> rowsIT = sheet.rowIterator(); rowsIT.hasNext();) {
			Row row = rowsIT.next();
			JSONObject jRow = new JSONObject();

			// Iterate through the cells.
			JSONArray cells = new JSONArray();

			for (Iterator<Cell> cellsIT = row.cellIterator(); cellsIT.hasNext();) {

				Cell cell = cellsIT.next();
				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					cells.put(cell.getRichStringCellValue().getString());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						cells.put(cell.getDateCellValue());
					} else {
						cells.put(cell.getNumericCellValue());
					}
					break;
				case Cell.CELL_TYPE_BOOLEAN:
					cells.put(cell.getBooleanCellValue());
					break;
				case Cell.CELL_TYPE_FORMULA:
					cells.put(cell.getCellFormula());
					break;
				default:
					System.out.println();
				}

				// cells.put(cell);

			}
			jRow.put("cell", cells);
			rows.put(jRow);
		}

		// Create the JSON.
		json.put("rows", rows);

		// Get the JSON text.
		System.out.println(json.toString());
	}
}
