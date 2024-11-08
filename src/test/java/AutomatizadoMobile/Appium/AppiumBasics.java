package AutomatizadoMobile.Appium;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;


public class AppiumBasics extends BaseTest {

	@Test
	public void WifiSettingsName() throws MalformedURLException, URISyntaxException {

	//Automação
	driver.findElement(AppiumBy.accessibilityId("Preference")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
	driver.findElement(By.id("android:id/checkbox")).click();
	driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
	String AlertText = driver.findElement(By.id("android:id/alertTitle")).getText();
	Assert.assertEquals(AlertText, "WiFi settings");
	driver.findElement(By.id("android:id/edit")).sendKeys("teste");
	driver.findElement(By.id("android:id/button1")).click();

	}
}
