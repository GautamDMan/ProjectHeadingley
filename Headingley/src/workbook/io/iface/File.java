package workbook.io.iface;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import workbook.error.StorageException;

public interface File {
	public void load(String fileName) throws StorageException;
	public void load(InputStream inStream) throws StorageException;
	public void load(InputStreamReader inReader) throws StorageException;
	public void close();
	public void save(String fileName) throws StorageException;
	public void save(OutputStream outStream) throws StorageException;
	public void save(OutputStreamWriter outWriter) throws StorageException;
}
