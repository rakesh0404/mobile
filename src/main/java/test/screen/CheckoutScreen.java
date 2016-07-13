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
public class CheckoutScreen extends DriverHelper {


    @AndroidFindBy(id="email_edit_text_log_on")
    private MobileElement userNameTxt;

    @AndroidFindBy(id="password_edit_text_log_on")
    private MobileElement passwordTxt;

    @AndroidFindBy(id="sign_in_button")
    private MobileElement signInBtn;

   @AndroidFindBy(xpath="//FrameworkLayout/ListView/TextView[2]")
    private MobileElement storeLbl;


    @AndroidFindAll( @AndroidFindBy(id="cacLocalStoresListView"))
    private List<MobileElement> storeLocator;

//    @AndroidFindAll( @AndroidFindBy(id="list"))
//    private List<MobileElement> deliveryTypeLbl;

    @AndroidFindBy(xpath = "//*[text()='COLLECT FROM A RIVER ISLAND STORE']")
    private MobileElement storeCollectionLbl;

    @AndroidFindBy(id="method_row")
    private MobileElement paypal;

    @AndroidFindBy(id="title")
    private MobileElement paymentScreen;
    @AndroidFindBy(id="delivery_type_title")
    private MobileElement deliveryTypeLbl;



    public CheckoutScreen doLogin(){
          new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(signInBtn));
        userNameTxt.sendKeys("rakeshreddy255@gmail.com");
        passwordTxt.sendKeys("innovation");
        signInBtn.click();
        return this;
    }

    public boolean isSignInDisplayed(){
        return  new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(signInBtn)).isDisplayed();
    }


    public CheckoutScreen selectCollectFromStore(){
          new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(storeLbl)).click();
        return this;
    }


    public boolean isDeliveryTypeDisplayed(){
       return new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(deliveryTypeLbl)).isDisplayed();

    }

    public CheckoutScreen selectStore(){

        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(storeLocator.get(0))).click();
        return this;

    }

    public CheckoutScreen selectDeliveryOptions(){
      //  new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(deliveryTypeLbl.get(0))).click();
        return this;
    }

    public boolean isPaymentScreenDisplayed(){
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(paypal));

        return  paymentScreen.getText().matches("CHOOSE PAYMENT METHOD");
    }

}
