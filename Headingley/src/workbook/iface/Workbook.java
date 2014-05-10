package workbook.iface;

import workbook.error.StorageException;

public interface Workbook {
	public String getName();
	public void setName(String name);
	public int getLength();
	public Worksheet getWorksheet(int worksheet) throws StorageException;
	public void setWorksheet(int id,Worksheet worksheet) throws StorageException;
	public Worksheet[] getWorksheets();
}
