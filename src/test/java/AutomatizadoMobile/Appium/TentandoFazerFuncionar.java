package AutomatizadoMobile.Appium;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class TentandoFazerFuncionar {
	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException {
		
		

		
//		DesiredCapabilities options = new DesiredCapabilities();
//		options.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		options.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel3");
//		options.setCapability(MobileCapabilityType.APP, "/Appium/src/test/java/Resources/ApiDemos-debug.apk");
		
//		AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
		
		
/*		UiAutomator2Options options = new UiAutomator2Options();		
		options.setDeviceName("Pixel3");
		options.setCapability("deviceName", "Pixel3");
		options.setCapability("udid", "emulator-5554");
		options.setApp("//Appium//src//test//java//Resources//ApiDemos-debug.apk");
		
		AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(),options);
		}*/
		
		
		UiAutomator2Options options = new UiAutomator2Options()
			    .setUdid("emulator-5554")
//			    .setAppPackage("io.appium.android.apis");
//		   		.setAppActivity("io.appium.android.apis.ApiDemos");
			    .setApp("D:\\Arquivos de Programas\\Eclipse\\eclipse-workspace\\Appium\\src\\test\\java\\Resources\\ApiDemos-debug.apk");
			AndroidDriver driver = new AndroidDriver(
			    // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
			    new URL("http://127.0.0.1:4723"), options
			);
			try {
			    WebElement el = driver.findElement(AppiumBy.xpath ("//Button"));
			    el.click();
			    driver.getPageSource();
			} finally {
			    driver.quit();
			}
		
		
		
}
}
