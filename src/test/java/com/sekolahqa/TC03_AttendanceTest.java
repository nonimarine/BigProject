package com.sekolahqa;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Attendance;
import com.sekolahqa.testData.LoginDataTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TC03_AttendanceTest {
    WebDriver driver = Utils.getDriver();
    private LoginDataTest loginDataTest = new LoginDataTest(driver); //bikin kayak gini ambil data dari testData

    public TC03_AttendanceTest() throws IOException {
    }

    @Test
    public void employeePunchIn() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWindow();
        loginDataTest.userLoginWithValidEmailAndPassword("Admin", "s3Kol4HQA!*");
        Attendance attendance = new Attendance(driver);
        attendance.setMenuBarTime();
        Thread.sleep(100);
        attendance.setAttendanceMenu();
        Thread.sleep(100);
        attendance.setPunchIn();
        Thread.sleep(100);
        attendance.setInputNote();
        Thread.sleep(100);
        attendance.setBtnAttendance();
    }

    @Test
    public void employeePunchOut() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWindow();
        loginDataTest.userLoginWithValidEmailAndPassword("Admin", "s3Kol4HQA!*");
        Attendance attendance = new Attendance(driver);
        attendance.setMenuBarTime();
        Thread.sleep(100);
        attendance.setAttendanceMenu();
        Thread.sleep(100);
        attendance.setPunchIn();
        Thread.sleep(100);
        attendance.setInputNote();
        Thread.sleep(100);
        attendance.setBtnAttendance();
    }
}
