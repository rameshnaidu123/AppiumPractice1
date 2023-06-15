package qa.tests;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import qa.config.BaseClass;
import qa.pages.HomePage;

import java.time.Duration;

public class Sample extends BaseClass {

    @Test
    public void run() throws InterruptedException {

        HomePage hp=new HomePage(driver);
      // WebElement ee= driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Library\"]"));
        // kdriver.findElement(AppiumBy.accessibilityId(""));
//        click(hp.getLibrary(),"");
//
//        click(hp.getAccountProfile(),"");
//        System.out.println(getAttribute(hp.getUserName(),"text"));
//
//        click(hp.getClose(),"");
//        System.out.println("3 after close "+driver.currentActivity());
//      //  click(hp.getWatchLater(),"");
//     //   click(hp.getClickOnVideo(),"")
//        click(hp.getHome_button(),"");
//
//        click(hp.getShorts_button(),"");
//        waitForActivity("com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivity");
//
//        clickCoordinate();
//
////        clickCoordinate();
//        Thread.sleep(1000);
////        click(hp.getShorts_button(),"");
//        scroll(224,528,340,880,"up");
//
//        scroll(224,528,340,880,"up");
//
//
//        scroll(224,528,340,880,"up");
//
//        scroll(333,489,336,898,"down");
//        Thread.sleep(1000);
//       // scroll(224,528,340,880,"down");
//
////        click(hp.getHome_button(),"");
////        click(hp.getSubcription_button(),"");   // 58 119  == l 224 top 528   wid 340   hei 880      311 963    319 701
////
////        click(hp.getHome_button(),"");

        System.out.println("terminate app : "+driver.terminateApp("com.arvind.storeapp"));
//        Thread.sleep(5000);
//        System.out.println("is app Installed : "+driver.isAppInstalled("com.arvind.storeapp"));
//        driver.activateApp("com.arvind.storeapp");
//        Thread.sleep(3000);
//        driver.activateApp("com.android.settings");
//
//      //  driver.runAppInBackground(Duration.ofSeconds(5));
//        System.out.println(driver.queryAppState("com.arvind.storeapp"));
//        Thread.sleep(3000);
//        //driver.activateApp("com.google.settings");
//        driver.activateApp("com.arvind.storeapp");
//        System.out.println(driver.queryAppState("com.arvind.storeapp"));
//       // driver.lockDevice();
        System.out.println("lock check : "+driver.isDeviceLocked());
        driver.navigate().back();
        driver.navigate().back();
        Thread.sleep(1000);
        //102 1140
        WebElement rr=driver.findElement(AppiumBy.accessibilityId("Photos"));
        driver.executeScript("mobile:swipeGesture",ImmutableMap.of(

                "left",350,
                "top",509,
                "width",360,
                "height",1050,
                "direction","down",
                "percent",0.80

        ));
      //345 1023 608



    }
}
