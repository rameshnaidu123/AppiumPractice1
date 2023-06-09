package qa.tests;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import org.testng.annotations.Test;
import qa.config.BaseClass;
import qa.pages.HomePage;

public class Sample extends BaseClass {

    @Test
    public void run(){

        HomePage hp=new HomePage(driver);
       // driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Library\"]")).click();
        // kdriver.findElement(AppiumBy.accessibilityId(""));
        click(hp.getLibrary(),"");
        click(hp.getAccountProfile(),"");
        System.out.println(getAttribute(hp.getUserName(),"text"));
        click(hp.getClose(),"");
        click(hp.getWatchLater(),"");
        click(hp.getClickOnVideo(),"");



    }
}
