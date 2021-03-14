package page;

import driver.FactoryDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ExplicitWait;
import utils.ScenarioContext;

public class ProductDescriptionPage extends BasePage{
    @FindBy(xpath="(//h1[@data-auto-id='product-title']//span)[1]")
    private WebElement productTitle;

    @FindBy( xpath="//div[@data-auto-id='size-selector']/button[1]")
    private WebElement sizeSelector;

    @FindBy(css="[class='gl-modal__close']")
    private WebElement popupwindow;

    @FindBy(css="[data-auto-id='add-to-bag']")
    private WebElement addtobagbtn;

    public void verifyProductNameandURL(){
        String productName=ScenarioContext.getContext("PRODUCT_NAME");
        String expectedURLContains=(productName.replace(' ', '-').toLowerCase());
        Assert.assertTrue(FactoryDriver.getInstance().getCurrentUrl().contains(expectedURLContains));
        popupwindow.click();
        String product_Title=productTitle.getAttribute("innerHTML");;
        Assert.assertTrue(product_Title.equalsIgnoreCase(productName));
    }

    public void select_Size(){
        sizeSelector.click();
    }

    public void addtocart(){
        ExplicitWait.elementToBeClickable(addtobagbtn);
        addtobagbtn.click();
    }
}
