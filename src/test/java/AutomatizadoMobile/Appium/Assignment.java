package AutomatizadoMobile.Appium;

import java.time.Duration;

import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.touch.TapOptions;

public class Assignment extends BaseTest{
	private By btnOK = AppiumBy.id("android:id/button1");
	private By title = AppiumBy.xpath("//android.widget.TextView[@text=\"App/Alert Dialogs\"]");
	private By resposta = AppiumBy.id("android:id/message");
	
	@Test
	public void AllertWithMessageTest() {
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
		String texto = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
		String txtbtnCancel = driver.findElement(AppiumBy.id("android:id/button2")).getText();
		String txtbtnOK = driver.findElement(btnOK).getText();
 		Assert.assertEquals(texto, "Lorem ipsum dolor sit aie consectetur adipiscing\nPlloaso mako nuto siwuf cakso dodtos anr koop.");
		Assert.assertEquals(txtbtnCancel, "Cancel");
		Assert.assertEquals(txtbtnOK, "OK");
		driver.findElement(btnOK).click();
		Assert.assertEquals(driver.findElement(title).getText(), "App/Alert Dialogs");
	}
	
	@Test
	public void AllertWithLongMessageTest() {
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a long message")).click();
		String txtTituloAllert = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
		String txtAllert = driver.findElement(AppiumBy.id("android:id/message")).getText();
		String txtButtonSomething = driver.findElement(AppiumBy.id("android:id/button3")).getText();
		String txtButtonCancel = driver.findElement(AppiumBy.id("android:id/button2")).getText();
		String txtButtonOK = driver.findElement(AppiumBy.id("android:id/button1")).getText();
		Assert.assertEquals(txtTituloAllert, "Header title");
		Assert.assertEquals(txtAllert, "Plloaso mako nuto siwuf cakso dodtos anr koop a cupy uf cak vux noaw yerw phuno. Whag schengos, uf efed, quiel ba mada su otrenzr.\n\nSwipontgwook proudgs hus yag su ba dagarmidad. Plasa maku noga wipont trenzsa schengos ent kaap zux comy.\n\nWipont trenz kipg naar mixent phona. Cak pwico siructiun ruous nust apoply tyu cak Uhex sisulutiun munityuw uw dseg");
		Assert.assertEquals(txtButtonSomething, "Something");
		Assert.assertEquals(txtButtonCancel, "Cancel");
		Assert.assertEquals(txtButtonOK, "OK");
		driver.findElement(AppiumBy.id("android:id/button3")).click();
		Assert.assertEquals(driver.findElement(title).getText(), "App/Alert Dialogs");
	}
	
