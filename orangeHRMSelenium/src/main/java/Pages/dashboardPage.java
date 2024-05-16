package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dashboardPage extends pageBase{
    By userDropDownList = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
    By logoutButton = By.xpath("//a[contains(.,'Logout')]");

    public void logout(WebDriverWait wait, Actions actions, WebDriver driver) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(userDropDownList));
        moveAndClick(driver.findElement(userDropDownList), actions);
        //Thread.sleep(3000);
        moveAndClick(driver.findElement(logoutButton), actions);
    }
}
