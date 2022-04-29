package starter.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import starter.page.WWEChampionsFramePage;
import starter.page.WWEChampionsLoginPage;

import java.util.concurrent.TimeUnit;

public class WWEChampionsChangeFrameTest {

    private static final WebDriver driver = new ChromeDriver();
    static WWEChampionsLoginPage wWEChampionsLoginPage = new WWEChampionsLoginPage(driver);
    static WWEChampionsFramePage wWEChampionsFramePage = new WWEChampionsFramePage(driver);


    @BeforeMethod
    public static void login() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\legion\\Downloads\\chromedriver.exe");
        driver.get("https://wwechampions.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // User login with ScopelyID
        wWEChampionsLoginPage.clickLoginBtn();
        wWEChampionsLoginPage.clickScopelyBtn();
        wWEChampionsLoginPage.fillEmailField();
        wWEChampionsLoginPage.fillPasswordField();
        wWEChampionsLoginPage.clickSubmitBtn();

    }

    @Test
    public static void changeFrameTest() {
        // Change the frame for the player and apply it
        wWEChampionsFramePage.clickAccountSettingsBtn();
        wWEChampionsFramePage.clickChangeAvatarBtn();
        wWEChampionsFramePage.selectFrame();
        // All frames are locked, so I present "Remove Frame"
        wWEChampionsFramePage.selectRemoveFrame();
        wWEChampionsFramePage.changeFrameApplyBtn();
        wWEChampionsFramePage.clickAccountSettingsBtn();

    }

    @AfterMethod
    public static void logout() {
        // User logout
        wWEChampionsLoginPage.clickLogoutBtn();
        driver.close();

    }
}
