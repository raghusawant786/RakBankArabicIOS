package StepDefinations;

//import org.junit.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.sun.xml.internal.ws.client.sei.ResponseBuilder.Body;
import com.fasterxml.jackson.databind.node.ObjectNode;

import StepRunner.Runner;
import cucumber.api.java.en.Given;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;

//import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;



public class ApiAccountArabic extends BaseClass  {
	
	//public static ExtentTest WriteExtentReport;
	//public static ExtentTest test;
	public static int iAccountServicesPass=0;
	public static int iAccountServicesFail=0;
	public static int iCardServicesPass=0;
	public static int iCardServicesFail=0;
	
	/*public static int iPaymentServicesPass=0;
	public static int iPaymentServicesFail=0;
	public static int iProfileServicesPass=0;
	public static int iProfileServicesFail=0;
	public static int iOtherServicesPass=0;
	public static int iOtherServicesFail=0;*/
	public static String sTokenkey = "03AGdBq25uLcqQmoufID-aCqfzV_wEOYl63bo92SDoA6R8NGE-FFkhlREI28Akm04ryxnbY29ydjyYumT5xBqllUXODFW_GSlSOhJZd43CjLhyBlsVDk1GzHs_aFeYfwvBRkkRgMqW-CLJ9VCOLgqyYy7KDhcmkg-Ox0gPIjgD8KGIBWbhekzGIiuawj_XD4cEkzEAJy5F_rtFzUt_C48HgptUfLq5CWjyPGxWBqWSWyXaKEuTHKTl1LGoCG0CF8yL6PG0Gtqi7KRk2i1K7LTw7UxOYu9GcxIj2qfsMj2ya_NdYQAdmIrlq4LjYOP49nKp5EbXzhDG0JQH6Pb8kFCt_S2MCI3u86Zyu4zqZv1ZturlDajTKoze7MaQUjCbXHTiqMsUcUCnq22LeLzHTcZ_FcEsAVbjsUZSM0gQk8q4M7uBNzQdF9ZO9Vi5y40fBtkJCiObo2sh82yL07tfuXpQpN7JYBqXEKGEOA";//"4f6351e5959fc2cbac38ed0760289517522893b9162b84ee9a7f043f5d286059";
	public static String Token = "";
	public static String prospectId = "";
	public static String sErrorLog;
	
	
	
	
	
	//public static String MobileNumber1="554562388";
	static String saveDirectory = "C://Users//xaatars//Desktop//Shahrukh";
	static ArrayList<String> ApiIds = new ArrayList<String>();

