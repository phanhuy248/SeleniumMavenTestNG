package com.huyphan.Bai11_Assert;

import com.huyphan.Bai10_Annotations.LocatorCRM;
import com.huyphan.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestHardAndSoftAssert extends BaseTest {
    @Test
    public void addNewCustomer() throws InterruptedException {
        String customer = "Huy";
        driver.get(LocatorCRM.url);
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorCRM.inputPass)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorCRM.clickLogin)).click();
        Thread.sleep(2000);

        // Verify login success
        List<WebElement> checkMenuDashboard = driver.findElements(By.xpath(LocatorCRM.menuDashboard));
        System.out.println("Size: " + checkMenuDashboard.size());
        Assert.assertFalse(checkMenuDashboard.isEmpty(), "Menu Dashboard is not display");

        // Navigate to Customers and add new customer
        driver.findElement(By.xpath(LocatorCRM.menuCustomers)).click();

        // Check customer list is displayed
        List<WebElement> checkCustomerPage = driver.findElements(By.xpath(LocatorCRM.headerCustomerSummary));
        System.out.println("Size: " + checkCustomerPage.size());
        softAssert.assertFalse(checkMenuDashboard.isEmpty(), "Customer Page is not displayed");
        String headerCustomerSummary = driver.findElement(By.xpath(LocatorCRM.headerCustomerSummary)).getText();
        softAssert.assertEquals(headerCustomerSummary, "Customers Summary1", "Header is not correct");


        driver.findElement(By.xpath(LocatorCRM.buttonNewCustomer)).click();
        driver.findElement(By.xpath(LocatorCRM.inputCompany)).sendKeys(customer);
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
        List<WebElement> checkRequiredCompany = driver.findElements(By.xpath("//p[@id='company-error']"));
        Assert.assertEquals(checkRequiredCompany.size(), 1, "Required company error message is not displayed");

//        System.out.println("Thêm thành công khách hàng: " + customer);
        Thread.sleep(2000);

    }
}
