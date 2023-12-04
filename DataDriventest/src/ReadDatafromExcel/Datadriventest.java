package ReadDatafromExcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Datadriventest {

	public static void main(String[] args) throws IOException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		FileInputStream file = new FileInputStream("D:\\Trainings & Learnings\\Selenium Project\\Selenium Questions and Answers\\data driver sample file.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		
		
		for(int i=1; i<=rowcount; i++) {
			 XSSFRow row = sheet.getRow(i);

		      String cell1 = row.getCell(0).getStringCellValue();
		      String cell2 = row.getCell(1).getStringCellValue();
		      String cell3 = row.getCell(2).getStringCellValue();
		      int cell4 = (int)row.getCell(3).getNumericCellValue();
		      String cell5 = row.getCell(4).getStringCellValue();

		      driver.findElement(By.xpath("//input[@name='name']")).sendKeys(cell1);
		      driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(cell2);
		      driver.findElement(By.xpath("//input[@name='email']")).sendKeys(cell3);
		      driver.findElement(By.xpath("//input[@name='number']")).sendKeys(String.valueOf(cell4));
//		    		driver.findElement(By.xpath("//input[@name='gender']")).sendKeys(cell5).click();

		      List radiobutton = driver.findElements(By.name("gender"));
		      int size = radiobutton.size();

		      for(int j=0; j<size; j++) {
		        String val = ((WebElement) radiobutton.get(j)).getAttribute("value");

		        if(val.equalsIgnoreCase(cell5)) {
		          ((WebElement) radiobutton.get(j)).click();
		          break;
		        }

		      }

		      driver.findElement(By.xpath("//input[@name='Register']")).click();

		      driver.get("http://localhost:8084/ManiProject/");

		    }
		    driver.close();

		    workbook.close();

		  }
		}
