package com.huyphan.Bai13_Alert_PopupWindow_iFrame;

import com.huyphan.common.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAlertClass extends BaseTest {
    @Test
    public void testAlert() throws InterruptedException {
        driver.get("https://www.lambdatest.com/selenium-playground/javascript-alert-box-demo");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[text()='Click Me'])[1]")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//button[text()='Click Me'])[2]")).click();
        Alert alert1 = driver.switchTo().alert();
        System.out.println("Text in alert: " + alert1.getText());
        Thread.sleep(2000);
        alert1.dismiss();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//button[text()='Click Me'])[3]")).click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert2.sendKeys("Huy");
        Thread.sleep(2000);
        alert2.accept();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.xpath("//p[@id='prompt-demo']")).getText(),"You have entered 'Huy' !","Text is not correct");
        Thread.sleep(2000);

    }
}
