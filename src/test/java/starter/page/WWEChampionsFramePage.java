package starter.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WWEChampionsFramePage {
    WebDriver driver;

    private final By accountSettingsBtn = By.cssSelector("[data-id='account_profile_settings_show_button']");
    private final By changeAvatarBtn = By.cssSelector("[data-id='account_settings_Change Avatar']");
    private final By selectFrame = By.cssSelector("[data-id='avatar_select_show_frames']");
    private final By removeFrame = By.cssSelector("[data-id='avatar_select_remove_frame']");
    private final By changeFrameApplyBtn  = By.cssSelector("[data-id='frame_change_apply_button']");

    public WWEChampionsFramePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAccountSettingsBtn() {
        WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(accountSettingsBtn));
        driver.findElement(accountSettingsBtn).click();
    }

    public void clickChangeAvatarBtn() {
        driver.findElement(changeAvatarBtn).isDisplayed();
        driver.findElement(changeAvatarBtn).isEnabled();
        driver.findElement(changeAvatarBtn).click();
    }

    public void selectFrame() {
        driver.findElement(selectFrame).isDisplayed();
        driver.findElement(selectFrame).isEnabled();
        driver.findElement(selectFrame).click();
    }

    public void selectRemoveFrame() {
        driver.findElement(removeFrame).isDisplayed();
        driver.findElement(removeFrame).isEnabled();
        driver.findElement(removeFrame).click();
    }

    public void changeFrameApplyBtn() {
        driver.findElement(changeFrameApplyBtn).isDisplayed();
        driver.findElement(changeFrameApplyBtn).isEnabled();
        driver.findElement(changeFrameApplyBtn).click();
        driver.navigate().refresh();
    }

}


