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
public class ProductDescriptionScreen extends DriverHelper {
    @AndroidFindBy(id="pdp_addtobag_button")
    private MobileElement addToBagBtn;

   @AndroidFindAll( @AndroidFindBy(id="select_dialog_listview"))
    private List<MobileElement> size;

//    @AndroidFindBy(xpath="//*[text()='Size 6']")
//    private MobileElement size;

    @AndroidFindBy(id="menu_basket")
    private MobileElement bagview;

    public ProductDescriptionScreen tapOnAdd2Bag(){
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(addToBagBtn));

        addToBagBtn.click();
        return this;
    }

    public ProductDescriptionScreen selectSize(){
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(size.get(0)));


        System.out.println("dfgkjdklf "+  size.size());
       size.get(0).click();
        return this;
    }

    public BagScreen goToBag(){
        bagview.click();
        return new BagScreen();
    }
}
