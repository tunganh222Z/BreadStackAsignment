package userInterface.actions.pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import userInterface.pageUIs.DropdownPageUI;

public class DropdownPageObject extends commons.BasePage {
    private WebDriver driver;
    public DropdownPageObject(WebDriver driver){
        this.driver = driver;
    }

    @Step("Select option in dropdown list {0}")
    public void selectOptionInDropdownList(String option) {
        waitForElementClickable(driver, DropdownPageUI.DROPDOWN_LIST);
        selectItemInDefaultDropdown(driver, DropdownPageUI.DROPDOWN_LIST, option);
    }

    @Step("Get option is selected in dropdown list")
    public String getOptionSelectedInDropdown() {
        waitForElementClickable(driver, DropdownPageUI.DROPDOWN_LIST);
        return getFirstSelectedTextInDefaultDropdown(driver, DropdownPageUI.DROPDOWN_LIST);
    }

    @Step("Refresh dropdown page")
    public void navigateRefreshPage() {
        refreshCurrentPage(driver);
    }

    @Step("Get default option text")
    public String isDefaultOptionSelectedInDropdown() {
        waitForElementClickable(driver, DropdownPageUI.DROPDOWN_LIST);
        return getFirstSelectedTextInDefaultDropdown(driver, DropdownPageUI.DROPDOWN_LIST);
    }
}
