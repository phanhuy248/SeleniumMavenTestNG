package com.huyphan.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    public WebDriver driver;
    public SoftAssert softAssert;
    @BeforeMethod
    public void createDriver(){
        System.out.println("KHởi động trình duyệt Chrome");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        softAssert = new SoftAssert();

    }
    @AfterMethod
    public void closeDriver(){
        if (driver != null) {
            System.out.println("Đóng trình duyệt Chrome");
            driver.quit();
            softAssert.assertAll();

        }
    }
}
