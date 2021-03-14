package page;
import driver.FactoryDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected BasePage(){
        PageFactory.initElements(FactoryDriver.getInstance(), this);
    }
}
