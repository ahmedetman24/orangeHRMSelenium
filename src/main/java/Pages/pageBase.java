package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageBase
{
    public pageBase(WebDriver driver)
    {
        super();
        PageFactory.initElements(driver, this);
    }

    protected static void moveAndClick(WebElement button, Actions actions)
    {
        actions.moveToElement(button);
        button.click();
    }
    protected static void clickOnButton(WebElement button, WebDriverWait wait, Actions actions)
    {
        wait.until(ExpectedConditions.elementToBeClickable(button));
        actions.moveToElement(button).click().build().perform();
    }

    protected static void writeText(WebElement textBox, WebDriverWait wait, String text)
    {
        wait.until(ExpectedConditions.visibilityOf(textBox));
        textBox.clear();
        textBox.sendKeys(text);
    }
}