	@Test
	public void AllertWithUltraLongMessageTest() {
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with ultra long message")).click();
		String txtTituloAllert = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
		Assert.assertEquals(txtTituloAllert, "Header title");
		String txtAllert = driver.findElement(AppiumBy.id("android:id/message")).getText();
		Assert.assertEquals(txtAllert, "Plloaso mako nuto siwuf cakso dodtos anr koop a cupy uf cak vux noaw yerw phuno. Whag schengos, uf efed, quiel ba mada su otrenzr.\n\n"
				+ "Swipontgwook proudgs hus yag su ba dagarmidad. Plasa maku noga wipont trenzsa schengos ent kaap zux comy.\n\n"
				+ "Wipont trenz kipg naar mixent phona. Cak pwico siructiun ruous nust apoply tyu cak Uhex sisulutiun munityuw uw dseg\n\n"
				+ " Plloaso mako nuto siwuf cakso dodtos anr koop a cupy uf cak vux noaw yerw phuno. Whag schengos, uf efed, quiel ba mada su otrenzr.\n\n"
				+ "Swipontgwook proudgs hus yag su ba dagarmidad. Plasa maku noga wipont trenzsa schengos ent kaap zux comy.\n\n"
				+ "Wipont trenz kipg naar mixent phona. Cak pwico siructiun ruous nust apoply tyu cak Uhex sisulutiun munityuw uw dseg\n\n"
				+ " Plloaso mako nuto siwuf cakso dodtos anr koop a cupy uf cak vux noaw yerw phuno. Whag schengos, uf efed, quiel ba mada su otrenzr.\n\n"
				+ "Swipontgwook proudgs hus yag su ba dagarmidad. Plasa maku noga wipont trenzsa schengos ent kaap zux comy.\n\n"
				+ "Wipont trenz kipg naar mixent phona. Cak pwico siructiun ruous nust apoply tyu cak Uhex sisulutiun munityuw uw dseg\n\n"
				+ " Plloaso mako nuto siwuf cakso dodtos anr koop a cupy uf cak vux noaw yerw phuno. Whag schengos, uf efed, quiel ba mada su otrenzr.\n\n"
				+ "Swipontgwook proudgs hus yag su ba dagarmidad. Plasa maku noga wipont trenzsa schengos ent kaap zux comy.\n\n"
				+ "Wipont trenz kipg naar mixent phona. Cak pwico siructiun ruous nust apoply tyu cak Uhex sisulutiun munityuw uw dseg\n\n"
				+ " Plloaso mako nuto siwuf cakso dodtos anr koop a cupy uf cak vux noaw yerw phuno. Whag schengos, uf efed, quiel ba mada su otrenzr.\n\n"
				+ "Swipontgwook proudgs hus yag su ba dagarmidad. Plasa maku noga wipont trenzsa schengos ent kaap zux comy.\n\n"
				+ "Wipont trenz kipg naar mixent phona. Cak pwico siructiun ruous nust apoply tyu cak Uhex sisulutiun munityuw uw dseg\n\n"
				+ " Plloaso mako nuto siwuf cakso dodtos anr koop a cupy uf cak vux noaw yerw phuno. Whag schengos, uf efed, quiel ba mada su otrenzr.\n\n"
				+ "Swipontgwook proudgs hus yag su ba dagarmidad. Plasa maku noga wipont trenzsa schengos ent kaap zux comy.\n\n"
				+ "Wipont trenz kipg naar mixent phona. Cak pwico siructiun ruous nust apoply tyu cak Uhex sisulutiun munityuw uw dseg\n\n");
		scrollToEnd();
		String txtButtonSomething = driver.findElement(AppiumBy.id("android:id/button3")).getText();
		String txtButtonCancel = driver.findElement(AppiumBy.id("android:id/button2")).getText();
		String txtButtonOK = driver.findElement(AppiumBy.id("android:id/button1")).getText();
		Assert.assertEquals(txtButtonSomething, "Something");
		Assert.assertEquals(txtButtonCancel, "Cancel");
		Assert.assertEquals(txtButtonOK, "OK");
		driver.findElement(AppiumBy.id("android:id/button3")).click();
		Assert.assertEquals(driver.findElement(title).getText(), "App/Alert Dialogs");
	}
	@Test
	public void ListDialogTest() {
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("List dialog")).click();
		String txtTitulo = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
		Assert.assertEquals(txtTitulo, "Header title");
		String txtOpcaoUm = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Command one\")")).getText();
		Assert.assertEquals(txtOpcaoUm, "Command one");
		String txtOpcaodois = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Command two\")")).getText();
		Assert.assertEquals(txtOpcaodois, "Command two");
		String txtOpcaotres = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Command three\"]")).getText();
		Assert.assertEquals(txtOpcaotres, "Command three");
		String txtOpcaoQuatro = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Command four\"]")).getText();
		Assert.assertEquals(txtOpcaoQuatro, "Command four");
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Command one\")")).click();
		String txtPosSelecaoOpcaoUm = driver.findElement(AppiumBy.id("android:id/message")).getText();
		Assert.assertEquals(txtPosSelecaoOpcaoUm, "You selected: 0 , Command one");
		touchAction(500,750);
		driver.findElement(AppiumBy.accessibilityId("List dialog")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Command two\")")).click();
		String txtPosSelecaoOpcaoDois = encontrarElemento(resposta).getText();
		Assert.assertEquals(txtPosSelecaoOpcaoDois, "You selected: 1 , Command two");
		touchAction(500,750);
		driver.findElement(AppiumBy.accessibilityId("List dialog")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Command three\"]")).click();
		String txtPosSelecaoOpcaoTres = encontrarElemento(resposta).getText();
		Assert.assertEquals(txtPosSelecaoOpcaoTres, "You selected: 2 , Command three");
		touchAction(500,750);
		driver.findElement(AppiumBy.accessibilityId("List dialog")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"Command four\"]")).click();
		String txtPosSelecaoOpcaoQuatro = encontrarElemento(resposta).getText();
		Assert.assertEquals(txtPosSelecaoOpcaoQuatro, "You selected: 3 , Command four");
		touchAction(500,750);
		Assert.assertEquals(driver.findElement(title).getText(), "App/Alert Dialogs");
	}
	
	@Test
	public void ProgressDialogTest() {
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("Progress dialog")).click();
	//	driver.findElement(AppiumBy.id("android:id/progress_number"));
