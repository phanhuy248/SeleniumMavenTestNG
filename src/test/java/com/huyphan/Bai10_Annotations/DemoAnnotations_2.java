package com.huyphan.Bai10_Annotations;

import org.testng.annotations.*;

public class DemoAnnotations_2 {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Call API truoc khi test");
        System.out.println("BeforeClass 2 Chạy trước tất cả các test trong class này");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass Chạy sau tất cả các test trong class này");
    }
    @Test
    public void testLoginSuccess() {
        System.out.println("Thực hiện test login - Success");
    }

    @Test
    public void testLoginFailed() {
        System.out.println("Thực hiện test login - failed");
    }
}
