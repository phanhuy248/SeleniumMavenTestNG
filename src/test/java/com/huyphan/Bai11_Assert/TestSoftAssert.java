package com.huyphan.Bai11_Assert;

import com.huyphan.common.BaseTest;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class TestSoftAssert extends BaseTest {

    @Test(priority = 1)
    public void testSoftAssert() throws InterruptedException {

        driver.get("https://anhtester.com");

        SoftAssert softassert = new SoftAssert();

        String expectedTitle = "Anh Tester";
        String actualTitle = driver.getTitle();

        System.out.println("*** Checking For The First Title ***");

        softassert.assertEquals(actualTitle, expectedTitle,"Tên tiêu đề không đúng");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='btn-login']")).click();
        String actualLoginTitle = driver.getTitle();

        System.out.println("*** Checking For The Second Title ***");

        softassert.assertEquals(actualLoginTitle, "Anh Tester - Automation Testing","Tên tiêu đề đăng nhập không đúng");

        softassert.assertAll();
    }
}
