package userInterface.actions.pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import userInterface.pageUIs.CheckboxesPageUI;

public class CheckboxesPageObject extends commons.BasePage {
    private WebDriver driver;
    public CheckboxesPageObject(WebDriver driver){
        this.driver = driver;
    }

    @Step("Unselect checkbox 1")
    public void UnselectCheckbox1() {
        waitForElementClickable(driver, CheckboxesPageUI.CHECKBOX_1);
        if (isElementSelected(driver, CheckboxesPageUI.CHECKBOX_1)){
            clickToElement(driver, CheckboxesPageUI.CHECKBOX_1);
        }
    }

    @Step("Unselect checkbox 2")
    public void UnselectCheckbox2() {
        waitForElementClickable(driver, CheckboxesPageUI.CHECKBOX_2);
        if (isElementSelected(driver, CheckboxesPageUI.CHECKBOX_2)){
            clickToElement(driver, CheckboxesPageUI.CHECKBOX_2);
        }
    }

    @Step("Select checkbox 1")
    public void SelectCheckbox1() {
        waitForElementClickable(driver, CheckboxesPageUI.CHECKBOX_1);
        if (!isElementSelected(driver, CheckboxesPageUI.CHECKBOX_1)){
            clickToElement(driver, CheckboxesPageUI.CHECKBOX_1);
        }
    }

    @Step("Select checkbox 1")
    public void SelectCheckbox2() {
        waitForElementClickable(driver, CheckboxesPageUI.CHECKBOX_2);
        if (!isElementSelected(driver, CheckboxesPageUI.CHECKBOX_2)){
            clickToElement(driver, CheckboxesPageUI.CHECKBOX_2);
        }

    }

    public boolean isCheckbox1UnSelected() {
        boolean status = false;
        waitForElementClickable(driver, CheckboxesPageUI.CHECKBOX_1);
        if (!isElementSelected(driver, CheckboxesPageUI.CHECKBOX_1)){
            status = true;
        }
        return status;
    }

    public boolean isCheckbox2UnSelected() {
        boolean status = false;
        waitForElementClickable(driver, CheckboxesPageUI.CHECKBOX_2);
        if (!isElementSelected(driver, CheckboxesPageUI.CHECKBOX_2)){
            status = true;
        }
        return status;
    }
}
