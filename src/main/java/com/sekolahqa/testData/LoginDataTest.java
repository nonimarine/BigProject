package com.sekolahqa.testData;

import com.sekolahqa.pages.Login;
import org.openqa.selenium.WebDriver;

//nahh daripada pas masuk laman lain malah harus login ulang, jd simpan disini yaaaaa. ambil dari object login

public class LoginDataTest {

    private Login login;

    public LoginDataTest(WebDriver driver) {
        login=new Login(driver);
    }

    public void userLoginWithValidEmailAndPassword(String email, String password) throws InterruptedException {
        login.inputEmail(email);
        login.inputPassword(password);
        login.loginButton();
    }

}
