package com.sekolahqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//ini Adalah object untuk login, jadi nanti di test case tinggal panggil aja

public class Login extends BasePage {
    private By fieldEmail = new By.ByXPath("//input[@id='txtUsername']");
    private By fieldPassword = new By.ByXPath("//input[@id='txtPassword']");
    private By btnLogin = new By.ByXPath("//input[@id='btnLogin']");
    private By welcomeMenu = new By.ByXPath("//a[@id='welcome']");
    private By btnLogout = new By.ByXPath("//a[contains(text(),'Logout')]");

    public Login(WebDriver driver) {
        super(driver);
    }

    //ini untuk tulis action2nya gitu sih kayaknya tapi misal ini untuk halaman login aja

    public void inputEmail(String email) throws InterruptedException {
        inputText(fieldEmail, email);
    }

    public void inputPassword(String password) throws InterruptedException {
        inputText(fieldPassword, password);
    }

    public void loginButton() throws InterruptedException {
        clickButton(btnLogin);
    }

    public void setWelcomeMenu() throws InterruptedException {
        clickButton(welcomeMenu);
    }

    public void logoutButton() throws InterruptedException {
        clickButton(btnLogout);
    }

}