	private static void getExcelData()
	{

		
		String filename = saveDirectory + "//" + "TestData.xlsx";
		XSSFSheet applicationSheet = null;

		int appIdIndex = 0;
		String appValue=null;
		

		try
		{

			// Creating File Instance and Reading File...

			File file = new File(filename);
			FileInputStream fis = new FileInputStream(file);

			// Creating instance to move Excel File...

			XSSFWorkbook workbook = new XSSFWorkbook(fis);

			// Getting Expected Sheet To Read Content..

			for(int i = 0; i < workbook.getNumberOfSheets(); i++)
			{
				if(workbook.getSheetName(i).equals("Sheet1"))
				{
					applicationSheet = workbook.getSheetAt(i);
					System.out.println(applicationSheet.getSheetName());
					break;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception is :" + e);
		}

		// Gets Rows of Sheet named Application...
		Iterator<Row> rows = applicationSheet.iterator();

		row: while(rows.hasNext())
		{
			// Get One by one row....

			Row row = rows.next();

			// Get all cell of particular row...

			Iterator<Cell> cells = row.cellIterator();

			if(row.getRowNum() > 0)
			{
				column: while(cells.hasNext())
				{
					Cell cell = cells.next();
					int cellIndex = cell.getColumnIndex();

					if(cellIndex == appIdIndex)
					{
						System.out.println(cell.getRowIndex());
						switch(cell.getCellType())
						{
						case Cell.CELL_TYPE_STRING : // field that represents
							appValue = cell.getStringCellValue();
							System.out.println(appValue);
							ApiIds.add(appValue);
							break;

						case Cell.CELL_TYPE_NUMERIC :
							appValue = "0.0";
							break;

						default :
							break;
						}
					}

				}
			}
			else
			{
				while(cells.hasNext())
				{
					Cell cell = cells.next();

					if(cell.getCellType() == cell.CELL_TYPE_STRING)
					{
						if(cell.getStringCellValue().equals("ApiID"))
						{
							appIdIndex = cell.getColumnIndex();
							break;
						}
						else
						{
							System.out.println("No match found...");
						}
					}

				}
			}
		}
	}

	
	
	public static void main(String[] args) throws Exception {
		
		
		API_01();
		API_02();
		API_03();
		API_04();
		
	
		
	}
	
	

	public static void Apis() throws IOException {
		
		getExcelData();
		
	
		Header header = new Header("Content-Type","application/x-www-form-urlencoded");
		Response response = given()
						.header("Content-Type","application/x-www-form-urlencoded;charset=utf-8")
					.formParam("grant_type", "password")
				.formParam("username", "VTUSER")
				.formParam("password", "p@king1")
				.formParam("client_id", "0e50fbe72ae115ae5812")
				.formParam("bank_id", "RAK")
				.formParam("channel_id", "I")
				.formParam("client_secret", "693916a12ad010cb79b064b0f35d76405cb3df588a8280ae49ac2eec7f2c")
				.formParam("language_id", "001")
				.formParam("login_flag", "2")
				.formParam("login_type", "1")
				.formParam("statemode", "N")
				.formParam("refresh_token", "e998961112ab485d51384c433cf2eafc042490597ebc76e7607327217b5a28f9")
				.when()
				//.header(header).request()
				.post("http://10.15.24.34:8087/openAuth/v2/oauth/token");
	
		
		Framework.getreportfilename();
		Framework.statextentreport();
		
	
		
	}
	
	
	 @Given("^API Calls For EFR$")
	    public void pep_status_by_association_saving_salaride_page() throws Throwable {
		 if (Runner.status == true) {

				Runner.status = false; 
		 API_01();
		 API_02();
		 API_03();
		 API_04();
		 Runner.status = true;
		 }
	 }
	 
	
	public static void API_01() throws Exception
	//public static void API_02(String sRequest2, String fullName, String emailID, String countryCode, String mobileNo, String prodCategory, String personOfDetermination, String typeOfDisability, String disabilityRemarks, String language, String agentCode,String viewId) throws Exception
	{
		try {
		 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
		 String sTestCaseid= "";
		 Framework.WriteExtentReport=Framework.test.createNode("Navigate to API Look Up <br>");
		//int ApplyForIslamicSavingSelfEmployed.MobileNumber
	//	String MobileNumber = getColumnNumber(Spath,"MobileNumber",sTestCaseid);
			
		JSONObject body = new JSONObject();
		body.put("countryCode", "971");
		body.put("mobileNo", ApplyforAccountArabic.MobileNumber);
		
	
		String sRequest = "https://conv.rakbankonline.ae/api-uat/exp-api/products/accounts/prospects/lookup";
	
		
		
		Response response = given()
				.contentType("application/json")
				.accept("application/json")
				//.header("Authorization","a45e7250f2b06ad85f35bb4c24292f12e009088d57efa05aa9a036faeab71ea4")
				.header("X-Recaptcha-Token",sTokenkey)
				.body(body.toJSONString())
				.when()
				.post(sRequest)
				.then()
				//.statusCode(200)
				//.contentType("application/json")
				.extract()
				.response();
		System.out.println(response.getStatusCode());
		System.out.println("-------------"+response.asString());
		System.out.println("-------------"+response.getBody().asString());
		String  s = response.getBody().asString();
		
		Object body1 = JSONValue.parse(s);
		JSONObject obj= (JSONObject)body1;
		String sSearchResult = (String)obj.get("searchResult").toString();
		//obj.get("")
		System.out.println("-sSearchResult---"+sSearchResult);
	    String sSplit[] = sSearchResult.split("prospectId");
	    String sSplit1[] = sSplit[1].split(",");
	    prospectId=sSplit1[0].replace("\"", "").replace(":", "");
	    System.out.println("-prospectId---"+prospectId);
		
	    
	    WriteProspectID(prospectId);
	
		int iResponseCode = response.getStatusCode();
		
		System.out.println("-------------"+iResponseCode);
		System.out.println("-------------"+response.getStatusLine());
		
		Framework.WriteExtentReport.log(Status.INFO, "<b>Response:</b> "+response.asString());
		Framework.WriteExtentReport.log(Status.INFO, "<b>Status code:</b> "+iResponseCode);
		Framework.WriteExtentReport.log(Status.INFO, "<b>Content type:</b> "+response.getHeader("content-type"));
		Framework.WriteExtentReport.log(Status.INFO, "<b>Response time:</b> "+response.getTime()+" ms");
		System.out.println("16666666"+iResponseCode);
		if(response.getStatusCode()==201)
		{
			Framework.CreateResults(true, "Step Pass");
		}
		else
		{
			
			//Framework.CreateResults(false, sErrorLog);
		}
	}catch(Exception e) {
		System.out.println("API 1 failure");
	}
		 
	}

	public static void API_02() throws Exception
	//public static void API_02(String sRequest2, String fullName, String emailID, String countryCode, String mobileNo, String prodCategory, String personOfDetermination, String typeOfDisability, String disabilityRemarks, String language, String agentCode,String viewId) throws Exception
	{
		try {
		
		//String a=ApplyForIslamicSavingSelfEmployed.MobileNumber;
		 String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
		 String sTestCaseid= "";
		//String MobileNumber = getColumnNumber(Spath,"MobileNumber",sTestCaseid);
		 Framework.WriteExtentReport=Framework.test.createNode("Navigate to API OTP GENERATE <br>");
		JSONObject body = new JSONObject();
		body.put("prospectId",prospectId);
		body.put("action", "generate");
		body.put("countryCode", "971");
		body.put("mobileNo", ApplyforAccountArabic.MobileNumber);
	
	
		String sRequest = "https://conv.rakbankonline.ae/api-uat/exp-api/accounts/otp";
	
		
	
		Response response = given()
				.contentType("application/json")
				.accept("application/json")
				//.header("Authorization","a45e7250f2b06ad85f35bb4c24292f12e009088d57efa05aa9a036faeab71ea4")
				.header("X-Recaptcha-Token",sTokenkey)
				.body(body.toJSONString())
			
		
				.when()
				.post(sRequest)
				.then()
				//.statusCode(200)
				//.contentType("application/json")
				.extract()
				.response();
	
		int iResponseCode = response.getStatusCode();
		System.out.println("-------------"+iResponseCode);
		System.out.println("-------------"+response.getStatusLine());
	
		
		Framework.WriteExtentReport.log(Status.INFO, "<b>Response:</b> "+response.asString());
		Framework.WriteExtentReport.log(Status.INFO, "<b>Status code:</b> "+iResponseCode);
		Framework.WriteExtentReport.log(Status.INFO, "<b>Content type:</b> "+response.getHeader("content-type"));
		Framework.WriteExtentReport.log(Status.INFO, "<b>Response time:</b> "+response.getTime()+" ms");
		if(response.getStatusCode()==201)
		{
			Framework.CreateResults(true, "Step Pass");
		}
		else
		{
			//Framework.CreateResults(false, sErrorLog);
		}
	}catch(Exception e) {
		System.out.println("API 2 failure");
	}
		 
	}
	
	
	public static void API_03() throws Exception
	//public static void API_02(String sRequest2, String fullName, String emailID, String countryCode, String mobileNo, String prodCategory, String personOfDetermination, String typeOfDisability, String disabilityRemarks, String language, String agentCode,String viewId) throws Exception
	{
		try {
		String Spath ="/Users/digital2.0/Desktop/timesheet/TestData.xlsx";
		 String sTestCaseid= "";
		//String MobileNumber = BaseClass.getColumnNumber(Spath,"MobileNumber",sTestCaseid);
		 Framework.WriteExtentReport=Framework.test.createNode("Navigate to  API OTP  Verify  <br>");
		JSONObject body = new JSONObject();
		body.put("prospectId", prospectId);
		body.put("action", "verify");
		body.put("countryCode", "971");
		body.put("mobileNo", ApplyforAccountArabic.MobileNumber);
		body.put("otpToken", "378590");
		
	
	
		String sRequest = "https://conv.rakbankonline.ae/api-uat/exp-api/accounts/otp";
		//Framework.WriteExtentReport.log(Status.INFO, "<b>Request:</b> "+sRequest);
		
		
		System.out.println(prospectId);
		//Framework.WriteExtentReport.log(Status.INFO, "<b>Requestbody:</b> "+body);
		//Response response = get(sRequest);
		
		
		Response response = given()
				.contentType("application/json")
				.accept("application/json")
				//.header("Authorization","a45e7250f2b06ad85f35bb4c24292f12e009088d57efa05aa9a036faeab71ea4")
				.header("X-Recaptcha-Token",sTokenkey)
				.body(body.toJSONString())
				
			
				.when()
				.post(sRequest)
				.then()
				//.statusCode(200)
				//.contentType("application/json")
				.extract()
				.response();
		//System.out.println(response.getStatusCode());
		//System.out.println("-------------"+response.asString());
		//System.out.println("-------------"+response.getBody().asString());
		int iResponseCode = response.getStatusCode();
		System.out.println("-------------"+iResponseCode);
		System.out.println("-------------"+response.getStatusLine());
		//System.out.println("-------------"+response.getHeader("content-type"));
		//System.out.println("-------------"+response.getTime()+" Seconds");
	     // Token = response.jsonPath().getString("AccessToken");
	     // System.out.print(Token);
		//String Token = System.out.println("Bearer " +response.getHeader("AccessToken"));
		Token = response.getHeader("AccessToken");
		Framework.WriteExtentReport.log(Status.INFO, "<b>Response:</b> "+response.asString());
		Framework.WriteExtentReport.log(Status.INFO, "<b>Status code:</b> "+iResponseCode);
		Framework.WriteExtentReport.log(Status.INFO, "<b>Content type:</b> "+response.getHeader("content-type"));
		Framework.WriteExtentReport.log(Status.INFO, "<b>Response time:</b> "+response.getTime()+" ms");
		if(response.getStatusCode()==201)
		{
			Framework.CreateResults(true, "Step Pass");
		}
		else
		{
		//	Framework.CreateResults(false, sErrorLog);
		}
	}catch(Exception e) {
		System.out.println("API 3 failure");
	}
		 
	}
	
	
	public static void API_04() throws Exception
	//public static void API_02(String sRequest2, String fullName, String emailID, String countryCode, String mobileNo, String prodCategory, String personOfDetermination, String typeOfDisability, String disabilityRemarks, String language, String agentCode,String viewId) throws Exception
	{
		
		try {
		String fullname = "SHARABDHEEN ABOOBACKER";
		
		String firstName = "SHARABDHEEN";
		
		String lastName =  "ABOOBACKER";
		
		String EmiratesID="784198368135210";
		
		String dateOfBirth="1983-12-31";
		
		String PPT ="T2376506";
		
		String VISA ="7255084";
		
		String Nationality ="IN";
		
		String Gender ="M";
		
		
		long min = 4198310356500L;
        long max = 4198361999999L; 
        String ID="";
        System.out.println("Random value of type double between "+min+" to "+max+ ":");
        double a = Math.random()*(max-min+1)+min;  
          ID = "78"+String.valueOf(Math.round(a));
		System.out.println(ID);
		
		
		int min1 = 1000;
        int max1 = 2000; 
        String date="";
        System.out.println("Random value of type double between "+min+" to "+max+ ":");
        double a1 = Math.random()*(max1-min1+1)+min1;  
        date = String.valueOf(Math.round(a1));
		System.out.println(date);
		
		int min2 = 2300000;
        int max2 = 2399999; 
        String PPT1="";
        System.out.println("Random value of type double between "+min+" to "+max+ ":");
        double a2 = Math.random()*(max2-min2+1)+min2;  
        PPT1 = "T"+String.valueOf(Math.round(a2));
		System.out.println(PPT1);
		
		int min3 = 2300000;
        int max3 = 2399999; 
        String VISA1="";
        System.out.println("Random value of type double between "+min+" to "+max+ ":");
        double a3 = Math.random()*(max3-min3+1)+min3;  
        VISA1 = String.valueOf(Math.round(a3));
		System.out.println(VISA1);
		
		
		Random r = new Random();
        String sName = "";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < 8; i++) {
            sName = sName + String.valueOf(alphabet.charAt(r.nextInt(alphabet.length())));
        }
        System.out.println(sName);
        
        Random r1 = new Random();
        String sName1 = "";
        String alphabet1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < 8; i++) {
            sName1 = sName1 + String.valueOf(alphabet1.charAt(r.nextInt(alphabet1.length())));
        }
        System.out.println(sName1);
        
		
		String CustomerType = "";
		try {
			CustomerType=BaseClass.getColumnNumber("","CustomerType","");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CustomerType = "";
		}
		
		if(CustomerType.equalsIgnoreCase("New")) {
			
			fullname = sName+" "+sName1;
			
			 firstName = sName;
			
			lastName =  sName1;
			
			EmiratesID= ID;
			
			//dateOfBirth= date;
			
			//PPT = PPT1;
			
			//VISA=VISA1;
			
		}
		
       if(CustomerType.equalsIgnoreCase("NTB")) {
			
        	      firstName =BaseClass.getColumnNumber("","firstName","");
        			lastName =BaseClass.getColumnNumber("","lastName","");
        			
        			fullname = firstName+" "+lastName;
        			
        			EmiratesID =BaseClass.getColumnNumber("","EmiratesID","");
        		    dateOfBirth =BaseClass.getColumnNumber("","dateOfBirth","");
        			 PPT =BaseClass.getColumnNumber("","PPT","");
        			 Nationality=BaseClass.getColumnNumber("","Nationality","");
        			 Gender =BaseClass.getColumnNumber("","Gender","");
        			 
        			 
        			//String VISA =BaseClass.getColumnNumber("","VISA","");
			
			//dateOfBirth= date;
			
			//PPT = PPT1;
			
			//VISA=VISA1;
			
		    }
		
		
		JSONObject body = new JSONObject();
		body.put("viewId", "2131");
		
		 Framework.WriteExtentReport=Framework.test.createNode("Navigate to EFR API Update to DEH <br>");
		JSONObject kycInfo1 = new JSONObject();
		kycInfo1.put("fullName", kycInfo1);
		kycInfo1.put("firstName", kycInfo1);
		kycInfo1.put("lastName", kycInfo1);
		kycInfo1.put("residenceCountry", kycInfo1);
		kycInfo1.put("dateOfBirth", kycInfo1);
		kycInfo1.put("gender", kycInfo1);
		kycInfo1.put("placeOfBirth", kycInfo1);
		kycInfo1.put("nationalityMOI", kycInfo1);
		
		
		body.put("kycInfo", kycInfo1);
	
		String sRequest = "https://conv.rakbankonline.ae/api-uat/exp-api/products/accounts/prospects/"+prospectId;
		System.out.print(prospectId);
		
		String body1="{\n"
				+ "  \"viewId\": \"UpdateKycEFRView\",\n"
				+ "  \"kycInfo\": {\n"
				+ "    \"fullName\": \""+fullname+"\",\n"
				+ "    \"firstName\": \""+firstName+"\",\n"
				+ "    \"lastName\": \""+lastName+"\",\n"
				+ "    \"residenceCountry\": \"AE\",\n"
				+ "    \"dateOfBirth\": \""+dateOfBirth+"\",\n"
				+ "    \"gender\": \""+Gender+"\",\n"
				+ "    \"placeOfBirth\": \"POZHIYOOR, KERALA\",\n"
				+ "    \"nationalityMOI\": \""+Nationality+"\",\n"
				+ "    \"kycDocuments\": [\n"
				+ "      {\n"
				+ "        \"documentType\": \"EMID\",\n"
				+ "        \"documentNo\": \""+EmiratesID+"\",\n"
				+ "        \"documentExpiryDate\": \"2023-07-15\",\n"
				+ "        \"documentIssueDate\": \"2019-07-14\",\n"
				+ "        \"countryOfIssue\": \"AE\",\n"
				+ "        \"documentIssuePlace\": \"AE\",\n"
				+ "        \"kycDocumentMetadata\": [\n"
				+ "          {\n"
				+ "            \"fileName\": \"id-front.png\",\n"
				+ "            \"filePath\": \"/apps/FEBA_BATCH_11.11/retailAccOnboarding/Documents/"+prospectId+"/id-front.png\",\n"
				+ "            \"fileDescription\": \"Emirates ID front\",\n"
				+ "            \"fileFormat\": \"image/png\",\n"
				+ "            \"documentRequired\": true,\n"
				+ "            \"bpmDocumentType\": \"EMID_Front\"\n"
				+ "          },\n"
				+ "          {\n"
				+ "            \"fileName\": \"id-back.png\",\n"
				+ "            \"filePath\": \"/apps/FEBA_BATCH_11.11/retailAccOnboarding/Documents/"+prospectId+"/id-back.png\",\n"
				+ "            \"fileDescription\": \"Emirates ID back\",\n"
				+ "            \"fileFormat\": \"image/png\",\n"
				+ "            \"documentRequired\": true,\n"
				+ "            \"bpmDocumentType\": \"EMID_Back\"\n"
				+ "          }\n"
				+ "        ]\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"documentType\": \"PPT\",\n"
				+ "        \"documentNo\": \""+PPT+"\",\n"
				+ "        \"documentExpiryDate\": \"2031-03-01\",\n"
				+ "        \"documentIssueDate\": \"2021-03-02\",\n"
				+ "        \"countryOfIssue\": \"IN\",\n"
				+ "        \"documentIssuePlace\": \"IN\",\n"
				+ "        \"kycDocumentMetadata\": [\n"
				+ "          {\n"
				+ "            \"fileName\": \"passport-front.png\",\n"
				+ "            \"filePath\": \"/apps/FEBA_BATCH_11.11/retailAccOnboarding/Documents/"+prospectId+"/passport-front.png\",\n"
				+ "            \"fileDescription\": \"Passport front\",\n"
				+ "            \"fileFormat\": \"image/png\",\n"
				+ "            \"documentRequired\": true,\n"
				+ "            \"bpmDocumentType\": \"Passport_FirstPage\"\n"
				+ "          }\n"
				+ "        ]\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"documentType\": \"VISA\",\n"
				+ "        \"countryOfIssue\": \"AE\",\n"
				+ "        \"documentNo\": \"201/2019/7255084\",\n"
				+ "        \"documentExpiryDate\": \"2023-07-15\",\n"
				+ "        \"documentIssueDate\": \"2019-07-16\",\n"
				+ "        \"documentIssuePlace\": \"FEDERAL AUTHORITY FOR IDENTITY CITIZENSHIP CUSTOMS & PORT SECURITY \\\\DUBAI\",\n"
				+ "        \"kycDocumentMetadata\": []\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  }\n"
				+ "}\n"
				+ "";
		
		/*String body1="{\n"
				+ "  \"viewId\": \"UpdateKycEFRView\",\n"
				+ "  \"kycInfo\": {\n"
				+ "    \"fullName\": \"abcgftrhf abcgft\",\n"
				+ "    \"firstName\": \"abcgftrhf\",\n"
				+ "    \"lastName\": \"abcgft\",\n"
				+ "    \"residenceCountry\": \"AE\",\n"
				+ "    \"dateOfBirth\": \"1983-12-31\",\n"
				+ "    \"gender\": \"M\",\n"
				+ "    \"placeOfBirth\": \"POZHIYOOR, KERALA\",\n"
				+ "    \"nationalityMOI\": \"IN\",\n"
				+ "    \"kycDocuments\": [\n"
				+ "      {\n"
				+ "        \"documentType\": \"EMID\",\n"
				+ "        \"documentNo\": \"784198368187654\",\n"
				+ "        \"documentExpiryDate\": \"2023-12-15\",\n"
				+ "        \"documentIssueDate\": \"2019-07-14\",\n"
				+ "        \"countryOfIssue\": \"AE\",\n"
				+ "        \"documentIssuePlace\": \"AE\",\n"
				+ "        \"kycDocumentMetadata\": [\n"
				+ "          {\n"
				+ "            \"fileName\": \"id-front.png\",\n"
				+ "            \"filePath\": \"/apps/FEBA_BATCH_11.11/retailAccOnboarding/Documents/"+prospectId+"/id-front.png\",\n"
				+ "            \"fileDescription\": \"Emirates ID front\",\n"
				+ "            \"fileFormat\": \"image/png\",\n"
				+ "            \"documentRequired\": true,\n"
				+ "            \"bpmDocumentType\": \"EMID_Front\"\n"
				+ "          },\n"
				+ "          {\n"
				+ "            \"fileName\": \"id-back.png\",\n"
				+ "            \"filePath\": \"/apps/FEBA_BATCH_11.11/retailAccOnboarding/Documents/"+prospectId+"/id-back.png\",\n"
				+ "            \"fileDescription\": \"Emirates ID back\",\n"
				+ "            \"fileFormat\": \"image/png\",\n"
				+ "            \"documentRequired\": true,\n"
				+ "            \"bpmDocumentType\": \"EMID_Back\"\n"
				+ "          }\n"
				+ "        ]\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"documentType\": \"PPT\",\n"
				+ "        \"documentNo\": \"T2376506\",\n"
				+ "        \"documentExpiryDate\": \"2031-03-01\",\n"
				+ "        \"documentIssueDate\": \"2021-03-02\",\n"
				+ "        \"countryOfIssue\": \"IN\",\n"
				+ "        \"documentIssuePlace\": \"IN\",\n"
				+ "        \"kycDocumentMetadata\": [\n"
				+ "          {\n"
				+ "            \"fileName\": \"passport-front.png\",\n"
				+ "            \"filePath\": \"/apps/FEBA_BATCH_11.11/retailAccOnboarding/Documents/"+prospectId+"/passport-front.png\",\n"
				+ "            \"fileDescription\": \"Passport front\",\n"
				+ "            \"fileFormat\": \"image/png\",\n"
				+ "            \"documentRequired\": true,\n"
				+ "            \"bpmDocumentType\": \"Passport_FirstPage\"\n"
				+ "          }\n"
				+ "        ]\n"
				+ "      },\n"
				+ "      {\n"
				+ "        \"documentType\": \"VISA\",\n"
				+ "        \"countryOfIssue\": \"AE\",\n"
				+ "        \"documentNo\": \"201/2019/7255084\",\n"
				+ "        \"documentExpiryDate\": \"2022-12-15\",\n"
				+ "        \"documentIssueDate\": \"2019-07-16\",\n"
				+ "        \"documentIssuePlace\": \"FEDERAL AUTHORITY FOR IDENTITY CITIZENSHIP CUSTOMS & PORT SECURITY \\\\DUBAI\",\n"
				+ "        \"kycDocumentMetadata\": []\n"
				+ "      }\n"
				+ "    ]\n"
				+ "  }\n"
				+ "}\n"
				+ "";*/
		
		
		Framework.WriteExtentReport.log(Status.INFO, "<b>Request:</b> "+sRequest);
		Framework.WriteExtentReport.log(Status.INFO, "<b>Requestbody:</b> "+body1);
		
		System.out.println(body1);
		
		//String sTokenkeys = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJPQXV0aFRva2VuIjoiM2VkM2Q1YzBlOWNmYzk5NzA4M2NlYzNkYWFmNTBiZTBhNmFiYzMzMGIzNDUyMzcwYWI3OGNjNzIzMDU2ODRjOCIsInByb3NwZWN0SWQiOiIyMTMxIiwicm9sZSI6IkNVU1RPTUVSIiwicGhvbmVOdW1iZXIiOiI1NTY3ODM0NTIiLCJLeWNPYXV0aEFjY2Vzc1Rva2VuIjoiZXlKaGJHY2lPaUpJVXpJMU5pSjkuZXlKemRXSWlPaUprWldnaUxDSjFjMlZ5Vkhsd1pTSTZJa0ZRVUNJc0ltcDBhU0k2SW1FMllXWTFZems1TFRVMVkyRXROR0kwT1MxaVlqRTJMV0ZqWW1ZM1pEWTRaVE00T0NJc0ltbGhkQ0k2TVRZMU9EUTROekk0T1N3aVpYaHdJam94TmpVNE5Ea3dPRGc1ZlEubWoxaXFlRFBDSHhwUkZwMUlrNzFHa1NOekpycFZudEZvMExpLUxOc2NvdyIsIk9BdXRoUmVmcmVzaFRva2VuIjoiOGRhZDU1MzYyZGZmNDdmYTZmZjIyNWVmODc1NWI0YzFkNTA5MTAxZDIyZTdmNzY1YzIyNmQ4NmZiZGE2Mzk5ZCIsIm9hdXRoVG9rZW5FeHBpcnlUaW1lIjoiMjAyMi0wNy0yMlQxNTowNjo0OS45MjQiLCJTdGF0ZW1lbnRPYXV0aEFjY2Vzc1Rva2VuIjoiZXlKaGJHY2lPaUpJVXpJMU5pSjkuZXlKemRXSWlPaUprWldnaUxDSjFjMlZ5Vkhsd1pTSTZJa0ZRVUNJc0ltcDBhU0k2SWpSbU9HUXpOamswTFRjeFlqZ3ROREl6WkMwNVpqWXlMV1kyTURJME5qRXpOMkl3TUNJc0ltbGhkQ0k2TVRZMU9EUTROekk0T1N3aVpYaHdJam94TmpVNE5Ea3dPRGc1ZlEuTnlJZ2EwWHpoSm9pSlhpalFwZFRwVXVocHJTVGhJaGNqc0hHZVg3emxWTSJ9.41_9F7t9qFvYZU272m1aRFvQ3KWT-hJeJhU8mO-02S0";
		
		String sTokenkeys = "Bearer "+Token;
		
		System.out.print(sTokenkeys);
		
		//String Tokens = System.out.println("Bearer"+Token);
		//Framework.WriteExtentReport.log(Status.INFO, "<b>Requestbody:</b> "+body);
		//Response response = get(sRequest);
		
		
		
	
		Response response = given()
				.contentType("application/json")
				.accept("application/json")
				//.header("Authorization","a45e7250f2b06ad85f35bb4c24292f12e009088d57efa05aa9a036faeab71ea4")
				.header("Authorization",sTokenkeys)
				.body(body1)
				.header("X-Recaptcha-Token",sTokenkey)
				/*.body("{\n"
						+ "  \"viewId\": \"UpdateKycEFRView\",\n"
						+ "  \"kycInfo\": {\n"
						+ "    \"fullName\": \""+fullname+"\",\n"
						+ "    \"firstName\": \""+firstName+"\",\n"
						+ "    \"lastName\": \""+lastName+"\",\n"
						+ "    \"residenceCountry\": \"AE\",\n"
						+ "    \"dateOfBirth\": \"1983-12-31\",\n"
						+ "    \"gender\": \"M\",\n"
						+ "    \"placeOfBirth\": \"POZHIYOOR, KERALA\",\n"
						+ "    \"nationalityMOI\": \"IN\",\n"
						+ "    \"kycDocuments\": [\n"
						+ "      {\n"
						+ "        \"documentType\": \"EMID\",\n"
						+ "        \"documentNo\": \"784198368135210\",\n"
						+ "        \"documentExpiryDate\": \"2023-07-25\",\n"
						+ "        \"documentIssueDate\": \"2019-07-14\",\n"
						+ "        \"countryOfIssue\": \"AE\",\n"
						+ "        \"documentIssuePlace\": \"AE\",\n"
						+ "        \"kycDocumentMetadata\": [\n"
						+ "          {\n"
						+ "            \"fileName\": \"id-front.png\",\n"
						+ "            \"filePath\": \"/apps/FEBA_BATCH_11.11/retailAccOnboarding/Documents/3542/id-front.png\",\n"
						+ "            \"fileDescription\": \"Emirates ID front\",\n"
						+ "            \"fileFormat\": \"image/png\",\n"
						+ "            \"documentRequired\": true,\n"
						+ "            \"bpmDocumentType\": \"EMID_Front\"\n"
						+ "          },\n"
						+ "          {\n"
						+ "            \"fileName\": \"id-back.png\",\n"
						+ "            \"filePath\": \"/apps/FEBA_BATCH_11.11/retailAccOnboarding/Documents/3542/id-back.png\",\n"
						+ "            \"fileDescription\": \"Emirates ID back\",\n"
						+ "            \"fileFormat\": \"image/png\",\n"
						+ "            \"documentRequired\": true,\n"
						+ "            \"bpmDocumentType\": \"EMID_Back\"\n"
						+ "          }\n"
						+ "        ]\n"
						+ "      },\n"
						+ "      {\n"
						+ "        \"documentType\": \"PPT\",\n"
						+ "        \"documentNo\": \"T2376506\",\n"
						+ "        \"documentExpiryDate\": \"2031-03-01\",\n"
						+ "        \"documentIssueDate\": \"2021-03-02\",\n"
						+ "        \"countryOfIssue\": \"IN\",\n"
						+ "        \"documentIssuePlace\": \"IN\",\n"
						+ "        \"kycDocumentMetadata\": [\n"
						+ "          {\n"
						+ "            \"fileName\": \"passport-front.png\",\n"
						+ "            \"filePath\": \"/apps/FEBA_BATCH_11.11/retailAccOnboarding/Documents/3542/passport-front.png\",\n"
						+ "            \"fileDescription\": \"Passport front\",\n"
						+ "            \"fileFormat\": \"image/png\",\n"
						+ "            \"documentRequired\": true,\n"
						+ "            \"bpmDocumentType\": \"Passport_FirstPage\"\n"
						+ "          }\n"
						+ "        ]\n"
						+ "      },\n"
						+ "      {\n"
						+ "        \"documentType\": \"VISA\",\n"
						+ "        \"countryOfIssue\": \"AE\",\n"
						+ "        \"documentNo\": \"201/2019/7255084\",\n"
						+ "        \"documentExpiryDate\": \"2023-07-15\",\n"
						+ "        \"documentIssueDate\": \"2019-07-16\",\n"
						+ "        \"documentIssuePlace\": \"FEDERAL AUTHORITY FOR IDENTITY CITIZENSHIP CUSTOMS & PORT SECURITY \\\\DUBAI\",\n"
						+ "        \"kycDocumentMetadata\": []\n"
						+ "      }\n"
						+ "    ]\n"
						+ "  }\n"
						+ "}\n"
						+ "")*/
				
				
				
				/*.body("{\r\n" + 
						"  \"fullName\": fullName,\r\n" + 
						"  \"emailId\": \"bhatabai.patil@rakbank.ae\",\r\n" + 
						"  \"countryCode\": 971,\r\n" + 
						"  \"mobileNo\": \"504963477\",\r\n" + 
						"  \"prodCategory\": \"C\",\r\n" + 
						"  \"personOfDetermination\": \"true\",\r\n" + 
						"  \"typeOfDisability\": \"others\",\r\n" + 
						"  \"disabilityRemarks\": \"test\",\r\n" + 
						"  \"language\": \"EN\",\r\n" + 
						"  \"agentCode\": \"5555\",\r\n" + 
						"  \"viewId\": \"createView\"\r\n" + 
						"}\r\n" + 
						"")*/
				.when()
				.patch(sRequest)
				.then()
				//.statusCode(200)
				//.contentType("application/json")
				.extract()
				.response();
		
		int iResponseCode = response.getStatusCode();
		System.out.println("-------------"+iResponseCode);
		System.out.println("-------------"+response.getStatusLine());
		
		
		System.out.println("-------------"+response.asString());
		System.out.println("-------------"+response.getBody().asString());

		
		Framework.WriteExtentReport.log(Status.INFO, "<b>Response:</b> "+response.asString());
		Framework.WriteExtentReport.log(Status.INFO, "<b>Status code:</b> "+iResponseCode);
		Framework.WriteExtentReport.log(Status.INFO, "<b>Content type:</b> "+response.getHeader("content-type"));
		Framework.WriteExtentReport.log(Status.INFO, "<b>Response time:</b> "+response.getTime()+" ms");
		if(response.getStatusCode()==201)
		{
			Framework.CreateResults(true, "Step Pass");
		}
		else
		{
		//	Framework.CreateResults(false, sErrorLog);
		}
	}catch(Exception e) {
		System.out.println("API 4 failure");
	}
		 
	}
	
	
	
}