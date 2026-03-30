package com.huyphan.Bai10_Annotations;

import org.testng.annotations.Test;

public class Demo_Priority {
    @Test(priority = 1)
    public void test_method_1() {
        System.out.println("Run test method 1");
    }
    @Test(priority = 2)  //độ ưu tiên đầu tiên -> chạy test_method_2() đầu tiên
    public void test_method_2() {
        System.out.println("Run test method 2");
    }
    @Test(priority = 3)
    public void test_method_3() {
        System.out.println("Run test method 3");
    }
}
