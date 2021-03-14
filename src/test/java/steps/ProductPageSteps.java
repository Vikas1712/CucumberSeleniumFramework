package steps;

import page.ProductDescriptionPage;
import io.cucumber.java.en.*;

public class ProductPageSteps {

    ProductDescriptionPage page;
    public ProductPageSteps() {
        page=new ProductDescriptionPage();
    }


    @When("pick any size and click on Add to Bag button")
    public void pickAnySizeAndClickOnAddToBagButton() {
        page.select_Size();
        page.addtocart();
    }

    @Then("verify product page by checking url and product name")
    public void verifyProductPageByCheckingUrlAndProductName() {
        page.verifyProductNameandURL();
    }
}
