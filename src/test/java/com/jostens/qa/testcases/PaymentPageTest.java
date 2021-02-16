package com.jostens.qa.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.jostens.qa.base.TestBase;

public class PaymentPageTest extends TestBase {

	//Define Variable(s)
	SoftAssert checkpoint;
	
	//Constructor
	public PaymentPageTest() {
		super();
	}
	
	//Setup variable(s) and other info for the class
	@BeforeClass
	public void beforeClass() {
//		String excelPath = "\\src\\main\\java\\com\\jostens\\qa\\testdata\\Jostens.xlsx";
//		//Initialize Variable(s)
//		excelMethods = new ExcelUtil();
//		excelMethods.setDataTablePath(excelPath);
//		excelMethods.setSheetName("Login");
//		column = 7;
//		
//		//Setup the Report
//		report = ExtentFactory.getInstance();
//		reportLogger = report.startTest("LoginPageTest Script");
//		
//		//Initialize PageFactories
//		System.out.println("Initializing the script's PageFactories");
//		reportLogger.log(LogStatus.INFO, "Initializing the script's PageFactories");
//		
//		loginPage = new LoginPage(eDriver, reportLogger);
	}
	
	@Test
	public void paymentPageTest() {
		System.out.println("paymentPageTest()");
	}
}