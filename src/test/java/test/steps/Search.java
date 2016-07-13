package test.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import test.screen.*;

/**
 * Created by rakeshreddy on 07/07/2016.
 */
public class Search {
    StartActivityScreen startActivityScreen;
    MenuScreen menuScreen;
    ProductListingScreen productListingScreen;
    ProductDescriptionScreen productDescriptionScreen;
    CheckoutScreen checkoutScreen;

    public Search(CheckoutScreen diCheckoutScreen,StartActivityScreen diStartActivityScreen, MenuScreen diMenuScreen, ProductListingScreen diProductListingScreen, ProductDescriptionScreen diProductDescriptionScreen) {
        this.startActivityScreen = diStartActivityScreen;
        this.menuScreen = diMenuScreen;
        this.productListingScreen=diProductListingScreen;
        this.productDescriptionScreen= diProductDescriptionScreen;
        this.checkoutScreen=diCheckoutScreen;

    }

    @When("^I search for a product \"(.*?)\"$")
    public void i_search_for_a_product(String product) {
        startActivityScreen.tapMenuBtn().searchProduct(product);
    }

    @When("^I add product to bag$")
    public void i_add_product_to_bag()  {
        productListingScreen.selectProduct().tapOnAdd2Bag().selectSize();
    }

    @When("^I go to bag$")
    public void i_go_to_bag()  {
        productDescriptionScreen.goToBag().proceedToCheckOut();
    }

    @When("^I go to checkout$")
    public void i_tap_on_checkout() {
        checkoutScreen.selectCollectFromStore().selectStore().selectDeliveryOptions();
    }

    @Then("^I see sign is displayed$")
    public void i_see_sign_is_displayed()  {
        Assert.assertTrue(checkoutScreen.isPaymentScreenDisplayed());

    }


    @Then("^I see signIn screen is displayed$")
    public void iSeeSignInScreenIsDisplayed() {
        Assert.assertTrue( checkoutScreen.isSignInDisplayed());
    }

    @And("^I do signIn$")
    public void iDoSignIn() {
        checkoutScreen.doLogin();
    }

    @Then("^I see delivery type screen$")
    public void iSeeDeliveryTypeScreen() {

       Assert.assertTrue( checkoutScreen.isDeliveryTypeDisplayed());
    }
}
