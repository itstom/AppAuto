
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomascruz
 */
public class misc extends base {
    
    public static void main (String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
}
