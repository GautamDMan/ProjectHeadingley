package workbook.data.iface;

import workbook.error.StorageException;

public interface Axis {
	public int getRowNumber();
	public int getLength();
	public Cell getCell(int column) throws StorageException;
	public Cell[] getCells();
}
