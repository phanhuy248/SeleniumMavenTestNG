package com.huyphan.Bai10_Annotations.testcases;

import com.huyphan.Bai10_Annotations.LocatorCRM;
import com.huyphan.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test(priority = 1)
    public void loginCRMSuccess() throws InterruptedException {
        System.out.println("Thực hiện test login CRM");
        driver.get(LocatorCRM.url);
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorCRM.inputPass)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorCRM.clickLogin)).click();
        Thread.sleep(2000);
        System.out.println("Đăng nhập CRM thành công");
    }
    @Test(priority = 2)
    public void loginCRMFailedWithEmailInvalid() throws InterruptedException {
        System.out.println("loginCRMFailedWithEmailInvalid");
        driver.get(LocatorCRM.url);
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorCRM.inputEmail)).sendKeys("admin1@example.com");
        driver.findElement(By.xpath(LocatorCRM.inputPass)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorCRM.clickLogin)).click();
        Thread.sleep(2000);
        System.out.println("Đăng nhập CRM không thành công");
    }
    @Test(priority = 3)
    public void addNewCustomer() throws InterruptedException {
        driver.get(LocatorCRM.url);
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorCRM.inputPass)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorCRM.clickLogin)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorCRM.menuCustomers)).click();
        driver.findElement(By.xpath(LocatorCRM.buttonNewCustomer)).click();
        driver.findElement(By.xpath(LocatorCRM.inputCompany)).sendKeys("customer");
        driver.findElement(By.xpath(LocatorCRM.inputVatNumber)).sendKeys("123456789");
        driver.findElement(By.xpath(LocatorCRM.inputPhone)).sendKeys("012345");
        driver.findElement(By.xpath(LocatorCRM.inputWebsite)).sendKeys("www.crm.com");
        driver.findElement(By.xpath(LocatorCRM.dropdownGroups)).click();
        driver.findElement(By.xpath(LocatorCRM.inputSearchGroup)).sendKeys("123");
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();
        driver.findElement(By.xpath(LocatorCRM.dropdownGroups)).click();
        driver.findElement(By.xpath(LocatorCRM.dropdownCurrency)).click();
        driver.findElement(By.xpath(LocatorCRM.inputSearchCurrency)).sendKeys("USD");
        Thread.sleep(2000);
        action.sendKeys(Keys.ENTER).perform();
        driver.findElement(By.xpath(LocatorCRM.dropdownCurrency)).click();
        driver.findElement(By.xpath(LocatorCRM.dropdownDefaultLanguage)).click();
        driver.findElement(By.xpath(LocatorCRM.selectXpathLanguage("German"))).click();
        driver.findElement(By.xpath(LocatorCRM.inputAddress)).sendKeys("123 Main St");
        driver.findElement(By.xpath(LocatorCRM.inputCity)).sendKeys("New York)");
        driver.findElement(By.xpath(LocatorCRM.inputState)).sendKeys("NY");
        driver.findElement(By.xpath(LocatorCRM.inputZipCode)).sendKeys("10001");
        driver.findElement(By.xpath(LocatorCRM.dropdownCountry)).click();
        driver.findElement(By.xpath(LocatorCRM.inputSearchCountry)).sendKeys("Albania");
        Thread.sleep(2000);
        action.sendKeys(Keys.ENTER).perform();
        driver.findElement(By.xpath(LocatorCRM.buttonSave)).click();
        Thread.sleep(2000);
    }
}
