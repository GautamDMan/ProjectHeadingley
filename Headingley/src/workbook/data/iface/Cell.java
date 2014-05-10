package workbook.data.iface;

import java.math.BigDecimal;

public interface Cell {
	public int getRowNumber();
	public int getColumnNumber();
	public String getStringValue();
	public int getIntValue();
	public BigDecimal getDecimalValue();
	public boolean getBooleanValue();
	public void setValue(String input);
	public void setValue(int input);
	public void setValue(BigDecimal input);
	public void setValue(boolean input);
}
