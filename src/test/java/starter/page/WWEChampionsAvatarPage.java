package starter.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WWEChampionsAvatarPage {
    WebDriver driver;

    private final By accountSettingsBtn = By.cssSelector("[data-id='account_profile_settings_show_button']");
    private final By changeAvatarBtn = By.cssSelector("[data-id='account_settings_Change Avatar']");
    private final By selectAvatar = By.cssSelector(".avatar-select-right [data-id='select_32_avatar']");
    private final By changeAvatarApplyBtn  = By.cssSelector("[data-id='avatar_change_apply_button']");

    public WWEChampionsAvatarPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAccountSettingsBtn() {
        WebDriverWait wait = new WebDriverWait(driver,  20);
        wait.until(ExpectedConditions.elementToBeClickable(accountSettingsBtn));
        driver.findElement(accountSettingsBtn).click();
    }

    public void clickChangeAvatarBtn() {
        driver.findElement(changeAvatarBtn).isDisplayed();
        driver.findElement(changeAvatarBtn).isEnabled();
        driver.findElement(changeAvatarBtn).click();
    }


    public void selectAvatar() {
        driver.findElement(selectAvatar).isDisplayed();
        driver.findElement(selectAvatar).isEnabled();
        driver.findElement(selectAvatar).click();
    }

    public void changeAvatarApplyBtn() {
        driver.findElement(changeAvatarApplyBtn).isDisplayed();
        driver.findElement(changeAvatarApplyBtn).isEnabled();
        driver.findElement(changeAvatarApplyBtn).click();
        driver.navigate().refresh();

    }

}


