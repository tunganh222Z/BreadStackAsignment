package userInterface.actions.commons;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import userInterface.pageUIs.BaseActionsUI;

public class BaseActions extends commons.BasePage {
    private WebDriver driver;
    public BaseActions(WebDriver driver){
        this.driver = driver;
    }

    @Step("Get notify message")
    public String getNotifyMsg() {
        waitForElementVisible(driver, BaseActionsUI.NOTIFY_MESSAGE);

        String actual = getWebElementText(driver, BaseActionsUI.NOTIFY_MESSAGE);

        return actual = actual.replaceAll("×$", "").trim();
    }

    @Step("Click to close notify message")
    public void clickToCloseNotifyMsg() {
        waitForElementClickable(driver, BaseActionsUI.NOTIFY_CLOSE_BUTTON);
        clickToElement(driver, BaseActionsUI.NOTIFY_CLOSE_BUTTON);
    }
}
