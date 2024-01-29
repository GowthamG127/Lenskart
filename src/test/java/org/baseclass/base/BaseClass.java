package org.baseclass.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
						
	
					public static WebDriver d ;
					
					public static void  launchBrowser() {
						WebDriverManager.chromedriver().setup();
						 d = new ChromeDriver();
						
					}
					
					public static void maximizeBrowser() {
						d.manage().window().maximize();
					}
					
					public static void launchUrl(String url) {
						d.get(url);
					}
					
					public static void closeBrowser() {
						d.close();
						d.quit();
					}
					//To find Locators
					public static void userNameLocator(String username,String xpath) {
						WebElement userName = d.findElement(By.xpath(xpath));
						userName.sendKeys(username);
					}
					public static void passwordLocator(String password,String xpath) {
						WebElement passWord =d.findElement(By.xpath(xpath));
						passWord.sendKeys(password);
					}
					
					public static void searchBox(String text,String xpath) {
						WebElement box = d.findElement(By.xpath(xpath));
						box.sendKeys(text);
					}	
					public static void enterBtn() throws AWTException {
						Robot r = new Robot();
						r.keyPress(KeyEvent.VK_ENTER);
						r.keyRelease(KeyEvent.VK_ENTER);
					}
					

public static void passText(String text,WebElement element) {
	 passText(text, element);
}

//For performing mouse actions

 public static Actions a;

public static void moveCursor(WebElement element) {
	a = new Actions(d);
	a.moveToElement(element).perform();
}

public static void clickOnMouse(WebElement element) {
	a = new Actions(d);
	 a.click(element).perform();
}

// scroll down


  public static JavascriptExecutor js;
  
  public static void scrollDown(WebElement element) {
	  js =(JavascriptExecutor)d;
  js.executeScript("arguments[0].scrollIntoView(true)", element); 
  }
 
//For pushing data to the excel sheet
			
			//create new Excel file

public static void createNewExcel(int newRow,int newCell,String writeData) throws IOException {
	 
	 File f = new File("/home/gowtham/eclipse-workspace/Cars24/Car Safety detail/SafetyComparison.xlsx");
	 Workbook wb = new XSSFWorkbook();
	 Sheet sheet1 = wb.createSheet("Comparison");
	 Row row = sheet1.createRow(newRow);
	 Cell cell = row.createCell(newCell);
	 cell.setCellValue(writeData);
	 FileOutputStream fos = new FileOutputStream(f);
	 wb.write(fos);
}

//create new cell

public static void createNewCell(int getrow,int crtCell,String writeData) throws IOException {
	 File f = new File("/home/gowtham/eclipse-workspace/Cars24/Car Safety detail/SafetyComparison.xlsx");
	 FileInputStream fis = new FileInputStream(f);
	 Workbook wb = new XSSFWorkbook(fis);
	 Sheet sheet1 = wb.getSheet("Comparison");
	 Row row = sheet1.getRow(getrow);
	 Cell cell = row.createCell(crtCell);
	 cell.setCellValue(writeData);
	 FileOutputStream fos = new FileOutputStream(f);
	 wb.write(fos);
}

//create new Row

public static void createNewRow(int crteRow,int crteCell,String writeData) throws IOException {
	 File f = new File("/home/gowtham/eclipse-workspace/Cars24/Car Safety detail/SafetyComparison.xlsx");
	 FileInputStream fis = new FileInputStream(f);
	 Workbook wb = new XSSFWorkbook(fis);
	 Sheet sheet1 = wb.getSheet("Comparison");
	 Row row = sheet1.createRow(crteRow);
	 Cell cell = row.createCell(crteCell);
	 cell.setCellValue(writeData);
	 FileOutputStream fos = new FileOutputStream(f);
	 wb.write(fos);
}
					
}
