package assignment;

public class StringHelper {
	public String stringToLower(String value)
	{
		return value.toLowerCase();
	}
	public String stringToUpper(String value)
	{
		return value.toUpperCase();
	}
	public boolean stringContains(String value, String chk)
	{
		return value.contains(chk);
	}
}
