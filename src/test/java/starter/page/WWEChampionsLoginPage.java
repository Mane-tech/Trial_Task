package starter.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import starter.data.UserData;

public class WWEChampionsLoginPage {
    WebDriver driver;

    private final By loginBtn = By.xpath("//*[@id='root']/main/aside[2]/div[1]/div/button");
    private final By scopelyBtn = By.cssSelector("[data-id='scopely_login']");
    private final By emailField = By.cssSelector("[data-se='o-form-input-identifier'] input");
    private final By passwordField = By.cssSelector("[data-se='o-form-input-credentials.passcode'] input");
    private final By submitBtn = By.cssSelector("[type='submit']");
    private final By logoutBtn = By.cssSelector("[data-id='account_settings_Logout']");

    public WWEChampionsLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginBtn() {
        driver.findElement(loginBtn).isDisplayed();
        driver.findElement(loginBtn).isEnabled();
        driver.findElement(loginBtn).click();
    }

    public void clickScopelyBtn() {
        driver.findElement(scopelyBtn).isDisplayed();
        driver.findElement(scopelyBtn).isEnabled();
        driver.findElement(scopelyBtn).click();
    }

    public void fillEmailField() {
        driver.findElement(emailField).isDisplayed();
        driver.findElement(emailField).sendKeys(UserData.EMAIL.value());
    }

    public void fillPasswordField() {
        driver.findElement(passwordField).isDisplayed();
        driver.findElement(passwordField).sendKeys(UserData.PASSWORD.value());
    }

    public void clickSubmitBtn() {
        driver.findElement(submitBtn).isDisplayed();
        driver.findElement(submitBtn).isEnabled();
        driver.findElement(submitBtn).click();
    }

    public void clickLogoutBtn() {
        driver.findElement(logoutBtn).isDisplayed();
        driver.findElement(logoutBtn).isEnabled();
        driver.findElement(logoutBtn).click();
    }
}
