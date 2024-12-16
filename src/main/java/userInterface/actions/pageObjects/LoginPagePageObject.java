package userInterface.actions.pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import userInterface.actions.commons.BaseActions;
import userInterface.pageUIs.LoginPagePageUI;

public class LoginPagePageObject extends BaseActions {
    private WebDriver driver;
    public LoginPagePageObject(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    @Step("Click to login button")
    public void clickToLoginButton() {
        waitForElementClickable(driver, LoginPagePageUI.LOGIN_BUTTON);
        clickToElement(driver, LoginPagePageUI.LOGIN_BUTTON);
    }

    @Step("Enter user name in textbox, user name is {0}")
    public void enterToUserNameTextbox(String userName) {
        waitForElementVisible(driver, LoginPagePageUI.USER_NAME_TEXTBOX);
        sendkeyToElement(driver, LoginPagePageUI.USER_NAME_TEXTBOX, userName);
    }

    @Step("Enter password in textbox, password is {0}")
    public void enterToPasswordTextbox(String password) {
        waitForElementVisible(driver, LoginPagePageUI.PASSWORD_TEXTBOX);
        sendkeyToElement(driver, LoginPagePageUI.PASSWORD_TEXTBOX, password);

    }
}
