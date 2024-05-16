package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage extends pageBase{

    By userNameTextBox = By.xpath("//input[@name='username']");
    By passwordTextBox = By.xpath("//input[@name='password']");
    By loginButton = By.xpath("//button[contains(.,'Login')]");

    public void login(String url, String username, String password, String title, WebDriver driver, Actions actions, WebDriverWait wait)
    {
        driver.get(url);

        driver.findElement(userNameTextBox).sendKeys(username);
        driver.findElement(passwordTextBox).sendKeys(password);

        moveAndClick(driver.findElement(loginButton), actions);
    }
}
