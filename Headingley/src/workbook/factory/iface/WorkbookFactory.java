package workbook.factory.iface;

import java.io.InputStream;
import java.io.InputStreamReader;

import workbook.error.StorageException;
import workbook.iface.Workbook;
import workbook.iface.Worksheet;
import workbook.io.iface.File;

public interface WorkbookFactory {
	public File produceFile() throws StorageException;
	public File produceFile(String fileName) throws StorageException;
	public File produceFile(InputStream inStream) throws StorageException;
	public File produceFile(InputStreamReader inReader) throws StorageException;
	public File[] produceFiles(String[] fileName) throws StorageException;
	public File[] produceFiles(InputStream[] inStreams) throws StorageException;
	public File[] produceFiles(InputStreamReader[] inReaders) throws StorageException;
	public Worksheet produceWorksheet(File file) throws StorageException;
	public Worksheet produceWorksheet(File file, String name) throws StorageException;
	public Worksheet[] produceWorksheets(File[] files) throws StorageException;
	public Worksheet[] produceWorksheets(File[] files, String[] names) throws StorageException;
	public Workbook produceWorkbook(Worksheet[] worksheets) throws StorageException;
}
