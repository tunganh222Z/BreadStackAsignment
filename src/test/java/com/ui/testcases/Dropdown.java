package com.ui.testcases;

import userInterface.actions.commons.BaseTest;
import userInterface.actions.commons.PageGenerator;
import userInterface.actions.pageObjects.DropdownPageObject;
import userInterface.actions.pageObjects.HomePagePageObject;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dropdown extends BaseTest {
    private WebDriver driver;
    private HomePagePageObject homePagePage;
    private DropdownPageObject dropdownPage;

    private String option1, option2;

    @Parameters({"browserName" , "url"})
    @BeforeClass
    public void beforeClass(String browserName, String url){
        option1 = "Option 1";

        option2 = "Option 2";

        driver = getBrowserDriver(browserName, url);

        homePagePage = PageGenerator.getHomePageObject(driver);

        dropdownPage = homePagePage.clickToDropdownLink();
    }

    @Test
    public void DD_01_(){
        dropdownPage.selectOptionInDropdownList(option1);

        Assert.assertEquals(dropdownPage.getOptionSelectedInDropdown(), "Option 1");

        dropdownPage.selectOptionInDropdownList(option2);

        Assert.assertEquals(dropdownPage.getOptionSelectedInDropdown(), "Option 2");

        dropdownPage.navigateRefreshPage();

        Assert.assertEquals(dropdownPage.isDefaultOptionSelectedInDropdown(), "Please select an option");
    }

    @AfterClass
    public void afterClass(){
        closeBrowser();
    }
}
