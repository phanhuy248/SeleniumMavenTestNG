package com.huyphan.Bai10_Annotations;

import org.testng.annotations.*;

public class DemoAnnotations {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Chạy trước toàn bộ suite");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("Chạy sau toàn bộ suite");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("Call database laasy field duwx lieu truoc khi test");
        System.out.println("Chạy trước tất cả các test trong một thẻ <test>");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("Chạy sau tất cả các test trong một thẻ <test>");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("Chạy trước tất cả các test trong class này");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("Chạy sau tất cả các test trong class này");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Chạy trước mỗi phương thức test");
        System.out.println("Mo trinh duyet truoc moi test");
    }
    @Test
    public void testLoginSuccessWithEmail() {
        System.out.println("Thực hiện test login - Success");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("Chạy sau mỗi phương thức test");
        System.out.println("Chup man hinh va ghi log sau khi test");
        System.out.println("Dong trinh duyet sau khi test");
    }

    @Test
    public void testLoginFailedWithEmail() {
        System.out.println("Thực hiện test login - failed");
    }
    @BeforeGroups("login")
    public void beforeGroupLogin() {
        System.out.println("Call API truoc khi test");
        System.out.println("Chạy trước tất cả các test thuộc nhóm Login");
    }
    @Test(groups = "login")
    public void testLoginSuccessWithPassword() {
        System.out.println("Thực hiện test login - Success");
    }
    @Test
    public void testLoginFailedWithPassword() {
        System.out.println("Thực hiện test login - failed");
    }

}
