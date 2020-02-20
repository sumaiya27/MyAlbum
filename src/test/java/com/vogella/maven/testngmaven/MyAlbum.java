package com.vogella.maven.testngmaven;

import java.net.URL;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class MyAlbum {
	
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
			
			////Album creation////

			MobileElement el4 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/add_btn");
			el4.click();
			MobileElement el5 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/edit_text");
			el5.sendKeys("testone");
			MobileElement el6 = (MobileElement) driver.findElementById("android:id/button1");
			el6.click();
			System.out.println("First Album created!");
			MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("アルバム追加");
			el7.click();
			MobileElement el8 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/edit_text");
			el8.click();
			el8.sendKeys("testtwo");
			MobileElement el9 = (MobileElement) driver.findElementById("android:id/button1");
			el9.click();
			System.out.println("Second Album created!");
			
			////Editing Album////
			
			////picture adding in first album///
			
			MobileElement el70 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/item_img");
			el70.click();
			MobileElement el80 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/add_btn");
			el80.click();
			Thread.sleep(3000);
			MobileElement el90 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[4]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView");
			el90.click();
			MobileElement el100 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/selectButton");
			el100.click();
			MobileElement el111 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
			el111.click();

			
			///picture adding in second album///
			
			
			MobileElement el10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.GridView/android.widget.RelativeLayout[2]/android.widget.ImageView");
			el10.click();
			MobileElement el11 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/add_btn");
			el11.click();
			
			System.out.print("album picture is getting selected!");
			Thread.sleep(3000);
			MobileElement el134 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView");
			el134.click();
			Thread.sleep(3000);
			MobileElement el244 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView");
			el244.click();
			Thread.sleep(3000);
			MobileElement el356 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/selectButton");
			el356.click();
			MobileElement el478 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
			el478.click();
			System.out.print("Albums are created!");
			
			///Deleting Album///
			
			Thread.sleep(3000);
			
			MobileElement el888 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/empty");
			el888.click();
			Thread.sleep(3000);
			MobileElement el999 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
			el999.click();
			Thread.sleep(3000);
			MobileElement el101 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/item_img");
			el101.click();
			Thread.sleep(3000);
			MobileElement el1111 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/librayDeleteButton");
			el1111.click();
			Thread.sleep(3000);
			MobileElement el1212 = (MobileElement) driver.findElementById("android:id/button1");
			el1212.click();
			System.out.println(" First Album got deleted!");
		
			
			
			///Add photo inside an album////
			
			Thread.sleep(3000);
			MobileElement el189 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/item_img");
			el189.click();
			MobileElement el252 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/empty");
			el252.click();
			MobileElement el378 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
			el378.click();
			Thread.sleep(3000);
			MobileElement el434 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[4]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView");
			el434.click();
			MobileElement el567 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/selectButton");
			el567.click();			
			System.out.println("Added photo to an album!");			
			
			////Album Settings////
			
			Thread.sleep(3000);
			MobileElement el22 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/empty");
			el22.click();
			Thread.sleep(3000);
			MobileElement el23 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
			el23.click();
			MobileElement el24 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/coverChangeBtn");
			el24.click();
			MobileElement el25 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.RelativeLayout[3]/android.widget.ImageView");
			el25.click();
			MobileElement el26 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/albumName");
			el26.click();
			el26.sendKeys("test3");
			MobileElement el27 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/saveBtn");
			el27.click();
			MobileElement el28 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
			el28.click();
			System.out.println("Album cover and title got changed!");
			
			
		   ///Checking Delete ////
			
		   
			MobileElement el188 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/item_img");
			el188.click();
			System.out.print("Check third album got selected!");
			Thread.sleep(3000);		
			MobileElement el561 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/empty");
			el561.click();
			System.out.println("Top Right button selected!");
			MobileElement el190 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout");
			el190.click();
			Thread.sleep(3000);
			MobileElement el290 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[1]/android.widget.ImageView");
			el290.click();
			MobileElement el390 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/librayDeleteButton");
			el390.click();
			MobileElement el490 = (MobileElement) driver.findElementById("android:id/button1");
			el490.click();
			System.out.println("Picture got deleted!");
			
			////Checking Save Option///
			
			Thread.sleep(3000);
			MobileElement el562 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/empty");
			el562.click();
			Thread.sleep(3000);
			MobileElement el176 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout");
			el176.click();
			MobileElement el287 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[1]/android.widget.ImageView");
			el287.click();
			MobileElement el397 = (MobileElement) driver.findElementById("jp.co.anysense.myalbum:id/librayDeleteButton");
			el397.click();
			MobileElement el498 = (MobileElement) driver.findElementById("android:id/button1");
			el498.click();
			System.out.print("Photo got saved!");
			MobileElement el88 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
			el88.click();
			System.out.print("All options from dropdown are done!");
		
			///Settings-Password///
			
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
			Thread.sleep(3000);
			MobileElement el1123 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
			el1123.click();
			System.out.print("All features have been tested!");
}
}
