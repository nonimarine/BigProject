package com.sekolahqa;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Report;
import com.sekolahqa.testData.LoginDataTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TC05_EmployeeReport {
    WebDriver driver = Utils.getDriver();
    private LoginDataTest loginDataTest = new LoginDataTest(driver);

    public TC05_EmployeeReport() throws IOException {
    }

    @Test
    public void employeeCreateReport() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWindow();

    }
        @Test
        public void employeeShowReport() throws InterruptedException, IOException {
            Utils.openWebsite(Utils.getUrl());
            Utils.maximizeWindow();
            loginDataTest.userLoginWithValidEmailAndPassword("Admin", "s3Kol4HQA!*");
            Report report = new Report(driver);
            Thread.sleep(100);
            report.setMenuBarPIM();
            Thread.sleep(100);
            report.setReportMenu();
            Thread.sleep(100);
            report.setNameReportfield("D");
            Thread.sleep(100);
        }
    }