package assignment;

public class HelperIntegeration {
	StringHelper _helper;
	
	public HelperIntegeration()
	{
		_helper = new StringHelper();			
	}
	public boolean verifyConvertStringToLower(String obj)
	{
		return _helper.stringToLower(obj).equals(obj.toLowerCase());
	}
			
}
