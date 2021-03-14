package page;

import driver.FactoryDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import utils.ExplicitWait;
import utils.ScenarioContext;
import java.util.List;

public class CheckoutPage extends BasePage {

    @FindBy( xpath="//strong[normalize-space()='From a collection point']")
    private WebElement collectionPoint;

    @FindBy(css = "[data-auto-id='pickpoint-search-input']")
    private WebElement location;

    @FindBy(css = "[data-auto-id='pickup-point-search-button']")
    private WebElement searchcollectionpointbtn;

    @FindBy(xpath = "//h5[normalize-space()='Collection point locations']")
    private WebElement storemodeltitle;

    @FindAll(@FindBy( xpath= "(//div[@data-auto-id='store-name'])/strong"))
    private List<WebElement> storeNames;

    @FindBy(css = "[data-auto-id='select-store-button']")
    private WebElement collectHere;

    @FindBy(css = "[data-auto-id='store-name']")
    private WebElement selectedStoreName;

    public void validateNavigationToCheckoutPage(){
        Assert.assertTrue(FactoryDriver.getInstance().getCurrentUrl().contains("delivery"));
    }

    public void clickOn_FromCollectionPoint(){
       collectionPoint.click();
    }

    public void enterlocationforcollectionpoint(String addr){
        location.sendKeys(addr);
    }

    public void clickOn_searchcollectionpoint(){
        ExplicitWait.sleep(500);
        searchcollectionpointbtn.click();
    }

    public void verifyNavigationToStoreLocationModel(){
        ExplicitWait.visibilityOfElement(storemodeltitle);
        String actualTitle=storemodeltitle.getText();
        Assert.assertTrue(actualTitle.equalsIgnoreCase("Collection point locations"));
    }

    public void selectStorefromCollectionPoints(String name){
        ScenarioContext.setContext("STORES_NAME",name);
        storeNames.stream().filter(webElement -> webElement.getText().matches(name)).forEach(webElement -> {
            webElement.click();
        });
        ExplicitWait.elementToBeClickable(collectHere);
        collectHere.click();
        ExplicitWait.sleep(1000);
    }

    public void verifySelectedStoreCollectionPoint(){
        ExplicitWait.sleep(1500);
        String storename=selectedStoreName.getText();
        String expectedStoreName=ScenarioContext.getContext("STORES_NAME");
        Assert.assertTrue(storename.equalsIgnoreCase(expectedStoreName));
    }
}
