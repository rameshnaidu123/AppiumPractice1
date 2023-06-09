package qa.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import qa.config.BaseClass;

public class HomePage extends BaseClass {

    public HomePage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Library\"]")
    private WebElement library;

    @AndroidFindBy(id="com.google.android.youtube:id/mobile_topbar_avatar")
    private WebElement accountProfile;

    @AndroidFindBy(id="com.google.android.youtube:id/account_name")
    private WebElement userName;

    @AndroidFindBy(accessibility="Close")
    private WebElement close;

    @AndroidFindBy(accessibility = "Home")
    private WebElement home_button;

    public WebElement getHome_button() {
        return home_button;
    }

    public WebElement getShorts_button() {
        return shorts_button;
    }

    public WebElement getSubcription_button() {
        return subcription_button;
    }

    @AndroidFindBy(accessibility = "Shorts")
    private WebElement shorts_button;

    @AndroidFindBy(accessibility = "Subscriptions: New content is available")
    private WebElement subcription_button;




    public WebElement getWatchLater() {
        return watchLater;
    }

    @AndroidFindBy(xpath="(//android.widget.TextView[@resource-id='com.google.android.youtube:id/subtitle'])[3]")
    private WebElement watchLater;

    @AndroidFindBy(xpath="(//android.widget.TextView[@resource-id='com.google.android.youtube:id/title'])[2]")
    private WebElement clickOnVideo;

    public WebElement getClickOnVideo() {
        return clickOnVideo;
    }

    public WebElement getClose() {
        return close;
    }

    public WebElement getAccountProfile() {
        return accountProfile;
    }

    public WebElement getUserName() {
        return userName;
    }
    public WebElement getLibrary() {
        return library;
    }




}
