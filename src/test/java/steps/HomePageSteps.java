package steps;

import page.HomePage;
import io.cucumber.java.en.*;
import utils.ExplicitWait;

public class HomePageSteps {

    private HomePage page;
    public HomePageSteps() {
        page=new HomePage();
    }

    @Given("select UK as delivery location and accept tracking cookie")
    public void selectUKAsDeliveryLocationAndAcceptTrackingCookie() {
        ExplicitWait.waitForPageLoaded();
        page.deliveryCountryUK();
        page.acceptCookiesTracking();
        page.verifyHomePage();
    }

    @And("the page should display the search box")
    public void thePageShouldDisplayTheSearchBox() {
        page.verifySearchDisplay();
    }

    @When("type the word {string} in search box")
    public void typeTheWordInSearchBox(String searchStr) {
        page.fillSearchInput(searchStr);
    }


}
