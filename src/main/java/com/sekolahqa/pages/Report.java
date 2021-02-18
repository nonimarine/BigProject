package com.sekolahqa.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Report extends BasePage {
    private static By menuBarPIM = new By.ByXPath("//a[@id='menu_pim_viewPimModule']");
    private By reportMenu = new By.ByXPath("//a[@id='menu_core_viewDefinedPredefinedReports']");
    private By nameReportfield = new By.ByXPath("//input[@id='search_search']");
    private By chooseNameReport = new By.ByXPath("//body/div[4]/ul[1]/li[1]");
    private By searchBtnReport = new By.ByCssSelector("div.box.toggableForm:nth-child(1) div.inner form:nth-child(1) fieldset:nth-child(1) p:nth-child(2) > input.searchBtn");
    private By clickList = new By.ByXPath("//a[contains(text(),'Run')]");
    Faker faker = new Faker();

    public Report(WebDriver driver) {
        super(driver);
    }

    public void setMenuBarPIM() throws InterruptedException {
        clickButton(menuBarPIM);
    }

    public void setReportMenu() throws InterruptedException {
        clickButton(reportMenu);
    }

    public void setNameReportfield(String name) throws InterruptedException {
        inputText(nameReportfield, name);
    }

}
