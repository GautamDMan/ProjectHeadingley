package workbook.iface;

import workbook.data.iface.Table;
import workbook.error.StorageException;

public interface Worksheet extends Table {
	public void setName(String name);
	public String getName();
	public int getId();
	public void setId();
	public String[] getColumnHeaders();
	public void setColumnHeaders(String[] columnHeaders);
	public void load() throws StorageException;
	public void save() throws StorageException;
}
