package driver;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Hooks {
	
	public static AppiumDriver driver;
	
	public static Hooks suNavegador() {
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName","R58M65XQ1CP");
            capabilities.setCapability("udid","R58M65XQ1CP");
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("appPackage","tv.twitch.android.app");
            capabilities.setCapability("appActivity","tv.twitch.android.app.core.LandingActivity");
            capabilities.setCapability("noReset","true");
            capabilities.setCapability("platformVersion","10.0");
            
            driver = new AppiumDriver(new URL("http://192.168.20.20:4723/wd/hub"),capabilities);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Hooks();
		
	}
	public AppiumDriver on(){
        return driver;
    }

}
