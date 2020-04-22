package assignment;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CIITTests {

	@Test
	public void testIntegrationHelperLower() {
		HelperIntegeration _int = new HelperIntegeration();
		Assert.assertTrue("Test Successfull", _int.verifyConvertStringToLower("SWEDEN"));
	}
	@Test
	public void testIntegrationHelperUpper() {
		HelperIntegeration _int = new HelperIntegeration();
		Assert.assertTrue("Test Successfull", _int.verifyConvertStringToUpper("sweden"));
	}

}
