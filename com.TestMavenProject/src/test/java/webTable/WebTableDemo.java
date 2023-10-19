package webTable;

import java.io.Console;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class WebTableDemo  {
	@Test
	public void VerifyTable() throws InterruptedException {
		System.setProperty("WebDriver.Edge.driver","D://Trainings & Learnings/Selenium Project/Selenium browser drivers/msedgedriver.exe");
		System.out.println("webbrowser is launched");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2021/08");
		
		List<WebElement> AllHeaders = driver.findElements(By.xpath("//table[contains(@id,'cust')]//th"));	
		System.out.println("Total no of headers:" + AllHeaders.size());
		
		Assert.assertEquals(AllHeaders.size(),5,"column count is not same");
		boolean status = false;
	
		for(WebElement ele:AllHeaders) {
			String value = ele.getText();
			System.out.println(value);
			
			if(value.contains("Action")) {
				status = true;
				break;
			}
			
		}
		Assert.assertTrue(status,"Header is not present");
		
		Thread.sleep(3000);
		//driver.close();
		
		System.out.println("=======================================");
	
		List<WebElement> NoofRows = driver.findElements(By.xpath("//table[contains(@id,'cust')]//tr"));	
		System.out.println("Total no of rows:" + NoofRows.size());
	
		Assert.assertEquals(NoofRows.size(),7,"table row count is not same");
		
		System.out.println("=======================================");

		List<WebElement> AllData = driver.findElements(By.xpath("//table[contains(@id,'cust')]//td"));	
		System.out.println("Total no of Data:" + AllData.size());
		
		Assert.assertEquals(NoofRows.size(),7,"table row count is not same");
		boolean datastatus = false;
		
		for(WebElement ele:AllData) {
			String value = ele.getText();
			System.out.println(value);
			
			if(value.contains("California")) {
				datastatus = true;
				break;
			}
			
		}
		Assert.assertTrue(datastatus,"Record is not present");
		
		System.out.println("=======================================");
		

		List<WebElement> SpecificColumn = driver.findElements(By.xpath("//table[contains(@id,'cust')]//tr//td[2]"));	
		//System.out.println("Total no of column:" + SpecificColumn.size());
		
	//	Assert.assertEquals(NoofRows.size(),7,"table row count is not same");
		boolean SpecificColumnstatus = false;
		
//		
//		//normal for loop
//		for(int i=0;i<SpecificColumn.size();i++)
//		{
//			WebElement element = SpecificColumn.get(i);
//			String value = element.getText();
//
//			if(value.contains("Action")) {
//				status = true;
//				break;
//			}
//		}
		
		
		//Enhanced for loop
		for(WebElement ele:SpecificColumn) {
			String value = ele.getText();
			System.out.println(value);
			
			if(value.contains("Java")) {
				SpecificColumnstatus = true;
				break;
			}
			
		}
		Assert.assertTrue(SpecificColumnstatus,"Record column is not present");
		
		System.out.println("=======================================");
		
		driver.findElement(By.xpath("//td[text()='Java']//preceding-sibling::td/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[text()='Ola']//following-sibling::td[3]//a")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		List<WebElement> TotalRows = driver.findElements(By.xpath("//table[contains(@id,'cust')]//tr"));
		System.out.println("total no of rows:"+ TotalRows.size());
		System.out.println("=======================================");
		List<WebElement> TotalColumns = driver.findElements(By.xpath("//table[contains(@id,'cust')]//th"));
		System.out.println("total no of Columns:"+ TotalColumns.size());
		System.out.println("=======================================");
		List<WebElement> TotalData = driver.findElements(By.xpath("//table[contains(@id,'cust')]//td"));
		System.out.println("total no of Data:"+ TotalData.size());
		System.out.println("=======================================");
		List<WebElement> lastrowdata = driver.findElements(By.xpath("//table[contains(@id,'cust')]//tr[7]"));
		System.out.println("total no of Data:"+ lastrowdata.size());
		for(WebElement ele:lastrowdata) {
			String value = ele.getText();
			System.out.println(value);
		}
		System.out.println("=======================================");
		WebElement SpecificCellValue = driver.findElement(By.xpath("//td[text()='Bhavish Aggarwal']//preceding::td[1]"));
		System.out.println("total no of rows:"+ SpecificCellValue.getText());
		System.out.println("=======================================");
		
		//How to retrieve more than one column 
		
		/* int row = 0;
		 for (int i = 1; i <= row.size(); i++) {

			 int noOfColumns = 3;
			for (int j = 1; j <= noOfColumns; j++) {

			    String xpathString = null;
				System.out.print(
			      driver.findElement(By.xpath(""+xpathString+"/tbody/tr[" + i + "]/td[" + j + "]")).getText()
			        + "   ");
			   }
			   System.out.println();
			  }
			  System.out.println("===================================================");*/
		
		
		//how to fetch particular cell va;lue using custom method
		
	/*	System.out.println(getColValue(5, 4));
		
	}

	private String getColValue(int row, int col) {
		By driver = null;
		String xpathString = null;
		WebElement colValue = driver
			    .findElement((SearchContext) By.xpath(""+xpathString+"/tbody/tr[" + row + "]/td[" + col + "]"));
			  return colValue.getText();
			  		System.out.println("=======================================");
	 		*/	
		driver.close();
	
	}
	}
