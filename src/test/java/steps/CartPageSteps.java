package steps;

import page.CartPage;
import io.cucumber.java.en.*;
import utils.ExplicitWait;

public class CartPageSteps {

    CartPage page;
    public CartPageSteps() {
        page=new CartPage();
    }

    @Then("verify product is added to bag successfully")
    public void verifyProductIsAddedToBagSuccessfully() {
        page.validateCardTitle();
        page.getCartProductName();
    }

    @When("click on view bag button")
    public void clickOnViewBagButton() {
        page.clickOn_ViewBag();
    }

    @And("navigate to the cart page")
    public void navigateToTheCartPage() {
        page.validateNavigationToCartPage();
    }

    @Then("verify the cart page by the title {string}")
    public void verifyTheCartPageByTheTitle(String title) {
        ExplicitWait.waitForPageLoaded();
        page.validateBagCardTitle(title);
    }

    @When("click on the checkout button")
    public void clickOnTheCheckoutButton() {
        page.clickOn_checkout();
    }
}
