package AutomatizadoMobile.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	AppiumDriverLocalService service;
	AndroidDriver driver;
	
	@BeforeClass
	public void configureAppium() throws MalformedURLException, URISyntaxException {

		service = new AppiumServiceBuilder()
				.withAppiumJS(
						new File("C:\\Users\\jwest\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))

				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		UiAutomator2Options options = new UiAutomator2Options();

		options.setDeviceName("Pixel3");
//	options.setCapability("deviceName", "Pixel3");
//	options.setCapability("udid", "emulator-5554");
		options.setApp(
				"D:\\Arquivos de Programas\\Eclipse\\eclipse-workspace\\Appium\\src\\test\\java\\Resources\\ApiDemos-debug.apk");

		driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		service.stop();
	}
}
