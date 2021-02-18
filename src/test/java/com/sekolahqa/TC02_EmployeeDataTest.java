package com.sekolahqa;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.DataPersonal;
import com.sekolahqa.testData.LoginDataTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TC02_EmployeeDataTest {
    WebDriver driver = Utils.getDriver();
    private LoginDataTest loginDataTest=new LoginDataTest(driver);

    public TC02_EmployeeDataTest() throws IOException {
    }

    @Test
    public void addEmployeeSuccess() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWindow();
        loginDataTest.userLoginWithValidEmailAndPassword("Admin", "s3Kol4HQA!*");
        DataPersonal dataPersonal = new DataPersonal(driver);
        Thread.sleep(100);
        dataPersonal.setMenuBarPIM();
        Thread.sleep(100);
        dataPersonal.setAddEmployee();
        Thread.sleep(100);
        dataPersonal.setInputFirstName();
        Thread.sleep(100);
        dataPersonal.setInputMiddleName();
        Thread.sleep(100);
        dataPersonal.setInputLastName();
        Thread.sleep(100);
        dataPersonal.setCheckButton();
        Thread.sleep(100);
        dataPersonal.setUsername();
        Thread.sleep(100);
        dataPersonal.setInputPassword("haloTest1234><");
        Thread.sleep(100);
        dataPersonal.setInputConfirmPassword("haloTest1234><");
        Thread.sleep(100);
        dataPersonal.setSelectStatus();
        Thread.sleep(100);
        dataPersonal.setBtnSave();
        Thread.sleep(100);
    }

    @Test
    public void addEmployeeFailed() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWindow();
        loginDataTest.userLoginWithValidEmailAndPassword("Admin", "s3Kol4HQA!*");
        DataPersonal dataPersonal = new DataPersonal(driver);
        Thread.sleep(100);
        dataPersonal.setMenuBarPIM();
        Thread.sleep(100);
        dataPersonal.setAddEmployee();
        Thread.sleep(100);
        dataPersonal.setInputFirstName();
        Thread.sleep(100);
        dataPersonal.setInputMiddleName();
        Thread.sleep(100);
        dataPersonal.setInputLastName();
        Thread.sleep(100);
        dataPersonal.setCheckButton();
        Thread.sleep(100);
        dataPersonal.setUsername();
        Thread.sleep(100);
        dataPersonal.setInputPassword("haloTest1234><");
        Thread.sleep(100);
        dataPersonal.setInputConfirmPassword("haloha><");
        Thread.sleep(100);
        dataPersonal.setSelectStatus();
        Thread.sleep(100);
        dataPersonal.setBtnSave();
        Thread.sleep(100);
    }

    @Test
    public void editEmployeeList() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWindow();
        loginDataTest.userLoginWithValidEmailAndPassword("Admin", "s3Kol4HQA!*");
        DataPersonal dataPersonal = new DataPersonal(driver);
        Thread.sleep(100);
        dataPersonal.setMenuBarPIM();
        Thread.sleep(100);
        dataPersonal.setEmployeeName("Noni");
        Thread.sleep(100);
        dataPersonal.setChooseName();
        Thread.sleep(100);
        dataPersonal.setBtnSearch();
        Thread.sleep(1000);
        dataPersonal.setChooseListName();
        Thread.sleep(100);
        dataPersonal.setBtnEdit();
        Thread.sleep(100);
        dataPersonal.setInputDriverLN();
        Thread.sleep(100);
        dataPersonal.setInputSSNNumber();
        Thread.sleep(100);
        dataPersonal.setGender();
        Thread.sleep(100);
        dataPersonal.setNickName();
        Thread.sleep(100);
        dataPersonal.setBtnSave();
    }
}
