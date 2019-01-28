
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomascruz
 */
public class gestures extends base {
    
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        //Tapping into device
        TouchAction t = new TouchAction(driver);
        Thread.sleep(5000L);
        WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@content-desc='Expandable Lists']");
        t.tap(tapOptions().withElement(element(expandList))).perform();
        driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
        WebElement pn = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
        t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
        Thread.sleep(5000L);
        System.out.println(driver.findElementById("android:id/alertTitle").getText());
        
        
        
    
}
    
    }