//		System.out.println(driver.findElement(AppiumBy.id("android:id/progress_number")).getText());
//		String txtTitulo = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
//		Assert.assertEquals(txtTitulo, "Header title");
//		String txtButtonCancel = driver.findElement(AppiumBy.id("android:id/button2")).getText();
//		String txtButtonHide = driver.findElement(AppiumBy.id("android:id/button1")).getText();
//		Assert.assertEquals(txtButtonCancel, "CANCEL");
//		Assert.assertEquals(txtButtonHide, "HIDE");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(title));
		Assert.assertEquals(driver.findElement(title).getText(), "App/Alert Dialogs");
	}
	
	@Test
	public void SingleChoiceListTest() {
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("Single choice list")).click();
		driver.findElement(AppiumBy.id("android:id/icon"));
		String txtTitulo = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
		Assert.assertEquals(txtTitulo, "Single choice list");
		String txtOpcaoUm = driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[1]")).getText();
		Assert.assertEquals(txtOpcaoUm, "Map");
		Assert.assertEquals( driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[1]")).getAttribute("checked"), "true");
		String txtOpcaoDois = driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[2]")).getText();
		Assert.assertEquals(txtOpcaoDois, "Satellite");
		Assert.assertEquals( driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[2]")).getAttribute("checked"), "false");
		String txtOpcaoTres = driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[3]")).getText();
		Assert.assertEquals(txtOpcaoTres, "Traffic");
		Assert.assertEquals( driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[3]")).getAttribute("checked"), "false");
		String txtOpcaoQuatro = driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[4]")).getText();
		Assert.assertEquals(txtOpcaoQuatro, "Street view");
		Assert.assertEquals( driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[4]")).getAttribute("checked"), "false");
		String txtButtonCancel = driver.findElement(AppiumBy.id("android:id/button2")).getText();
		String txtButtonOK = driver.findElement(AppiumBy.id("android:id/button1")).getText();
		Assert.assertEquals(txtButtonCancel, "Cancel");
		Assert.assertEquals(txtButtonOK, "OK");
		driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[2]")).click();
		Assert.assertEquals( driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[1]")).getAttribute("checked"), "false");
		Assert.assertEquals( driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[2]")).getAttribute("checked"), "true");
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		Assert.assertEquals(driver.findElement(title).getText(), "App/Alert Dialogs");
	}
	
	@Test
	public void RepeatAlarmTest() {
		final By opcaoUm = AppiumBy.xpath("//android.widget.CheckedTextView[1]");
		final By opcaoDois = AppiumBy.xpath("//android.widget.CheckedTextView[2]");
		final By opcaoTres = AppiumBy.xpath("//android.widget.CheckedTextView[3]");
		final By opcaoQuatro = AppiumBy.xpath("//android.widget.CheckedTextView[4]");
		final By opcaoCinco = AppiumBy.xpath("//android.widget.CheckedTextView[5]");
		final By opcaoSeis = AppiumBy.xpath("//android.widget.CheckedTextView[6]");
		final By opcaoSete = AppiumBy.xpath("//android.widget.CheckedTextView[7]");
		
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("Repeat alarm")).click();
		String txtTitulo = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
		Assert.assertEquals(txtTitulo, "Repeat alarm");
		String txtOpcaoUm = driver.findElement(opcaoUm).getText();
		String txtOpcaoDois = driver.findElement(opcaoDois).getText();
		String txtOpcaoTres = driver.findElement(opcaoTres).getText();
		String txtOpcaoQuatro = driver.findElement(opcaoQuatro).getText();
		String txtOpcaoCinco = driver.findElement(opcaoCinco).getText();
		String txtOpcaoSeis = driver.findElement(opcaoSeis).getText();
		String txtOpcaoSete = driver.findElement(opcaoSete).getText();
		String txtButtonCancel = driver.findElement(AppiumBy.id("android:id/button2")).getText();
		String txtButtonOK = driver.findElement(AppiumBy.id("android:id/button1")).getText();
		Assert.assertEquals(txtOpcaoUm, "Every Monday");
		Assert.assertEquals(driver.findElement(opcaoUm).getAttribute("checked"), "false");
		Assert.assertEquals(txtOpcaoDois, "Every Tuesday");
		Assert.assertEquals(driver.findElement(opcaoDois).getAttribute("checked"), "true");
		Assert.assertEquals(txtOpcaoTres, "Every Wednesday");
		Assert.assertEquals(driver.findElement(opcaoTres).getAttribute("checked"), "false");
		Assert.assertEquals(txtOpcaoQuatro, "Every Thursday");
		Assert.assertEquals(driver.findElement(opcaoQuatro).getAttribute("checked"), "true");
		Assert.assertEquals(txtOpcaoCinco, "Every Friday");
		Assert.assertEquals(driver.findElement(opcaoCinco).getAttribute("checked"), "false");
		Assert.assertEquals(txtOpcaoSeis, "Every Saturday");
		Assert.assertEquals(driver.findElement(opcaoSeis).getAttribute("checked"), "false");
		Assert.assertEquals(txtOpcaoSete, "Every Sunday");
		Assert.assertEquals(driver.findElement(opcaoSete).getAttribute("checked"), "false");
		Assert.assertEquals(txtButtonCancel, "Cancel");
		Assert.assertEquals(txtButtonOK, "OK");
		driver.findElement(opcaoDois).click();
		driver.findElement(opcaoUm).click();
		Assert.assertEquals(driver.findElement(opcaoUm).getAttribute("checked"), "true");
		Assert.assertEquals(driver.findElement(opcaoDois).getAttribute("checked"), "false");
		Assert.assertEquals(driver.findElement(opcaoTres).getAttribute("checked"), "false");
		Assert.assertEquals(driver.findElement(opcaoQuatro).getAttribute("checked"), "true");
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		Assert.assertEquals(driver.findElement(title).getText(), "App/Alert Dialogs");
	}
	
	@Test
	public void TextEntryDialogTest() {
		final By lblName = AppiumBy.id("io.appium.android.apis:id/username_view");
		final By editTextName = AppiumBy.id("io.appium.android.apis:id/username_edit");
		final By lblPassword = AppiumBy.id("io.appium.android.apis:id/password_view");
		final By editTextPassword = AppiumBy.id("io.appium.android.apis:id/password_edit");
		final By btnCancel = AppiumBy.id("android:id/button2");
		final By btnOK = AppiumBy.id("android:id/button1");
		
	
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("Text Entry dialog")).click();
		String txtTitulo = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
		Assert.assertEquals(txtTitulo, "Text Entry dialog");
		Assert.assertEquals(driver.findElement(lblName).getText(), "Name:");
		Assert.assertEquals(driver.findElement(editTextName).getText(), "");
		Assert.assertEquals(driver.findElement(lblPassword).getText(), "Password:");
		Assert.assertEquals(driver.findElement(editTextPassword).getText(), "");
		Assert.assertEquals(driver.findElement(btnCancel).getText(), "Cancel");
		Assert.assertEquals(driver.findElement(btnOK).getText(), "OK");
		driver.findElement(editTextName).sendKeys("Teste Envio Palavras");
		driver.findElement(editTextPassword).sendKeys("Senha123");
		driver.findElement(btnOK).click();
		Assert.assertEquals(driver.findElement(title).getText(), "App/Alert Dialogs");
		driver.findElement(AppiumBy.accessibilityId("Text Entry dialog")).click();
		Assert.assertEquals(driver.findElement(editTextName).getText(), "Teste Envio Palavras");
		Assert.assertEquals(driver.findElement(editTextPassword).getText(), "••••••••");
	}
	
	@Test
	public void CancelOkTraditionalTest() {
		final By tituloPopUp = AppiumBy.id("android:id/alertTitle");
		final By btnCancel = AppiumBy.id("android:id/button2");
		final By btnOK = AppiumBy.id("android:id/button1");
		
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with traditional theme")).click();
		Assert.assertEquals(driver.findElement(tituloPopUp), "Lorem ipsum dolor sit aie consectetur adipiscing\nPlloaso mako nuto siwuf cakso dodtos anr koop.");
		Assert.assertEquals(driver.findElement(btnCancel).getText(), "Cancel");
		Assert.assertEquals(driver.findElement(btnOK).getText(), "OK");
		driver.findElement(btnCancel).click();
		Assert.assertEquals(driver.findElement(title).getText(), "App/Alert Dialogs");
	}
	
	@Test
	public void CancelOkHoloLightTemeTest() {
		final By tituloPopUp = AppiumBy.id("android:id/alertTitle");
		final By btnCancel = AppiumBy.id("android:id/button2");
		final By btnOK = AppiumBy.id("android:id/button1");
		
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with Holo Light theme")).click();
		Assert.assertEquals(driver.findElement(tituloPopUp), "Lorem ipsum dolor sit aie consectetur adipiscing\nPlloaso mako nuto siwuf cakso dodtos anr koop.");
		Assert.assertEquals(driver.findElement(btnCancel).getText(), "Cancel");
		Assert.assertEquals(driver.findElement(btnOK).getText(), "OK");
		driver.findElement(btnCancel).click();
		Assert.assertEquals(driver.findElement(title).getText(), "App/Alert Dialogs");
	}

}
