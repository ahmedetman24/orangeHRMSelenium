package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dashboardPage extends pageBase{
    public dashboardPage(WebDriver driver) {
        super(driver);
    }

    //@FindBy(xpath = "//p[contains(.,'PaulBhargava CollingsBaggy')]")
    @FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
    WebElement userDropDownList;
    @FindBy(xpath = "//a[contains(.,'Logout')]")
    WebElement logoutButton;

    public void logout(WebDriverWait wait, Actions actions) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(userDropDownList));
        moveAndClick(userDropDownList, actions);
        Thread.sleep(3000);
        moveAndClick(logoutButton, actions);
    }
}
