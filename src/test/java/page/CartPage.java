package page;

import driver.FactoryDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ExplicitWait;
import utils.ScenarioContext;

public class CartPage extends BasePage{

    @FindBy(css="[class='gl-heading gl-heading--no-margin gl-modal__title gl-heading--m']")
    private WebElement cartstatusTitle;

    @FindBy( css="[data-auto-id='bag-modal-product-name']")
    private WebElement cartProductName;

    @FindBy( css=" [data-auto-id='view-bag-desktop']")
    private WebElement viewbag;

    @FindBy( xpath="//h3[@data-auto-id='glass-cart-title']")
    private WebElement bagcartTitle;

    @FindBy(css="[data-auto-id='glass-checkout-button-right-side']")
    private WebElement checkoutrightsidebtn;

    public void validateCardTitle(){
        ExplicitWait.visibilityOfElement(cartstatusTitle);
        String title=cartstatusTitle.getText();
        Assert.assertTrue(title.equalsIgnoreCase("Successfully added to bag!"));
    }

    public void getCartProductName(){
        String productName= ScenarioContext.getContext("PRODUCT_NAME");
        String product_Title=cartProductName.getText();
        Assert.assertTrue(product_Title.equalsIgnoreCase(productName));
    }

    public void clickOn_ViewBag(){
        viewbag.click();
    }

    public void validateNavigationToCartPage(){
        Assert.assertTrue(FactoryDriver.getInstance().getCurrentUrl().contains("cart"));
    }

    public void validateBagCardTitle(String title){
        String actualtitle=bagcartTitle.getText();
        Assert.assertTrue(actualtitle.equalsIgnoreCase(title));
    }

    public void clickOn_checkout(){
        checkoutrightsidebtn.click();
    }

}
