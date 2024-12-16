package userInterface.actions.pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import userInterface.actions.commons.PageGenerator;
import userInterface.pageUIs.HomePagePageUI;

public class HomePagePageObject extends commons.BasePage {
    private WebDriver driver;
    public HomePagePageObject(WebDriver driver){
        this.driver = driver;
    }

    @Step("Open checkbox link")
    public CheckboxesPageObject clickToCheckBoxesLink() {
        waitForElementClickable(driver, HomePagePageUI.CHECKBOX_LINK);
        clickToElement(driver,HomePagePageUI.CHECKBOX_LINK );
        return PageGenerator.getCheckboxesPageObject(driver);
    }

    @Step("Open form authentication link")
    public LoginPagePageObject clickToFormAuthenticationLink() {
        waitForElementClickable(driver, HomePagePageUI.FORM_AUTHENTICATION_LINK);
        clickToElement(driver,HomePagePageUI.FORM_AUTHENTICATION_LINK);
        return PageGenerator.getLoginPageObject(driver);
    }

    @Step("Open dropdown link")
    public DropdownPageObject clickToDropdownLink() {
        waitForElementClickable(driver, HomePagePageUI.DROPDOWN_LINK);
        clickToElement(driver,HomePagePageUI.DROPDOWN_LINK );
        return PageGenerator.getDropdownPageObject(driver);
    }

    @Step("Open file uploader link")
    public FileUploaderPageObject clickToFileUploadLink() {
        waitForElementClickable(driver, HomePagePageUI.FILE_UPLOAD_LINK);
        clickToElement(driver,HomePagePageUI.FILE_UPLOAD_LINK );
        return PageGenerator.getFileUploaderPageObject(driver);
    }
}
