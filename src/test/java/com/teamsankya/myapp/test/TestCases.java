package com.teamsankya.myapp.test;

import org.junit.Test;

import junit.framework.TestCase;
import net.sourceforge.jwebunit.WebTester;

public class TestCases extends TestCase{

	private WebTester tester = new WebTester();
	private static final String BASE_URL = "http://localhost:8080/MyApp/";
	int i=10;
	@Override
	protected void setUp() throws Exception {
		tester.getTestContext().setBaseUrl(BASE_URL);
	}
	@Test
	public void testCase1() {
		tester.beginAt("index.jsp");
		//tester.assertFormPresent();
		//tester.clickLink("CreateStudent");
		tester.clickLinkWithText("CreateStudent");
		tester.assertFormPresent();
		tester.setFormElement("regno", "1235");
		tester.setFormElement("fname", "QWERTY");
		tester.setFormElement("mname", "ASDFGG");
		tester.setFormElement("lname", "N");
		tester.setFormElement("address1", "Basvangudi");
		tester.setFormElement("address2", "Nrcolony");
		tester.setFormElement("type", "temp");
		tester.setFormElement("city", "B'lore");
		tester.setFormElement("pincode", "525252");
		tester.setFormElement("guardian first name", "CFGVB");
		tester.setFormElement("guardian middle name", "VBGGFF");
		tester.setFormElement("guardian last name", "fdf");
		tester.submit();
		
	}
}
