package test.screen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.DriverHelper;

/**
 * Created by rakeshreddy on 12/07/2016.
 */
public class BagScreen extends DriverHelper{

    @AndroidFindBy(id="basket_addtobag_button")
    private MobileElement proceedToCheckOutBtn;

    public CheckoutScreen proceedToCheckOut(){
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(proceedToCheckOutBtn)).click();
        return new CheckoutScreen();
    }
}
