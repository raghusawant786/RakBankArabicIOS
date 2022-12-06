package StepDefinations;

//import org.junit.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.sun.xml.internal.ws.client.sei.ResponseBuilder.Body;
import com.fasterxml.jackson.databind.node.ObjectNode;

import StepDefinations.BaseClass;
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



public class ApiCardsArabic extends BaseClass  {
	
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
		
		
		try {
			API_01();
			API_02();
			API_03();
			API_04();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("API failure ="+e.getMessage());
		}
		
		/*File src = new File("C://Users//xaatars//Desktop//Shahrukh//TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(1);
		for(int i=1;i<=10;i++)
		{
			String sRequest32= sheet1.getRow(i).getCell(1).getStringCellValue();
			
			API_32("Api_32_"+i+"(updateRetailProspects-KFS Consents and Declarations)");
		}
	
		wb.close();*/
		//

		/*while(true)
		{
			Date sDate = new Date();
			int iHour = sDate.getHours();
			int iMinut = sDate.getMinutes();
			if(iHour==9){
				if(iMinut==9)
			{
				Apis();
				break;
			}
			}
			System.out.println(iHour);
			//Thread.sleep(300*1000);
			//Thread.sleep(300*1000);
			//Thread.sleep(300*1000);
			Thread.sleep(15000);
			
		}*/
		
	}
	
	

	public static void Apis() throws IOException {
		
		getExcelData();
		
		/*Response response = given()
				.contentType("application/json")
				.accept("application/json")
				.header("Authorization","1ecd8f5fd892a41459c4886c68f6184f29e145f989eaa26071de5ebc12c28d93")
				//.body(userDetails)
				.when()
				.get("http://10.15.24.32:8096/dehRetail/rest/v1/banks/RAK/retail/products/cards/codereferences/datalist")
				.then()
				//.statusCode(200)
				//.contentType("application/json")
				.extract()
				.response();
		System.out.println(response.getStatusCode());*/
		
		
		/*Map<String,Object> userDetails = new HashMap<>();
		userDetails.put("grant_type", "password");
		userDetails.put("username", "VTUSER");
		userDetails.put("password", "p@king1");
		userDetails.put("client_id", "0e50fbe72ae115ae5812");
		userDetails.put("bank_id", "RAK");
		userDetails.put("channel_id", "I");
		userDetails.put("client_secret", "693916a12ad010cb79b064b0f35d76405cb3df588a8280ae49ac2eec7f2c");
		userDetails.put("language_id", "001");
		userDetails.put("login_flag", "2");
		userDetails.put("login_type", "1");
		userDetails.put("statemode", "N");
		userDetails.put("refresh_token", "e998961112ab485d51384c433cf2eafc042490597ebc76e7607327217b5a28f9");*/
		Header header = new Header("Content-Type","application/x-www-form-urlencoded");
		Response response = given()
				//.with().auth().preemptive()
				//.basic("xaatars", "Hasanw@123456")
				//.contentType("application/x-www-form-urlencoded")
				//.contentType(ContentType.URLENC)
				//.accept("application/json")
				.header("Content-Type","application/x-www-form-urlencoded;charset=utf-8")
				//.header("User-Agent","Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome 79.0.3945.88 Safari/537.36")
				//.header("Authorization","8f6eb5b6681004d91b0464661d0440becf3302cf09508ea6518d246bd0af2ba9")
				//.body(userDetails)
				/*.body("{\r\n" + 
						"\"grant_type\":\"password\",\r\n" + 
						"\"username\":\"VTUSER\",\r\n" + 
						"\"password\": \"p@king1\",\r\n" + 
						"\"client_id\": \"0e50fbe72ae115ae5812\",\r\n" + 
						"\"bank_id\":\"RAK\",\r\n" + 
						"\"channel_id\":\"I\",\r\n" + 
						"\"client_secret\":\"693916a12ad010cb79b064b0f35d76405cb3df588a8280ae49ac2eec7f2c\",\r\n" + 
						"\"language_id\": \"001\",\r\n" + 
						"\"login_flag\":\"2\",\r\n" + 
						"\"login_type\":\"1\",\r\n" + 
						"\"statemode\":\"N\",\r\n" + 
						"\"refresh_token\":\"e998961112ab485d51384c433cf2eafc042490597ebc76e7607327217b5a28f9\"\r\n" + 
						"\r\n" + 
						"}	\r\n" + 
						"")*/
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
				//.then()
				//.statusCode(200)
				//.contentType("application/json")
				//.extract()
				//.response();
		
		//System.out.println(response.asString());
		sTokenkey = response.jsonPath().getString("3AGdBq27KanW-VsarVYMoyCSKJPyyUwZYHJvOGD0A0focpJlWvzf6cNjfYAacPkL2s2W-Sk3sTvxnIvKaVFxGs_3R8DEhFzeFGRifyohG0QTOtCi-GC3ulcA_BaqepRGMwCgCpQNTUC1RjeXahhuo8CjiFJiuuUxZ7Um8NygjD941vMfBrhsyu9OqqRG3dzAAefeklf3IUXdVIfFdNBSyNG24AWNQs14w7ONOkU0ZsZ8zQxqr9YLt5063GXKsOtdTmnkDi8MpV8iL4ittbokEBIuWDQfdFBS81EDmV-WSCx_vxvX0yiG2i3eJsddYkiJVtZGHPSAR8T3NGgys2b9GAeeNaU8LtMPezuwEwu1XgLAiQj9JeJsVAYX53tH7Boc1YMGxV42FLk3BEBO-cJUJ4xm22AN27gU3BSXdhI39TVKb22gUj-2KCkojlRLSR-LgzCS_WOtk6MhM");
		System.out.println(sTokenkey);
		
		/*File src =new File("C://Users//xaatars//Desktop//Shahrukh//TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String sRequest1= sheet1.getRow(1).getCell(1).getStringCellValue();
		String sRequest2= sheet1.getRow(2).getCell(1).getStringCellValue();
		
		String fullName= sheet1.getRow(2).getCell(2).getStringCellValue();
		String emailID= sheet1.getRow(2).getCell(3).getStringCellValue();
		String countryCode= sheet1.getRow(2).getCell(4).getStringCellValue();
		String mobileNo= sheet1.getRow(2).getCell(5).getStringCellValue();
		String prodCategory= sheet1.getRow(2).getCell(6).getStringCellValue();
		String personOfDetermination= sheet1.getRow(2).getCell(7).getStringCellValue();
		String typeOfDisability= sheet1.getRow(2).getCell(8).getStringCellValue();
		String disabilityRemarks= sheet1.getRow(2).getCell(9).getStringCellValue();
		String language= sheet1.getRow(2).getCell(10).getStringCellValue();
		String agentCode= sheet1.getRow(2).getCell(11).getStringCellValue();
		String viewId= sheet1.getRow(2).getCell(12).getStringCellValue();*/
		
		Framework.getreportfilename();
		Framework.statextentreport();
		//Framework.createhtmlreportdesign();
		//API_static();
		
		/*for(int i=0; i<ApiIds.size(); i++ )
		{
			for(int k=0; k<ApiIds.size(); k++ )
			{
				String Apiid=ApiIds.get(i);
				int j=k+1;
				String value="";
				if(j<=9)
				{
					 value="0"+String.valueOf(j);
				}
				else {
					 value=String.valueOf(j);	
				}
					
				
				if(Apiid.contains(value))
				{
					try
			        {
			            TestData test = new TestData();
			            Class classobj = TestData.class;
			            Method [] methods = classobj.getMethods();
			            for(Method method : methods)
			            {
			                String MethodName = method.getName();
			               
			            
			                if(MethodName.contains(value))
			                {
			                	 System.out.println("Name of the method: " + MethodName);
			                    method.invoke(test, Apiid);
			                   
			                }
			            }
			        }
			        catch(Exception e)
			        {
			            
			        	System.out.println("Exception thrown is: " + e);
			        	
			        }
					break;

					
				}
			}
			
		}*/
		try
		{
			//API_12();//complete
			 //APIA();
			//aa();
			
			
			
			/*API_01("Api_01(dataList)");//complete
			API_02("Api_02(Create Prospect)");//complete
			API_03("Api_03(Search Prospect)");//complete
			API_04("Api_04(data list of employment)");//complete
			API_05("Api_05(Get the Document List)");//complete	
			API_06("Api_06(Update Card Prospects Card Selected)");//complete
			API_07("Api_07(Update Card Prospects Emp Details)");//complete
			API_08("Api_08(updateCardProspects efrdeatils)");//complete
			API_09("Api_09(updateCardProspects)");//complete
			API_10("Api_10(Generate OTP)");//complete
			API_11("Api_11(Resend OTP)");//complete
			API_12("Api_12( Verify OTP)");//complete
			//API();
			API_13("Api_13(Update Card Prospects Home Country Address details)");//complete
			API_14("Api_14(Update Card Prospects Residential Address details)");//complete
			API_15("Api_15(Update Card Prospects office Address details)");//complete
			API_16("Api_16(updateCardProspects MARKETINGConsent)");//complete
			API_17("Api_17(updateCardProspects TandCConsent)");//complete
			API_18("Api_18(updateCardProspects AECBConsent)");//complete
			API_19("Api_19(updateCardProspects FTSConsent)");//complete
			API_20("Api_20(Get the data for list accout services)");//complete
			API_21("Api_21(createProspect)");//complete
			API_22("Api_22(Search Prospect)");////complete
			API_23("Api_23(updateProspect PATCH-ProductInfo)");//complete
		    API_24("Api_24(updateRetailProspects-KFS Consent)");//complete
			API_25("Api_25(updateProspect PATCH-KycInfo)"); //complete
			API_26("Api_26(updateProspect PATCH-Pep-1 (PEPAssociationView))");// complete but 3 empty field not added in body
			API_27("Api_27(updateProspect PATCH-Pep -2)");//complete
			API_28("Api_28(updateProspect PATCH-Employment  Salaried)");//complete
			API_29("Api_29(updateProspect PATCH-Employment Self Employed)");//complete
			API_30("Api_30(updateProspect - Address)");//complete
			API_31("Api_31(updateRetailProspects-FATCAandCRS)");
			API_32("Api_32(updateRetailProspects-KFS Consents and Declarations)");
			API_33("Api_33(BackgroundQuestions NEW Views - income view)");
			API_34("Api_34(BackgroundQuestions NEW Views - self employedview)");
			API_35("Api_35(BackgroundQuestions NEW Views - salaried view)");
			API_36("Api_36(updateCardProspects FriendDetails)");
			API_37("Api_37(updateCardProspects FATCAdetails)");
			API_38("Api_38(updateCardProspects personalDetails)");
			API_39("Api_39(updateCardProspects AcquisitionOfferDetails)");
			API_40("Api_40(updateCardProspects CreditShield RAKprotect)");
			API_41("Api_41(updateCardProspects IPAAmount)");
			API_42("Api_42(updateCardProspects LifeStyleQues)");
			API_43("Api_43(updateCardProspects coolingPeriod)");*/
			/*File src = new File("C://Users//xaatars//Desktop//Shahrukh//TestData1.xlsx");
			FileInputStream fis=new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet1=wb.getSheetAt(1);
			for(int i=1;i<=10;i++)
			{
				String sRequest31= sheet1.getRow(i).getCell(1).getStringCellValue();
				API_02("Api_02_"+i+"(Create Prospect)");
				
			}
			
		
			wb.close();*/
			
			
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		//Framework.createhtmlreportdata("Account <br>Services",iAccountServicesPass,iAccountServicesFail);
		//Framework.createhtmlreportdata("Card <br>Services",iCardServicesPass,iCardServicesFail);
		/*Framework.createhtmlreportdata("Payment <br>Services",iPaymentServicesPass,iPaymentServicesFail);
		Framework.createhtmlreportdata("Profile <br>Services",iProfileServicesPass,iProfileServicesFail);
		Framework.createhtmlreportdata("Other <br>Services",iOtherServicesPass,iOtherServicesFail);*/
		
		/*Response response = get("https://reqres.in/api/users?page=2");
		System.out.println("-------------"+response.asString());
		System.out.println("-------------"+response.getBody().asString());
		System.out.println("-------------"+response.getStatusCode());
		System.out.println("-------------"+response.getStatusLine());
		System.out.println("-------------"+response.getHeader("content-type"));
		System.out.println("-------------"+response.getTime()+" Seconds");*/
		
	}
	
	
	 @Given("^API Calls For EFRCards$")
	    public void pep_status_by_association_saving_salaride_page() throws Throwable {
		 try {
		 API_01();
		 API_02();
		 API_03();
		 API_04();
	 } catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("API failure ="+e.getMessage());
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
		body.put("mobileNo", ApplyCreditCardsArabic.MobileNumber);
		
	     System.out.println(ApplyCreditCardsArabic.MobileNumber);
	     
	     
		//given()
		//.get("https://reqres.in/api/users?page=2");
		//Framework.test = Framework.extent.createTest("API ID: API_02"+"<br>"+"API Description: Create Prospect"+"<br>"+"User should be create successfully"+"<br>");
		//Framework.test.assignCategory("Card Services");
		//Framework.WriteExtentReport = Framework.test.createNode("Post request"+"<br><br>Expected result : "+"User Created successfully with responce code 201"+"<br>");
		String sRequest = "https://conv.rakbankonline.ae/api-uat/exp-api/products/cards/prospects/lookup";
		//Framework.WriteExtentReport.log(Status.INFO, "<b>Request:</b> "+sRequest);
		
		//System.out.println("11111111111"+a);
		
		//Framework.WriteExtentReport.log(Status.INFO, "<b>Requestbody:</b> "+body);
		//Response response = get(sRequest);
		
		
		Response response = given()
				.contentType("application/json")
				.accept("application/json")
				//.header("Authorization","a45e7250f2b06ad85f35bb4c24292f12e009088d57efa05aa9a036faeab71ea4")
				.header("X-Recaptcha-Token",sTokenkey)
				.body(body.toJSONString())
				
				
				
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
				.post(sRequest)
				.then()
				//.statusCode(200)
				//.contentType("application/json")
				.extract()
				.response();
		System.out.println(response.getStatusCode());
		System.out.println("-------------"+response.asString());
		System.out.println("-------------"+response.getBody().asString());
		System.out.println("-------------"+response.getBody().asString());
		String  s = response.getBody().asString();
		
		Object body1 = JSONValue.parse(s);
		JSONObject obj= (JSONObject)body1;
		String sSearchResult = (String)obj.get("searchResult").toString();
		//obj.get("")
		System.out.println("-9999999---"+sSearchResult);
	    String sSplit[] = sSearchResult.split("prospectId");
	    String sSplit1[] = sSplit[1].split(",");
	    prospectId=sSplit1[0].replace("\"", "").replace(":", "");
	    System.out.println("-9999999---"+prospectId);
		
	    
	   WriteProspectID(prospectId);
		/*JSONArray a = new JSONArray();
		a.add(sSearchResult);
		System.out.println("-------------"+a.get(1));
		
        //List<String> sSearchResult1=new ArrayList<>();
        //sSearchResult1.add(sSearchResult);
        JSONParser p = new JSONParser();
        JSONObject j = (JSONObject)p.parse(sSearchResult);
       // JSONObject j = JSONParser.parseString();
        
        //Object body2 = JSONValue.parse(j.get("prospectId"j));
		//Object body2 = JSONValue.parse(obj.get("searchResult").toString());
		
		//JSONObject obj1= (JSONObject)body2;
		//prospectId = (String)obj1.get("prospectId").toString();
        prospectId=j.get("prospectId").toString();
		System.out.println("-9999999---"+prospectId);*/
		
		int iResponseCode = response.getStatusCode();
		//System.out.println("16666666"+iResponseCode);
		System.out.println("-------------"+iResponseCode);
		System.out.println("-------------"+response.getStatusLine());
		//System.out.println("-------------"+response.getHeader("content-type"));
		//System.out.println("-------------"+response.getTime()+" Seconds");
		//prospectId = response.jsonPath().getString
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
		body.put("mobileNo", ApplyCreditCardsArabic.MobileNumber);
	
		
		 System.out.println(ApplyCreditCardsArabic.MobileNumber);
		//given()
		//.get("https://reqres.in/api/users?page=2");
		//Framework.test = Framework.extent.createTest("API ID: API_02"+"<br>"+"API Description: Create Prospect"+"<br>"+"User should be create successfully"+"<br>");
		//Framework.test.assignCategory("Card Services");
		//Framework.WriteExtentReport = Framework.test.createNode("Post request"+"<br><br>Expected result : "+"User Created successfully with responce code 201"+"<br>");
		String sRequest = "https://conv.rakbankonline.ae/api-uat/exp-api/cards/otp";
		//Framework.WriteExtentReport.log(Status.INFO, "<b>Request:</b> "+sRequest);
		
		//System.out.println(body);
		//Framework.WriteExtentReport.log(Status.INFO, "<b>Requestbody:</b> "+body);
		//Response response = get(sRequest);
		
	
		Response response = given()
				.contentType("application/json")
				.accept("application/json")
				.header("X-Recaptcha-Token",sTokenkey)
				.body(body.toJSONString())
			
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
		body.put("mobileNo", ApplyCreditCardsArabic.MobileNumber);
		body.put("otpToken", "378590");
		
		 System.out.println(ApplyCreditCardsArabic.MobileNumber);
		//given()
		//.get("https://reqres.in/api/users?page=2");
		//Framework.test = Framework.extent.createTest("API ID: API_02"+"<br>"+"API Description: Create Prospect"+"<br>"+"User should be create successfully"+"<br>");
		//Framework.test.assignCategory("Card Services");
		//Framework.WriteExtentReport = Framework.test.createNode("Post request"+"<br><br>Expected result : "+"User Created successfully with responce code 201"+"<br>");
		String sRequest = "https://conv.rakbankonline.ae/api-uat/exp-api/cards/otp";
		//Framework.WriteExtentReport.log(Status.INFO, "<b>Request:</b> "+sRequest);
		
		
		System.out.println(prospectId);
		//Framework.WriteExtentReport.log(Status.INFO, "<b>Requestbody:</b> "+body);
		//Response response = get(sRequest);
		
		
		Response response = given()
				.contentType("application/json")
				.accept("application/json")
				//.header("Authorization","a45e7250f2b06ad85f35bb4c24292f12e009088d57efa05aa9a036faeab71ea4")
				.header("Authorization","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJPQXV0aFRva2VuIjoiNGVhNzE1ZmQyMThkN2FkY2FjYTdhMjliYmUyYmVjZWIwZmFiZGJmNDQxYzUxMjlhYWQxOGVlZmY3M2Q4ODhiMyIsInByb3NwZWN0SWQiOiIxMTc4NCIsInJvbGUiOiJDVVNUT01FUiIsInBob25lTnVtYmVyIjoiNTU1NTc3MjE2IiwiS3ljT2F1dGhBY2Nlc3NUb2tlbiI6ImV5SmhiR2NpT2lKSVV6STFOaUo5LmV5SnpkV0lpT2lKa1pXZ2lMQ0oxYzJWeVZIbHdaU0k2SWtGUVVDSXNJbXAwYVNJNklqTmhNMlE0WmpJeExXVmtabUl0TkdJek1TMDRNVEkxTFRaa01HSXlZMkpqTURNMVpDSXNJbWxoZENJNk1UWTJNVFV4TWpjd05Dd2laWGh3SWpveE5qWXhOVEUyTXpBMGZRLllQLXJmOWsyM2Ria2s4VjZNSnVZQXJKOXVVZVNvUUlEcTEzTW0yc0g1cU0iLCJPQXV0aFJlZnJlc2hUb2tlbiI6ImVkMjRiYTNlNjg5MjQyMzllZjdkMDU4ZjVlMjQxNWU3NjM3NGVmZDkxYTBjYmZiY2IyZDQxODliOWQwYTkwZGMiLCJvYXV0aFRva2VuRXhwaXJ5VGltZSI6IjIwMjItMDgtMjZUMTU6MzA6MjUuMjQ0IiwiU3RhdGVtZW50T2F1dGhBY2Nlc3NUb2tlbiI6ImV5SmhiR2NpT2lKSVV6STFOaUo5LmV5SnpkV0lpT2lKa1pXZ2lMQ0oxYzJWeVZIbHdaU0k2SWtGUVVDSXNJbXAwYVNJNklqazVNbVU1T1dRd0xUVXdNekl0TkRSaU5DMDVOVGszTFdOaVlqVXdZV0ZpTlRWaU5pSXNJbWxoZENJNk1UWTJNVFV4TWpjd05Dd2laWGh3SWpveE5qWXhOVEUyTXpBMGZRLmlDUVBKNV8teWlJMlFHN1R2TV9DanVCR3l1cmFlbUxkUEc2M3I4TkNRSnMifQ.CIuzm4CWq3UxsTX_t8Kx5UWMd0MvPuEuEyp7wAtsklI")
				.header("X-Recaptcha-Token",sTokenkey)
				.body(body.toJSONString())
				
				
				
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
		
		System.out.println(Token);
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
			System.out.println("API 3 failure");
		}
	}
	
	
	public static void API_04() throws Exception
	//public static void API_02(String sRequest2, String fullName, String emailID, String countryCode, String mobileNo, String prodCategory, String personOfDetermination, String typeOfDisability, String disabilityRemarks, String language, String agentCode,String viewId) throws Exception
	{
		try {
        //System.out.println("MobileNumber================>>"+MobileNumber);
		
		//String FirstName =BaseClass.getColumnNumber("","FirstName","");
	//	String LastName =BaseClass.getColumnNumber("","LastName","");
		//String EmiratesID =BaseClass.getColumnNumber("","EmiratesID","");
		//String dateOfBirth =BaseClass.getColumnNumber("","dateOfBirth","");
		//String PPT =BaseClass.getColumnNumber("","PPT","");
		//String VISA =BaseClass.getColumnNumber("","VISA","");
		
		
		//String FullName = FirstName+" "+LastName;
		
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
        
		
		String CustomerType = "";
		try {
			CustomerType=BaseClass.getColumnNumber("","CustomerType","");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CustomerType = "";
		}
		
		if(CustomerType.equalsIgnoreCase("New")) {
			
			fullname = sName+" "+sName;
			
			 firstName = sName;
			
			lastName =  sName;
			
			EmiratesID= ID;
			
			//dateOfBirth= date;
			
			//PPT = PPT1;
			
			//VISA=VISA1;
			
		}
		
       /* if(CustomerType.equalsIgnoreCase("NTB")) {
			
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
			
		    }*/
		
		
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
		//kycInfo1.put("kycDocuments", kycDocuments1);
		
		
		
		/*JSONObject kycDocuments2 = new JSONObject();
		kycDocuments2.put("documentType", documentType);
		kycDocuments2.put("documentNo", documentNo);
		kycDocuments2.put("documentExpiryDate", documentExpiryDate);
		kycDocuments2.put("documentIssueDate", documentIssueDate);
		kycDocuments2.put("countryOfIssue", countryOfIssue);
		kycDocuments2.put("documentIssuePlace", documentIssuePlace);
		kycDocuments2.put("placeOfBirth", kycInfo1);*/
		
		//List<JSONObject> kycDocuments1=new ArrayList<>();
		//.add(kycInfo1);
    
		
		body.put("kycInfo", kycInfo1);
		//given()
		//.get("https://reqres.in/api/users?page=2");
		//Framework.test = Framework.extent.createTest("API ID: API_02"+"<br>"+"API Description: Create Prospect"+"<br>"+"User should be create successfully"+"<br>");
		//Framework.test.assignCategory("Card Services");
		//Framework.WriteExtentReport = Framework.test.createNode("Post request"+"<br><br>Expected result : "+"User Created successfully with responce code 201"+"<br>");
		//String sRequest = "https://dehuatcloud.raktest.ae/api-uat/exp-api/products/accounts/prospects/2207";
		String sRequest = "https://conv.rakbankonline.ae/api-uat/exp-api/products/cards/prospects/"+prospectId;
		System.out.print(prospectId);
		
		
		
		/*String body1="{\n"
				+ "  \"viewId\": \"UpdateKycEFRView\",\n"
				+ "  \"kycInfo\": {\n"
				+ "    \"fullName\": \"SHARABDHEEN ABOOBACKER\",\n"
				+ "    \"firstName\": \"SHARABDHEEN\",\n"
				+ "    \"lastName\": \"ABOOBACKER\",\n"
				+ "    \"residenceCountry\": \"AE\",\n"
				+ "    \"dateOfBirth\": \"1983-12-31\",\n"
				+ "    \"gender\": \"M\",\n"
				+ "    \"placeOfBirth\": \"POZHIYOOR, KERALA\",\n"
				+ "    \"nationalityMOI\": \"IN\",\n"
				+ "    \"kycDocuments\": [\n"
				+ "      {\n"
				+ "        \"documentType\": \"EMID\",\n"
				+ "        \"documentNo\": \"784198368135210\",\n"
				+ "        \"documentExpiryDate\": \"2023-07-15\",\n"
				+ "        \"documentIssueDate\": \"2019-07-14\",\n"
				+ "        \"countryOfIssue\": \"AE\",\n"
				+ "        \"documentIssuePlace\": \"AE\",\n"
				+ "        \"kycDocumentMetadata\": [\n"
				+ "          {\n"
				+ "            \"fileName\": \"id-front.png\",\n"
				+ "            \"filePath\": \"/apps/FEBA_BATCH_11.11/retailAccOnboarding/Documents/4025/id-front.png\",\n"
				+ "            \"fileDescription\": \"Emirates ID front\",\n"
				+ "            \"fileFormat\": \"image/png\",\n"
				+ "            \"documentRequired\": true,\n"
				+ "            \"bpmDocumentType\": \"EMID_Front\"\n"
				+ "          },\n"
				+ "          {\n"
				+ "            \"fileName\": \"id-back.png\",\n"
				+ "            \"filePath\": \"/apps/FEBA_BATCH_11.11/retailAccOnboarding/Documents/4025/id-back.png\",\n"
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
				+ "            \"filePath\": \"/apps/FEBA_BATCH_11.11/retailAccOnboarding/Documents/4025/passport-front.png\",\n"
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
				+ "";*/
		
		
		String body1="{\n"
				+ "  \"viewId\": \"updateEFRDetailsView\",\n"
				+ "  \"efrDetails\": {\n"
				+ "    \"maritalStatusCode\": \"2\",\n"
				+ "    \"maritalStatusDescriptionEN\": \"MARRIED\",\n"
				+ "    \"genderCode\": \"F\",\n"
				+ "    \"genderDescriptionEN\": \"FEMALE\",\n"
				+ "    \"placeOfBirth\": \"COCHIN, KERALA\",\n"
				+ "    \"mothersName\": \"ANNIE TOMY\",\n"
				+ "    \"residencyNumber\": \"201/2022/7174655\",\n"
				+ "    \"residencyIssuePlace\": \"ARE\",\n"
				+ "    \"residencyIssueDate\": \"2022-03-07\",\n"
				+ "    \"residencyExpiryDate\": \"2025-03-06\",\n"
				+ "    \"sponsorName\": \"AKSHAY SOFTWARE TECHNOLOGIES LIMITED\",\n"
				+ "    \"emidDetails\": {\n"
				+ "      \"daysToExpiry\": \"974\",\n"
				+ "      \"fullName\": \"MARIA TOMY GEORGE TOMY GEORGE\",\n"
				+ "      \"nationalityFull\": \"United Arab Emirates\",\n"
				+ "      \"nationalityIso2\": \"AE\",\n"
				+ "      \"nationalityIso3\": \"UAE\",\n"
				+ "      \"eidCardNumber\": \"784199674985355\",\n"
				+ "      \"eidIssueDate\": \"2022-03-07\",\n"
				+ "      \"eidExpiryDate\": \"2022-03-06\"\n"
				+ "    },\n"
				+ "    \"passportDetails\": {\n"
				+ "      \"daysToExpiry\": \"3420\",\n"
				+ "      \"dob\": \"1996-06-06\",\n"
				+ "      \"documentNumber\": \"V4208747\",\n"
				+ "      \"expiry\": \"2031-11-16\",\n"
				+ "      \"firstName\": \"MARIA\",\n"
				+ "      \"fullName\": \"MARIA TOMY GEORGE\",\n"
				+ "      \"issued\": \"2021-11-17\",\n"
				+ "      \"lastName\": \"GEORGE\"\n"
				+ "    }\n"
				+ "  }\n"
				+ "}";
		
		
		
		String body2="{\n"
				+ "  \"viewId\": \"updateEFRDetailsView\",\n"
				+ "  \"efrDetails\": {\n"
				+ "    \"maritalStatusCode\": \"2\",\n"
				+ "    \"maritalStatusDescriptionEN\": \"MARRIED\",\n"
				+ "    \"genderCode\": \"F\",\n"
				+ "    \"genderDescriptionEN\": \"FEMALE\",\n"
				+ "    \"placeOfBirth\": \"MANAPPARAI, TAMIL NADU\",\n"
				+ "    \"mothersName\": \"SABIYA BEGAM\",\n"
				+ "    \"residencyNumber\": \"201/2022/2917506\",\n"
				+ "    \"residencyIssuePlace\": \"ARE\",\n"
				+ "    \"residencyIssueDate\": \"2022-08-04\",\n"
				+ "    \"residencyExpiryDate\": \"2024-08-03\",\n"
				+ "    \"sponsorName\": \"AKSHAY SOFTWARE TECHNOLOGIES LIMITED\",\n"
				+ "    \"emidDetails\": {\n"
				+ "      \"daysToExpiry\": \"730\",\n"
				+ "      \"fullName\": \"NASIMA BANU\",\n"
				+ "      \"nationalityFull\": \"India\",\n"
				+ "      \"nationalityIso2\": \"IN\",\n"
				+ "      \"nationalityIso3\": \"IND\",\n"
				+ "      \"eidCardNumber\": \"784199584345799\",\n"
				+ "      \"eidIssueDate\": \"2022-08-04\",\n"
				+ "      \"eidExpiryDate\": \"2024-08-03\"\n"
				+ "    },\n"
				+ "    \"passportDetails\": {\n"
				+ "      \"daysToExpiry\": \"3653\",\n"
				+ "      \"dob\": \"1995-06-29\",\n"
				+ "      \"documentNumber\": \"U2735360\",\n"
				+ "      \"expiry\": \"2031-01-07\",\n"
				+ "      \"firstName\": \"NASIMA\",\n"
				+ "      \"fullName\": \"NASIMA BANU\",\n"
				+ "      \"issued\": \"2021-01-08\",\n"
				+ "      \"lastName\": \"BANU\"\n"
				+ "    }\n"
				+ "  }\n"
				+ "}";
			
			
		Framework.WriteExtentReport.log(Status.INFO, "<b>Request:</b> "+sRequest);
		Framework.WriteExtentReport.log(Status.INFO, "<b>Requestbody:</b> "+body2);
		
		System.out.println(body2);
		
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
				.header("X-Recaptcha-Token",sTokenkey)
				.body(body2)
				//.header("X-Recaptcha-Token",sTokenkeys)
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
		//System.out.println(response.getStatusCode());
		//System.out.println("-------------"+response.asString());
		//System.out.println("-------------"+response.getBody().asString());
		int iResponseCode = response.getStatusCode();
		System.out.println("-------------"+iResponseCode);
		System.out.println("-------------"+response.getStatusLine());
		//System.out.println("-------------"+response.getHeader("content-type"));
		//System.out.println("-------------"+response.getTime()+" Seconds");
		
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
		System.out.println("API 1 failure");
	}
	}
	
}