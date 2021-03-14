package steps;

import page.SearchPage;
import io.cucumber.java.en.*;
import utils.ExplicitWait;
import utils.ScenarioContext;

public class SearchPageSteps {

    private SearchPage page;

    public SearchPageSteps() {
        page=new SearchPage();
    }

    @Then("user is navigated to the  search page")
    public void userIsNavigatedToTheSearchPage() {
        ExplicitWait.waitForPageLoaded();
        page.verifySearchPage();
    }

    @When("Choose to buy the first product from PLP page")
    public void choose_to_buy_the_first_product_from_plp_page() {
        String  productName=page.getProductName();
        ScenarioContext.setContext("PRODUCT_NAME",productName);
        page.selectFirstProductfromSearchList();
    }
}
