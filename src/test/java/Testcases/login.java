package Testcases;

import Pages.dashboardPage;
import Pages.loginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class login extends testBase{
    static loginPage loginPage;
    static dashboardPage dashboardPage;

    @Test(dataProvider = "LoginData", dataProviderClass = dataProviderClass.class)
    public static void loginWithValidUserNameAndValidPassword(String url, String username, String password, String loginPageTitle) throws InterruptedException {
        loginPage = new loginPage(driver);
        loginPage.login(url, username, password, loginPageTitle, driver, actions, wait);
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));

        // logout
        dashboardPage = new dashboardPage(driver);
        dashboardPage.logout(wait, actions);
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));
    }
}
