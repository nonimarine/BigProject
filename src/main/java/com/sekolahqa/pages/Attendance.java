package com.sekolahqa.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class Attendance extends BasePage {
        private static By menuBarTime = new By.ByXPath("//b[contains(text(),'Time')]");
        private By attendanceMenu = new By.ByXPath("//a[@id='menu_attendance_Attendance']");
        private By punchIn = new By.ByXPath("//a[@id='menu_attendance_punchIn']");
        private By inputNote = new By.ByXPath("//textarea[@id='note']");
        private By btnAttendance = new By.ByXPath("//input[@id='btnPunch']");

        public Attendance(WebDriver driver) {
            super(driver);
        }

        Faker faker = new Faker();

        public void setMenuBarTime() throws InterruptedException {
            clickButton(menuBarTime);
        }

        public void setAttendanceMenu() throws InterruptedException {
            clickButton(attendanceMenu);
        }

        public void setPunchIn() throws InterruptedException {
            clickButton(punchIn);
        }

        public void setInputNote() throws InterruptedException {
            inputText(inputNote, faker.hipster().word());
        }

        public void setBtnAttendance() throws InterruptedException {
            clickButton(btnAttendance);
        }

}
