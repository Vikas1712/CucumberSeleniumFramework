package steps;

import driver.FactoryDriver;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import utils.PropertyProvider;

public class BasePageSteps {

    @Given("user is on the homepage")
    public void userIsOnTheHomepage() {
        String baseUrl = PropertyProvider.getProperty("base_url");
        WebDriver instance = FactoryDriver.getInstance();
        if(!instance.getCurrentUrl().equals(baseUrl)) {
            instance.get(baseUrl);
        }
    }

}
