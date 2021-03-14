package steps;

import page.CheckoutPage;
import io.cucumber.java.en.*;

public class CheckoutSteps {

    CheckoutPage page;
    public CheckoutSteps() {
        page=new CheckoutPage();
    }

    @Then("user is navigated to the delivery page")
    public void user_is_navigated_to_the_delivery_page() {
        page.validateNavigationToCheckoutPage();
    }

    @And("from the Get Your Order module click on From A Collection Point")
    public void fromTheGetYourOrderModuleClickOnFromACollectionPoint() {
        page.clickOn_FromCollectionPoint();
    }

    @When("type {string} in the location text box")
    public void typeInTheLocationTextBox(String addr) {
        page.enterlocationforcollectionpoint(addr);
    }

    @And("click Search for Collection Points button")
    public void clickSearchForCollectionPointsButton() {
        page.clickOn_searchcollectionpoint();
    }

    @Then("it should navigate to store location model")
    public void itShouldNavigateToStoreLocationModel() {
        page.verifyNavigationToStoreLocationModel();
    }

    @When("from the list of store, pick {string} collection point")
    public void fromTheListOfStorePickCollectionPoint(String storeName) {
        page.selectStorefromCollectionPoints(storeName);
    }


    @Then("verify that correct collection point is selected")
    public void verifyThatCorrectCollectionPointIsSelected() {
        page.verifySelectedStoreCollectionPoint();
    }
}
