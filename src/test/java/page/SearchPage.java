package page;

import driver.FactoryDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import utils.ExplicitWait;
import java.util.List;

public class SearchPage extends BasePage{

    @FindBy(css="[data-auto-id='plp-header-bar-search-container']")
    private WebElement searchbar;

    @FindAll(@FindBy( css="[data-index='0']"))
    private List<WebElement> selectProduct;

    public void verifySearchPage(){
        ExplicitWait.visibilityOfElement(searchbar);
        Assert.assertTrue(searchbar.isDisplayed());
        Assert.assertTrue(FactoryDriver.getInstance().getCurrentUrl().contains("search"));
    }

    public void selectFirstProductfromSearchList(){
        selectProduct.get(0).click();
    }

    public String getProductName() {
        WebElement product_Name=selectProduct.get(0).findElement(By.tagName("span"));
        return product_Name.getText().toString();
    }
}
