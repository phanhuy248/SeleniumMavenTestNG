package com.huyphan.Bai10_Annotations;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BTWebElement   {
    public static WebDriver driver;
    public static void bTWebElement(String customer) throws InterruptedException {

        driver.findElement(By.xpath(LocatorCRM.menuCustomers)).click();
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
//        String xpathOptionLanguage = String.format("//span[normalize-space()='%s']", "Vietnamese");
//        System.out.println(xpathOptionLanguage);
//        driver.findElement(By.xpath(xpathOptionLanguage)).click();
        //driver.findElement(By.xpath(LocatorCRM.optionLanguage)).click();
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

        Thread.sleep(2000);
    }

    public static void SearchCustomerName(String customerName) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorCRM.menuCustomers)).click();
        driver.findElement(By.xpath(LocatorCRM.searchClients)).sendKeys(customerName);
        Thread.sleep(2000);
        String firstRowCustomer = driver.findElement(By.xpath(LocatorCRM.firstRowItemCustomer)).getText();
        System.out.println("First row customer: " + firstRowCustomer);
        Thread.sleep(2000);

    }

    public static void bTWebElement2() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorCRM.menuProjects)).click();
        driver.findElement(By.xpath(LocatorCRM.buttonNewProject)).click();
        driver.findElement(By.xpath(LocatorCRM.inputProjectName)).sendKeys("Project 1");
        System.out.println("Project Name of Size: " + driver.findElement(By.xpath(LocatorCRM.inputProjectName)).getSize());
        System.out.println("Project Name of Location: " + driver.findElement(By.xpath(LocatorCRM.inputProjectName)).getLocation());
        driver.findElement(By.xpath(LocatorCRM.dropdownCustomer)).click();
        driver.findElement(By.xpath(LocatorCRM.inputSearchCustomer)).sendKeys("Anh Tester 20012026");
        driver.findElement(By.xpath("//span[normalize-space()='Anh Tester 20012026']")).click();
        Actions actions = new Actions(driver);
        boolean check = driver.findElement(By.xpath(LocatorCRM.dropdownCustomer)).isDisplayed();
        System.out.println(check);
        driver.findElement(By.xpath(LocatorCRM.nav)).click();
        boolean check1 = driver.findElement(By.xpath(LocatorCRM.nav)).isSelected();
        System.out.println(check1);
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorCRM.nav)).click();
        boolean check2 = driver.findElement(By.xpath(LocatorCRM.nav)).isSelected();
        System.out.println(check2);
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorCRM.dropdownBillingType)).click();
        driver.findElement(By.xpath("//span[normalize-space()='Project Hours']")).click();
        driver.findElement(By.xpath(LocatorCRM.dropdownStatus)).click();
        driver.findElement(By.xpath("//span[normalize-space()='In Progress']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorCRM.inputRatePerHour)).sendKeys("11");
        driver.findElement(By.xpath(LocatorCRM.inputEstimatedHours)).sendKeys("12");
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorCRM.dropdownMembers)).click();
        driver.findElement(By.xpath(LocatorCRM.inputSearchMembers)).sendKeys("Project Manager");
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorCRM.dropdownMembers)).click();
        driver.findElement(By.xpath(LocatorCRM.inputStartDate)).sendKeys("12-12-1978");
        driver.findElement(By.xpath(LocatorCRM.inputStartDate)).click();
        driver.findElement(By.xpath(LocatorCRM.inputDeadline)).sendKeys("12-12-2023");

        driver.findElement(By.xpath(LocatorCRM.inputTags)).sendKeys("Tag 1");
        Thread.sleep(2000);

    }

    public static void main(String[] args) throws InterruptedException {

        driver.findElement(By.xpath(LocatorCRM.menuCustomers)).click();
        int customerTotal = Integer.parseInt(driver.findElement(By.xpath(LocatorCRM.labelNumberTotalCustomers)).getText());
        System.out.println("Total customers: " + customerTotal);
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
        String formatted = now.format(formatter);
        bTWebElement("CRM1" + formatted);
        SearchCustomerName("CRM1" + formatted);
        int customerTotalAfterAddNewCustomer = Integer.parseInt(driver.findElement(By.xpath(LocatorCRM.labelNumberTotalCustomers)).getText());
        System.out.println("Total customers After: " + customerTotalAfterAddNewCustomer);
    }
}
