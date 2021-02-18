package com.sekolahqa.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class DataPersonal extends BasePage {
        private static By menuBarPIM = new By.ByXPath("//a[@id='menu_pim_viewPimModule']");
        private By addEmployee = new By.ByXPath("//a[@id='menu_pim_addEmployee']");
        private By inputFirstName = new By.ByXPath("//input[@id='firstName']");
        private By inputMiddleName = new By.ByXPath("//input[@id='middleName']");
        private By inputLastName = new By.ByXPath("//input[@id='lastName']");
        private By checkButton = new By.ByXPath("//input[@id='chkLogin']");
        private By inputUsername = new By.ByXPath("//input[@id='user_name']");
        private By inputPassword = new By.ByXPath("//input[@id='user_password']");
        private By inputConfirmPassword = new By.ByXPath("//input[@id='re_password']");
        private By selectStatus = new By.ByXPath("//select[@id='status']");
        private By btnSave = new By.ByXPath("//input[@id='btnSave']");
        private By btnEdit = new By.ByXPath("//input[@id='btnSave']");
        private By employeeList = new By.ByXPath("//a[@id='menu_pim_viewEmployeeList']");
        private By employeeName = new By.ByXPath("//input[@id='empsearch_employee_name_empName']");
        private By chooseName = new By.ByXPath("//body/div[4]/ul[1]/li[1]");
        private By btnSearch = new By.ByXPath("//input[@id='searchBtn']");
        private By chooseListName = new By.ByXPath("//a[contains(text(),'27')]");
        private By inputDriverLN = new By.ByXPath("//input[@id='personal_txtLicenNo']");
        private By inputSSNNumber = new By.ByXPath("//input[@id='personal_txtNICNo']");
        private By inputSinNumber = new By.ByXPath("//input[@id='personal_txtSINNo']");
        private By gender = new By.ByXPath("//input[@id='personal_optGender_2']");
        private By nickName  = new By.ByXPath("//input[@id='personal_txtEmpNickName']");
        private By reportMenu = new By.ByXPath("//a[@id='menu_core_viewDefinedPredefinedReports']");
        private By nameReportfield = new By.ByXPath("//input[@id='search_search']");
        private By chooseNameReport = new By.ByXPath("//body/div[4]/ul[1]/li[1]");
        private By searchBtnReport = new By.ByCssSelector("div.box.toggableForm:nth-child(1) div.inner form:nth-child(1) fieldset:nth-child(1) p:nth-child(2) > input.searchBtn");
        private By clickList = new By.ByXPath("//a[contains(text(),'Run')]");
        Faker faker = new Faker();

        public DataPersonal(WebDriver driver) {
            super(driver);
        }

        public void setMenuBarPIM() throws InterruptedException {
            clickButton(menuBarPIM);
        }

        public void setAddEmployee() throws InterruptedException {
            clickButton(addEmployee);
        }

        public void setInputFirstName() throws InterruptedException {
            inputText(inputFirstName, faker.name().firstName());
        }

        public void setInputMiddleName() throws InterruptedException {
            inputText(inputMiddleName, faker.name().firstName());
        }

        public void setInputLastName() throws InterruptedException {
            inputText(inputLastName, faker.name().lastName());
        }

        public void setCheckButton() throws InterruptedException {
            clickButton(checkButton);
        }

        public void setUsername() throws InterruptedException {
            inputText(inputUsername, faker.name().username());
        }

        public void setInputPassword(String password) throws InterruptedException {
            inputText(inputPassword, password);
        }

        public void setInputConfirmPassword(String confirmPassword) throws InterruptedException {
            inputText(inputConfirmPassword, confirmPassword);
        }

        public void setSelectStatus() throws InterruptedException {
            clickButton(selectStatus);
        }

        public void setBtnSave() throws InterruptedException {
            clickButton(btnSave);
        }

        public void setBtnEdit() throws InterruptedException {
            clickButton(btnEdit);
        }

        public void setEmployeeList() throws InterruptedException {
            clickButton(employeeList);
        }

        public void setEmployeeName(String name) throws InterruptedException {
            inputText(employeeName, name);
        }

        public void setChooseName() throws InterruptedException {
            clickButton(chooseName);
        }

        public void setBtnSearch() throws InterruptedException {
            clickButton(btnSearch);
        }

        public void setChooseListName() throws InterruptedException {
            clickButton(chooseListName);
        }

        public void setInputDriverLN() throws InterruptedException {
            inputText(inputDriverLN, faker.internet().uuid());
        }

        public void setInputSSNNumber() throws InterruptedException {
            inputText(inputSSNNumber, faker.internet().uuid());
        }

        public void setGender() throws InterruptedException {
            clickButton(gender);
        }

        public void setNickName() throws InterruptedException {
            inputText(nickName, faker.name().firstName());
        }

        public void setReportMenu() throws InterruptedException {
            clickButton(reportMenu);
        }

        public void setNameReportfield(String name) throws InterruptedException {
            inputText(nameReportfield, name);
        }

        public void setChooseNameReport() throws InterruptedException {
            clickButton(chooseNameReport);
        }

        public void setSearchBtnReport() throws InterruptedException {
            clickButton(searchBtnReport);
        }

        public void setClickList() throws InterruptedException {
            clickButton(clickList);
        }

        }
