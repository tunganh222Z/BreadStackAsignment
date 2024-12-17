package com.ui.testcases;

import userInterface.actions.commons.BaseTest;
import userInterface.actions.commons.PageGenerator;
import userInterface.actions.pageObjects.HomePagePageObject;
import userInterface.actions.pageObjects.LoginPagePageObject;
import userInterface.actions.pageObjects.SecureAreaPageObject;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FormAuthentication extends BaseTest {
    private WebDriver driver;
    private HomePagePageObject homePagePage;
    private LoginPagePageObject loginPage;
    private SecureAreaPageObject secureAreaPage;
    private String userName, password, invalidUserName, invalidPassword;

    @Parameters({"browserName", "url"})
    @BeforeClass
    public void beforeClass(String browserName, String url) {
        userName = "tomsmith";
        password = "SuperSecretPassword!";

        invalidUserName = "TungAnh";
        invalidPassword = "123tunganh";

        driver = getBrowserDriver(browserName, url);

        homePagePage = PageGenerator.getHomePageObject(driver);

        loginPage = homePagePage.clickToFormAuthenticationLink();
    }

    @Test
    public void FA_01_LoginWithEmptyData() {
        loginPage.clickToLoginButton();

        Assert.assertEquals(loginPage.getNotifyMsg(), "Your username is invalid!");

        loginPage.clickToCloseNotifyMsg();
    }

    @Test
    public void FA_02_LoginWithEmptyPassword() {
        loginPage.enterToUserNameTextbox(userName);

        loginPage.clickToLoginButton();

        Assert.assertEquals(loginPage.getNotifyMsg(), "Your password is invalid!");

        loginPage.clickToCloseNotifyMsg();
    }

    @Test
    public void FA_03_LoginWithInvalidData() {
        loginPage.enterToUserNameTextbox(invalidUserName);

        loginPage.enterToPasswordTextbox(invalidPassword);

        loginPage.clickToLoginButton();

        Assert.assertEquals(loginPage.getNotifyMsg(), "Your username is invalid!");
    }

    @Test
    public void FA_04_LoginWithValidData() {
        loginPage.enterToUserNameTextbox(userName);

        loginPage.enterToPasswordTextbox(password);

        loginPage.clickToLoginButton();

        secureAreaPage = PageGenerator.getSecureAreaPageObject(driver);

        Assert.assertEquals(secureAreaPage.getNotifyMsg(), "You logged into a secure area!");

        secureAreaPage.clickToCloseNotifyMsg();

        loginPage = secureAreaPage.clickToLogOutButton();

        Assert.assertEquals(loginPage.getNotifyMsg(), "You logged out of the secure area!");

        loginPage.clickToCloseNotifyMsg();
    }

    @AfterClass
    public void afterClass() {
        closeBrowser();
    }
}
