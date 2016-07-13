package test.screen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import test.DriverHelper;

/**
 * Created by rakeshreddy on 08/07/2016.
 */
public class MenuScreen extends DriverHelper {

    @AndroidFindBy(id ="menu_search")
    private MobileElement _searchTxt;

    @AndroidFindBy(id ="see_all_textview")
    private MobileElement _resultCountView;

    public ProductListingScreen searchProduct(String using){
        _searchTxt.sendKeys(using+"\n");

       return new ProductListingScreen();
    }

    public boolean isResultsFound(){
       return _resultCountView.isDisplayed();
    }

}
