package test.screen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.DriverHelper;

import java.util.List;

/**
 * Created by rakeshreddy on 12/07/2016.
 */
public class ProductListingScreen extends DriverHelper {

    @AndroidFindAll(@AndroidFindBy(id ="gridview"))
    private List<MobileElement> _productCount;

    @AndroidFindBy(id ="checkout_login_quick_checkout")
    private MobileElement resultCountBtn;

    public ProductDescriptionScreen selectProduct(){
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(resultCountBtn));

        System.out.println("resultCountBtn     "+_productCount.size());
        _productCount.get(0).click();
        return new ProductDescriptionScreen();
    }
}
