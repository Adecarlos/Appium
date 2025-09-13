package AutomatizadoMobile.Appium;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MiscellanousAppiumActions extends BaseTest{
	@Test
	public void MiscellanousTest() {
		/*
		 * Activity activity = new Activity("io.appium.android.apis",
		 * "io.appium.android.apis.preference.PreferenceDependencies");
		 * driver.startActivity();
		 */
		startActivityScript("io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies");
//		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
//		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		DeviceRotation landScape = new DeviceRotation(0, 0, 90);
		driver.rotate(landScape);
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String AlertText = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(AlertText, "WiFi settings");
		//copy from clipboard - paste it clipboard
		driver.setClipboardText("TesteClipboard");
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		//driver.findElement(By.id("android:id/edit")).sendKeys("teste");

		driver.findElement(By.id("android:id/button1")).click();
		DeviceRotation portrait = new DeviceRotation(90, 0, 0);
		driver.rotate(portrait);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
	}
}
