package com.vogella.maven.testngmaven;

import java.net.URL;
import org.testng.annotations.*;

import org.openqa.selenium.Keys;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class gmail_login {
	
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
			cap.setCapability("appPackage", "com.google.android.gm");
			cap.setCapability("appActivity", "com.google.android.gm.ConversationListActivityGmail");
			cap.setCapability("unicodeKeyboard", true);
			
			
			URL url = new URL ("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url, cap);
			System.out.println("Application Started....!");
			
			MobileElement el1 = (MobileElement) driver.findElementById("com.google.android.gm:id/welcome_tour_got_it");
			el1.click();
			Thread.sleep(4500);
			MobileElement el2 = (MobileElement) driver.findElementById("com.google.android.gm:id/action_done");
			el2.click();
			Thread.sleep(3000);
			MobileElement el3 = (MobileElement) driver.findElementById("com.google.android.gm:id/gm_dismiss_button");
			el3.click();
			Thread.sleep(3000);
			MobileElement el4 = (MobileElement) driver.findElementById("com.google.android.gm:id/gm_dismiss_button");
			el4.click();
			Thread.sleep(3000);
			MobileElement el5 = (MobileElement) driver.findElementById("com.google.android.gm:id/conversation_list_folder_header");
			el5.click();
			el5.sendKeys("password"+"\n");
			
			
		}
			
}

