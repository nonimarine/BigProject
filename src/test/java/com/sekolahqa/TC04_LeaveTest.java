package com.sekolahqa;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Leave;
import com.sekolahqa.testData.LoginDataTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TC04_LeaveTest {
    WebDriver driver = Utils.getDriver();
    private LoginDataTest loginDataTest = new LoginDataTest(driver);

    public TC04_LeaveTest() throws IOException {
    }

    @Test
    public void assignLeave() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWindow();
        loginDataTest.userLoginWithValidEmailAndPassword("Azucena.dicki", "haloTest1234><");
        Leave leave = new Leave(driver);
        leave.setMenuBarLeave();
        Thread.sleep(100);
        leave.setApplyLeave();
        Thread.sleep(100);
        leave.setLeaveType("Cuti");
        Thread.sleep(100);
        leave.setFromDate();
        Thread.sleep(100);
        leave.setSelectFromDate();
        Thread.sleep(100);
        leave.setEndDate();
        Thread.sleep(100);
        leave.setSelectEndDate();
        Thread.sleep(1000);
        leave.setPartialDays();
        Thread.sleep(1000);
        leave.setCommentLeave("Approved By Manager");
        Thread.sleep(100);
        leave.setApplyBtn();
        Thread.sleep(100);

    }

    @Test
    public void searchLeaveList() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWindow();
        loginDataTest.userLoginWithValidEmailAndPassword("Admin", "s3Kol4HQA!*");
        Leave leave = new Leave(driver);
        leave.setMenuBarLeave();
        Thread.sleep(100);
        leave.setLeaveList();
        Thread.sleep(100);
        leave.setEmployeeName("Kijang");
        Thread.sleep(100);
        leave.setChooseName();
        Thread.sleep(100);
        leave.setSearchBtn();
        Thread.sleep(100);
    }
}
