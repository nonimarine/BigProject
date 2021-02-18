package com.sekolahqa;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Login;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TC01_LoginTest {
    WebDriver driver = Utils.getDriver();

    public TC01_LoginTest() throws IOException {
    }

    @Test
    public void userAdminSuccessfulLoginWithValidUsernameAndPassword() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWindow();
        Login login = new Login(driver);
        login.inputEmail("Admin");
        login.inputPassword("s3Kol4HQA!*");
        login.loginButton();
        login.setWelcomeMenu();
        Thread.sleep(100);
        login.logoutButton();
    }

    @Test
    public void userAdminFailedLoginWithInvalidUsernameAndValidPassword() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWindow();
        Login login = new Login(driver);
        login.inputEmail("haloha");
        login.inputPassword("s3Kol4HQA!*");
        login.loginButton();
    }

    @Test
    public void userAdminFailedLoginWithValidUsernameAndInvalidPassword() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWindow();
        Login login = new Login(driver);
        login.inputEmail("Admin");
        login.inputPassword("1234567");
        login.loginButton();
    }

    @Test
    public void userAdminFailedLoginWithInvalidUsernameAndInvalidPassword() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWindow();
        Login login = new Login(driver);
        login.inputEmail("haloha");
        login.inputPassword("123456");
        login.loginButton();
    }

    @Test
    public void newEmployeeSuccessfulLoginWithValidUsernameAndPassword() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWindow();
        Login login = new Login(driver);
        login.inputEmail("Azucena.dicki");
        login.inputPassword("haloTest1234><");
        login.loginButton();
        Thread.sleep(100);
        login.setWelcomeMenu();
        Thread.sleep(100);
        login.logoutButton();
    }

    @Test
    public void newEmployeeFailedLoginWithInvalidUsernameAndValidPassword() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWindow();
        Login login = new Login(driver);
        login.inputEmail("haloha");
        login.inputPassword("haloTest1234><");
        login.loginButton();
    }

    @Test
    public void newEmployeeFailedLoginWithValidUsernameAndInvalidPassword() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWindow();
        Login login = new Login(driver);
        login.inputEmail("Azucena.dicki");
        login.inputPassword("1234567");
        login.loginButton();
    }

    @Test
    public void newEmployeeFailedLoginWithInvalidUsernameAndInvalidPassword() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWindow();
        Login login = new Login(driver);
        login.inputEmail("haloha");
        login.inputPassword("123456");
        login.loginButton();
    }
}
