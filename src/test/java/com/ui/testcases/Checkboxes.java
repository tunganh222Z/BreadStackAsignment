package com.ui.testcases;

import userInterface.actions.commons.BaseTest;
import userInterface.actions.commons.PageGenerator;
import userInterface.actions.pageObjects.CheckboxesPageObject;
import userInterface.actions.pageObjects.HomePagePageObject;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Checkboxes extends BaseTest {
    private WebDriver driver;
    private HomePagePageObject homePagePage;
    private CheckboxesPageObject checkboxesPage;

    @Parameters({"browserName", "url"})
    @BeforeClass
    public void beforeClass(String browserName, String url) {
        driver = getBrowserDriver(browserName, url);

        homePagePage = PageGenerator.getHomePageObject(driver);

        checkboxesPage = homePagePage.clickToCheckBoxesLink();
    }

    @Test
    public void CB_01_UnselectAllCheckboxes() {
        checkboxesPage.UnselectCheckbox1();

        checkboxesPage.UnselectCheckbox2();

        Assert.assertTrue(checkboxesPage.isCheckbox1UnSelected(), "Checkbox 1 is not unselected");

        Assert.assertTrue(checkboxesPage.isCheckbox2UnSelected(), "Checkbox 2 is not unselected");
    }

    @Test
    public void CB_02_SelectAllCheckboxes() {
        checkboxesPage.SelectCheckbox1();

        checkboxesPage.SelectCheckbox2();

        Assert.assertFalse(checkboxesPage.isCheckbox1UnSelected(), "Checkbox 1 is unselected");

        Assert.assertFalse(checkboxesPage.isCheckbox2UnSelected(), "Checkbox 2 is unselected");
    }

    @AfterClass
    public void afterClass() {
        closeBrowser();
    }
}
