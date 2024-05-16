package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class pageBase
{
    protected static void moveAndClick(WebElement button, Actions actions)
    {
        actions.moveToElement(button);
        button.click();
    }
}
