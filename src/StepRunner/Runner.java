package StepRunner;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.stream.Stream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.runner.RunWith;

import StepDefinations.BaseClass;
import StepDefinations.Framework;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class Runner {

	public static String sTestcase;
	public static String Build = "89105";
	public static String Language = "English";
	public static String DeviceType = "iOS";
	public static XSSFSheet sheet1;
	public static XSSFSheet sheet2;
	public static boolean status;
	public static XSSFWorkbook wb;
	public static String sFilePath;

	private static String[] defaultOptions = { "features",
			"/Users/rakbankmobility/eclipse-workspace-ios/MobileBDDiOS_Arabic/features", "--glue", "StepDefinations",
			"--tags", "@CardsArabic", "--plugin", "pretty", "--plugin", "html:target/cucumber.html",
			"--plugin", "json:cucumber.json"

	};

	public static void main(String[] args) throws Throwable {

		Framework.getreportfilename();
		Framework.statextentreport();

		sFilePath = "/Users/rakbankmobility/Documents/Raghunath/TestData/ios/TestData.xlsx";
		File src = new File(sFilePath);
		FileInputStream fis = new FileInputStream(src);


		wb = new XSSFWorkbook(fis);         
		sheet1 = wb.getSheetAt(0);         
		sheet2 = wb.getSheetAt(1);                   
	
		int iRowCount = 1;
		for (int iRCount = 1; iRCount <= 1000; iRCount++) {

			try {

				String sRowvalues = "";
				try {
					sRowvalues = sheet1.getRow(iRCount).getCell(1).getStringCellValue();
				} catch (Exception e) {
					break;
				}
				if (sRowvalues.equalsIgnoreCase("Yes")) {
					try {
						BaseClass.driver.closeApp();
						Thread.sleep(2000);
					} catch (Exception e) {
					}
					sTestcase = sheet1.getRow(iRowCount).getCell(0).getStringCellValue();
					Stream<String> cucumberOptions = Stream.concat(Stream.of(defaultOptions), Stream.of(args));

					cucumber.api.cli.Main.main(cucumberOptions.toArray(String[]::new));

					BaseClass.driver.closeApp();
					iRowCount = iRCount;
					break;
				}

			}

			catch (Exception e) {
				e.printStackTrace();
			}

		}

		wb.close();

	}

}
