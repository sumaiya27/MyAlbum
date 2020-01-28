package com.vogella.maven.testngmaven;

import java.net.URL;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class MyAlbum_settings {
	
	static ///WebDriver driver;
	AppiumDriver<MobileElement>driver;
	static AndroidDriver<MobileElement> driver1;


	public static void main(String[] args) {

		
		try {
			login();
		}catch(Exception exp) 
		{
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}			
	}
		
		public static void login() throws Exception{
			
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "AVD Nexus_5x_API_29");
			cap.setCapability("udid", "emulator-5554");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "10");
			cap.setCapability("appPackage", "jp.co.anysense.myalbum");
			cap.setCapability("appActivity", "jp.co.anysense.view.ui.activity.MainActivity_");
			cap.setCapability("unicodeKeyboard", true);
			
			
			URL url = new URL ("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, cap);
			System.out.println("Application Started....!");		
			
			MobileElement el1 = (MobileElement) driver.findElementById("com.android.permissioncontroller:id/permission_allow_button");
			el1.click();
			el1.click();
			el1.click();
			MobileElement el2 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/nextPageBtn");
			el2.click();
			el2.click();
			el2.click();
			MobileElement el3 = (MobileElement) driver.findElementById("android:id/button2");
			el3.click();
			System.out.println("Album creation page opens!");
			
			////Settings-Password///
			
			MobileElement el487 = (MobileElement) driver.findElementByAccessibilityId("開く");
			el487.click();
			MobileElement el594 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/_setting_text");
			el594.click();
			MobileElement el608 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/passcode");
			el608.click();
			MobileElement el723 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/passcodeEntryEdit");
			el723.sendKeys("1234");
			MobileElement el856 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/passcodeConfirmEdit");
			el856.click();
			el856.sendKeys("1234");
			MobileElement el978 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/hintEntryEdit");
			el978.sendKeys("12");
			MobileElement el102 = (MobileElement) driver.findElementById("android:id/button1");
			el102.click();
			MobileElement el115 = (MobileElement) driver.findElementById("android:id/button1");
			el115.click();
			Thread.sleep(3000);
			System.out.println("Password has beem set!");
			
			////Lock view opens////
			
			MobileElement el132 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/lockView");
			el132.click();
			MobileElement el242 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/lockView");
			el242.click();
			System.out.print("lock view has been set up!");
			Thread.sleep(3000);
			MobileElement el354 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/account");
			el354.click();
			Thread.sleep(3000);
			MobileElement el444 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]");
			el444.click();	
			System.out.print("All features have been tested!");
					
		}
}