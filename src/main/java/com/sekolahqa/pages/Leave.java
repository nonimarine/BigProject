package com.sekolahqa.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Leave extends BasePage {
    private static By menuBarLeave = new By.ByXPath("//b[contains(text(),'Leave')]");
    private By assignLeaveMenu = new By.ByXPath("//a[@id='menu_leave_assignLeave']");
    private By employeeName = new By.ByXPath("//input[@id='assignleave_txtEmployee_empName']");
    private By chooseName = new By.ByXPath("//body/div[6]/ul[1]/li[1]");
    private By selectReason = new By.ByXPath("//select[@id='assignleave_txtLeaveType']");
    private By leaveList = new By.ByXPath("//a[@id='menu_leave_viewLeaveList']");
    private By searchBtn = new By.ByXPath("//input[@id='btnSearch']");
    private By fromDate = new By.ByXPath("//body/div[@id='wrapper']/div[@id='content']/div[@id='apply-leave']/div[2]/form[1]/fieldset[1]/ol[1]/li[3]/img[1]");
    private By selectFromDate = new By.ByXPath("//a[contains(text(),'22')]");
    private By endDate = new By.ByXPath("//body/div[@id='wrapper']/div[@id='content']/div[@id='apply-leave']/div[2]/form[1]/fieldset[1]/ol[1]/li[4]/img[1]");
    private By selectEndDate = new By.ByXPath("//a[contains(text(),'23')]");
    private By partialDays = new By.ByXPath("//select[@id='assignleave_partialDays']");
    private By commentLeave = new By.ByXPath("//textarea[@id='applyleave_txtComment']']");
    private By applyBtn = new By.ByXPath("//input[@id='applyBtn']");
    private By applyLeave = new By.ByXPath("//a[@id='menu_leave_applyLeave']");
    private By leaveType = new By.ByXPath("//select[@id='applyleave_txtLeaveType']");

    public Leave(WebDriver driver) {
        super(driver);
    }

    Faker faker = new Faker();

    public void setMenuBarLeave() throws InterruptedException {
        clickButton(menuBarLeave);
    }

    public void setAssignLeaveMenu() throws InterruptedException {
        clickButton(assignLeaveMenu);
    }

    public void setEmployeeName(String name) throws InterruptedException {
        inputText(employeeName, name);
    }

    public void setChooseName() throws InterruptedException {
        clickButton(chooseName);
    }

    public void setLeaveList() throws InterruptedException {
        clickButton(leaveList);
    }

    public void setSearchBtn() throws InterruptedException {
        clickButton(searchBtn);
    }

    public void setSelectReason(String reason) throws InterruptedException {
        inputText(selectReason, reason);
    }

    public void setFromDate() throws InterruptedException {
        clickButton(fromDate);
    }

    public void setSelectFromDate() throws InterruptedException {
        clickButton(selectFromDate);
    }

    public void setEndDate() throws InterruptedException {
        clickButton(endDate);
    }

    public void setSelectEndDate() throws InterruptedException {
        clickButton(selectEndDate);
    }

    public void setPartialDays() throws InterruptedException {
        clickButton(partialDays);
    }

    public void setCommentLeave(String comment) throws InterruptedException {
        inputText(commentLeave, comment);
    }

    public void setApplyBtn() throws InterruptedException {
        clickButton(applyBtn);
    }

    public void setApplyLeave() throws InterruptedException {
        clickButton(applyLeave);
    }
    public void setLeaveType(String leave) throws InterruptedException {
        inputText(leaveType, leave);
    }
}
