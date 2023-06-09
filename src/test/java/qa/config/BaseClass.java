package qa.config;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseClass {


    public AndroidDriver driver;


    @Parameters({"emulator","platformName","udid","deviceName","automationName"})
    @BeforeTest
    public void beforeTestt(String emulator,String platformName,String udid, String deviceName,String automationName) throws IOException, MalformedURLException {

        // capabilities to create appium session
        UiAutomator2Options options=new UiAutomator2Options();
        options.setCapability("platformName", platformName);
        options.setCapability("deviceName", deviceName);
        options.setCapability("udid", udid);
        URL url = new URL("http://127.0.0.1:4723");
        options.setCapability("automationName", automationName);
        options.setCapability("appPackage", "com.google.android.youtube");
        options.setCapability("appActivity","com.google.android.youtube.HomeActivity");

//        if(emulator.equalsIgnoreCase("true"))
//        {
            //	options.setCapability("avd", deviceName);
            //	options.setCapability("avdLaunchTimeout", 180000);


            // creating driver session
            driver=new AndroidDriver(url,options);
       // }


    }

    public AppiumDriver getDriver(){
        return driver;
    }
    public void waitForVisibility(WebElement e)
    {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void sendKeys(WebElement e, String txt)
    {
        waitForVisibility(e);
        e.sendKeys(txt);
    }

    public String getAttribute(WebElement e, String attribute)
    {
        waitForVisibility(e);
        return e.getAttribute(attribute);
    }

    public String getText(WebElement e)
    {
        String txt = null;
        txt = getAttribute(e, "text");

        return txt;
    }

    public void click(WebElement e, String txt)
    {
        waitForVisibility(e);
        e.click();
    }


}
