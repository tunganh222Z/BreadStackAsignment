package userInterface.actions.commons;

import userInterface.actions.pageObjects.*;
import org.openqa.selenium.WebDriver;

public class PageGenerator {
    WebDriver driver;
    public PageGenerator (WebDriver driver){
        this.driver = driver;
    }

    public static HomePagePageObject getHomePageObject(WebDriver driver){
        return new HomePagePageObject(driver);
    }

    public static LoginPagePageObject getLoginPageObject(WebDriver driver){
        return new LoginPagePageObject(driver);
    }

    public static CheckboxesPageObject getCheckboxesPageObject(WebDriver driver){
        return new CheckboxesPageObject(driver);
    }

    public static DropdownPageObject getDropdownPageObject(WebDriver driver){
        return new DropdownPageObject(driver);
    }

    public static FileUploaderPageObject getFileUploaderPageObject(WebDriver driver){
        return new FileUploaderPageObject(driver);
    }

    public static SecureAreaPageObject getSecureAreaPageObject(WebDriver driver){
        return new SecureAreaPageObject(driver);
    }
}
