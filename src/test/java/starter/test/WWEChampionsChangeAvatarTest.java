package starter.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import starter.page.WWEChampionsLoginPage;
import starter.page.WWEChampionsAvatarPage;

import java.time.Duration;

public class WWEChampionsChangeAvatarTest {

    private static final WebDriver driver = new ChromeDriver();
    static WWEChampionsAvatarPage wWEChampionsAvatarPage = new WWEChampionsAvatarPage(driver);
    static WWEChampionsLoginPage wWEChampionsLoginPage = new WWEChampionsLoginPage(driver);

    @BeforeMethod
    public static void login() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\legion\\Downloads\\chromedriver.exe");
        driver.get("https://wwechampions.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // User login with ScopelyID
        wWEChampionsLoginPage.clickLoginBtn();
        wWEChampionsLoginPage.clickScopelyBtn();
        wWEChampionsLoginPage.fillEmailField();
        wWEChampionsLoginPage.fillPasswordField();
        wWEChampionsLoginPage.clickSubmitBtn();

    }

    @Test
    public static void changeAvatarTest() {
        // Change the avatar for the player and apply it
        wWEChampionsAvatarPage.clickAccountSettingsBtn();
        wWEChampionsAvatarPage.clickChangeAvatarBtn();
        wWEChampionsAvatarPage.selectAvatar();
        wWEChampionsAvatarPage.changeAvatarApplyBtn();
        wWEChampionsAvatarPage.clickAccountSettingsBtn();

    }

    @AfterMethod
    public static void logout() {
        // User logout
        wWEChampionsLoginPage.clickLogoutBtn();
        driver.close();

    }
}
