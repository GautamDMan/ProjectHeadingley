package workbook.data.iface;

import workbook.error.StorageException;

public interface Table {
	public int getRowLength();
	public int getColumnLength();
	public Cell getCell(int row, int column) throws StorageException;
	public void setCell(int row, int column, Cell cell) throws StorageException;
	public Cell[] getRow(int row);
	public Cell[] getColumn(int column);
	public Row[] getRows();
	public Column[] getColumns();
}
