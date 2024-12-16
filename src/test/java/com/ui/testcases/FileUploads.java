package com.ui.testcases;

import org.testng.annotations.AfterClass;
import userInterface.actions.commons.BaseTest;
import userInterface.actions.commons.PageGenerator;

import userInterface.actions.pageObjects.FileUploaderPageObject;
import userInterface.actions.pageObjects.HomePagePageObject;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FileUploads extends BaseTest {
    private WebDriver driver;
    private HomePagePageObject homePagePage;
    private FileUploaderPageObject fileUploaderPage;
    private String fileName;

    @Parameters({"browserName" , "url"})
    @BeforeClass
    public void beforeClass(String browserName, String url){
        driver = getBrowserDriver(browserName, url);

        fileName = "BreadStackAssignment.pdf";

        homePagePage = PageGenerator.getHomePageObject(driver);

        fileUploaderPage = homePagePage.clickToFileUploadLink();
    }

    @Test
    public void UF_01_UploadWithValidFile(){
        fileUploaderPage.uploadSingleFile(fileName);

        Assert.assertEquals(fileUploaderPage.getLoadedFileName(), fileName);

        fileUploaderPage.clickToUploadButton();

        Assert.assertEquals(fileUploaderPage.getUploadedFileName(), fileName);

        Assert.assertEquals(fileUploaderPage.getUploadedFileTitlePage(), "File Uploaded!");
    }

    @AfterClass
    public void afterClass(){
        closeBrowser();
    }

}
