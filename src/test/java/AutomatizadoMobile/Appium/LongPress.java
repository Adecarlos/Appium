package AutomatizadoMobile.Appium;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;


public class LongPress extends BaseTest {

	@Test
	public void LongPressGesture() throws InterruptedException{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		//long press
		longPressAction(ele);
		String menuText = driver.findElement(By.id("android:id/title")).getText();
		assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
		assertEquals(menuText, "Sample menu");
		
		

	}
}
