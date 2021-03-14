package page;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ExplicitWait;

public class HomePage extends BasePage{

    @FindBy(css="[data-auto-id='logo']")
    private WebElement adidaslogo;

    @FindBy(xpath = "//span[@class='gl-radio-input__label'][normalize-space()='United Kingdom']")
    private WebElement unitedKingdomradiobtn;

    @FindBy(css = "[data-auto-id='choose-delivery-country']")
    private WebElement godeliveryCountrybtn;

    @FindBy(css="[data-auto-id='glass-gdpr-default-consent-accept-button']")
    private WebElement consentacceptbtn;

    @FindBy(css="[data-auto-id='searchinput']")
    private WebElement searchInput;

    public void deliveryCountryUK(){
        unitedKingdomradiobtn.click();
        godeliveryCountrybtn.sendKeys(Keys.ENTER);
    }

    public void acceptCookiesTracking(){
        ExplicitWait.visibilityOfElement(consentacceptbtn);
        consentacceptbtn.click();
    }
    public void verifyHomePage(){
        ExplicitWait.visibilityOfElement(adidaslogo);
        Assert.assertTrue(adidaslogo.isDisplayed());
    }
    public void verifySearchDisplay(){
        Assert.assertTrue(searchInput.isDisplayed());
    }
    public void fillSearchInput(String key) {
        searchInput.sendKeys(key);
        searchInput.sendKeys(Keys.ENTER);
    }

}
