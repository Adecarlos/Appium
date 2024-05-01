package AutomatizadoMobile.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


public class AppiumBasics {

	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException {
		
	AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\jwest\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))		
			
			.withIPAddress("127.0.0.1")
			.usingPort(4723)
			.build();
	service.start();
	UiAutomator2Options options = new UiAutomator2Options();
	
	
	
	options.setDeviceName("Pixel3");
//	options.setCapability("deviceName", "Pixel3");
//	options.setCapability("udid", "emulator-5554");
	options.setApp("D:\\Arquivos de Programas\\Eclipse\\eclipse-workspace\\Appium\\src\\test\\java\\Resources\\ApiDemos-debug.apk");
	
	AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(),options);
	driver.quit();
	service.stop();
	}
}
