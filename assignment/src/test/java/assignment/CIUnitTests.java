package assignment;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CIUnitTests {

	@Test
	public void testStringToLower() {
		StringHelper helper = new StringHelper();
		String value = "ABC";
		Assert.assertEquals("abc", helper.stringToLower(value));
	}
	@Test
	public void testStringToUpper()
	{
		StringHelper helper = new StringHelper();
		String value = "sweden";
		Assert.assertEquals("SWEDEN", helper.stringToUpper(value));
	}
	@Test
	public void testStringContains()
	{
		StringHelper helper = new StringHelper();
		String value = "this is a tree";
		String _chk = "tree";
		Assert.assertTrue(helper.stringContians(value, _chk));
	}

}
