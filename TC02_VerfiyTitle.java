package com.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC02_VerfiyTitle {
	
	public static void main(String[] args) throws Exception {
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        
     // launch Chrome driver  and direct it to the Base URL
        
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseUrl);
		
		 // get the actual value of the title
        actualTitle = driver.getTitle();
        
        WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Selenium')])[2]"));
        File elemScreenshot = element.getScreenshotAs(OutputType.FILE);
        File DestFile=new File("elementScreenshot.png");

        //Copy file at destination

        FileUtils.copyFile(elemScreenshot, DestFile);

        takeSnapShot(driver, "src/test/resources/screenshot.png");
        
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        
        driver.close();
        driver.quit();
		
	}
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }


}
