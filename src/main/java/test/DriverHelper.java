package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DriverHelper {
	public String device="0715f7b20e973834";

	public static AppiumDriver<MobileElement> driver;

	public DriverHelper() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void openApp() throws MalformedURLException{
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), buildCapabilities());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public void closeServer() {
		driver.quit();
	}

	public DesiredCapabilities buildCapabilities()  {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.1.1");
		capabilities.setCapability("deviceName", device);
		capabilities.setCapability("appPackage", "com.riverisland.android");
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("appActivity", "com.riverisland.android.StartupActivity");
		return capabilities;
	}
}

