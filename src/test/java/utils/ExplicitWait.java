package utils;

import driver.FactoryDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.util.List;
import static utils.GlobalConstants.*;

public class ExplicitWait {
    private static WebDriverWait wait = new WebDriverWait(FactoryDriver.getInstance(), EXPLICIT_WAIT_TIMEOUT);

    public static void visibilityOfElement(WebElement webElement) {
        wait.ignoring(StaleElementReferenceException.class, WebDriverException.class).until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void invisibilityOfElement(WebElement webElement) {
        wait.ignoring(StaleElementReferenceException.class, WebDriverException.class).until(ExpectedConditions.invisibilityOf(webElement));
    }

    public static void visibilityOfElements(List<WebElement> webElements) {
        wait.ignoring(StaleElementReferenceException.class, WebDriverException.class).until(ExpectedConditions.visibilityOfAllElements(webElements));
    }

    public static void elementToBeClickable(WebElement webElement) {
        wait.ignoring(StaleElementReferenceException.class, WebDriverException.class).until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public static void waitForPageLoaded() {
        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
                    }
                };
        WebDriverWait wait = new WebDriverWait(FactoryDriver.getInstance(), EXPLICIT_SLEEP_TIMEOUT_MILLIS);
        wait.until(pageLoadCondition);
    }

    public static void sleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
