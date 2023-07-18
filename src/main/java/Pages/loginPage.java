package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage extends pageBase{
    public loginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name='username']")
    WebElement userNameTextBox;
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordTextBox;
    @FindBy(xpath = "//button[contains(.,'Login')]")
    WebElement loginButton;

    public void login(String url, String username, String password, String title, WebDriver driver, Actions actions, WebDriverWait wait)
    {
        //driver.navigate().to(url);
        driver.get(url);

        wait.until(ExpectedConditions.visibilityOf(userNameTextBox));
        writeText(userNameTextBox, wait, username);
        writeText(passwordTextBox, wait, password);
        moveAndClick(loginButton, actions);
    }
}
