package userInterface.actions.pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import userInterface.actions.commons.BaseActions;
import userInterface.actions.commons.PageGenerator;
import userInterface.pageUIs.SecureAreaPageUI;

public class SecureAreaPageObject extends BaseActions {
    private WebDriver driver;
    public SecureAreaPageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    @Step("Click to log out button")
    public LoginPagePageObject clickToLogOutButton() {
        waitForElementClickable(driver, SecureAreaPageUI.LOGOUT_BUTTON);
        clickToElement(driver, SecureAreaPageUI.LOGOUT_BUTTON);
        return PageGenerator.getLoginPageObject(driver);
    }
}
