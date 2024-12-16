package userInterface.actions.pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import userInterface.actions.commons.GlobalConstant;
import userInterface.pageUIs.FileUploaderPageUI;

public class FileUploaderPageObject extends commons.BasePage {
    private WebDriver driver;
    public FileUploaderPageObject(WebDriver driver){
        this.driver = driver;
    }

    @Step("Upload single file with file name {0}")
    public void uploadSingleFile(String fileName) {
        waitForElementVisible(driver, FileUploaderPageUI.UPLOAD_FILE_BUTTON);
        String filePath = GlobalConstant.UPLOAD_FILE_PATH + fileName;
        sendkeyToElement(driver, FileUploaderPageUI.UPLOAD_FILE_BUTTON, filePath);
    }

    @Step("Click to upload button")
    public void clickToUploadButton() {
        waitForElementClickable(driver, FileUploaderPageUI.UPLOAD_BUTTON);
        clickToElement(driver, FileUploaderPageUI.UPLOAD_BUTTON);
    }

    @Step("Get uploaded file title page")
    public String getUploadedFileTitlePage() {
        waitForElementVisible(driver, FileUploaderPageUI.UPLOADED_TITLE_PAGE);
        return getWebElementText(driver, FileUploaderPageUI.UPLOADED_TITLE_PAGE);
    }

    @Step("Get loaded file name")
    public String getLoadedFileName() {
        waitForElementVisible(driver, FileUploaderPageUI.FILE_NAME_LOADED);

        String fileNamePath = getWebElementAttribute(driver, FileUploaderPageUI.FILE_NAME_LOADED, "value");

        int lastSlashIndex = Math.max(fileNamePath.lastIndexOf('/'), fileNamePath.lastIndexOf('\\'));

        String fileName = fileNamePath.substring(lastSlashIndex+1);

        return fileName;
    }

    @Step("Get Uploaded File Name")
    public String getUploadedFileName(){
        waitForElementVisible(driver, FileUploaderPageUI.FILE_NAME_UPLOADED);
        return getWebElementText(driver, FileUploaderPageUI.FILE_NAME_UPLOADED);
    }
}
