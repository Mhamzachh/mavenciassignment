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

}
