package test.screen;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.DriverHelper;

/**
 * Created by rakeshreddy on 07/07/2016.
 */
public class StartActivityScreen extends DriverHelper {




    @AndroidFindBy(id="home_slidingmenu")
    private MobileElement _menuBtn;

    @AndroidFindBy(id="get_started_textview")
    private MobileElement _getStartBtn;

    public MenuScreen tapMenuBtn(){
        _menuBtn.click();
        return new MenuScreen();
    }


    public StartActivityScreen tapGetStartBtn(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement element = wait.until(
                ExpectedConditions.visibilityOf(_getStartBtn));
        _getStartBtn.click();
        return this;
    }




}
