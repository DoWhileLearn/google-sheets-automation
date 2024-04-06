package restassured.playground;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.response.Response;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseTest {
	
	public static String dateFormatted;
	
	@BeforeSuite
	public void beforeSuite() throws IOException, GeneralSecurityException, InterruptedException
	{
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMMyyyy HH.mm.ss");
		Date date = new Date();
		dateFormatted = formatter.format(date);
		
		GoogleSheets.authorize();
		GoogleSheets.getSpreadsheetInstance();	
		GoogleSheets.getSpreadsheetValues();
	//	new GoogleSheets().createSheetAndColumn(dateFormatted,Arrays.asList("Test Name","Request URI","Status Code","Test Status"));
		
	}
	
	

}
