package com.huyphan.Bai10_Annotations.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest_BeforeClass {
    public WebDriver driver;
    @BeforeClass
    public void createDriver(){
        System.out.println("KHởi động trình duyệt Chrome");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

    }
    @AfterClass
    public void closeDriver(){
        if (driver != null) {
            System.out.println("Đóng trình duyệt Chrome");
            driver.quit();
        }
    }
}
