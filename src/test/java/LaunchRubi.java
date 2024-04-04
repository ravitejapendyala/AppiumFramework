import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class LaunchRubi {




    public static void main(String[] args) throws MalformedURLException, InterruptedException {

String appUrl = System.getProperty("user.dir")+ File.separator+"src"+ File.separator+"main"+ File.separator+"resources"+ File.separator+"Rubi.apk";
//        String appUrl = System.getProperty("user.dir")+ File.separator+"src"+ File.separator+"main"+ File.separator+"resources"+ File.separator+"Calculator.apk";
        UiAutomator2Options opt = new UiAutomator2Options().
                setDeviceName("pixel_7_pro").
                setAutomationName("UiAutomator2").
                setApp(appUrl);

        URL url = new URL("http://0.0.0.0:4723");

        AppiumDriver driver = new AndroidDriver(url,opt);
        Thread.sleep(5000);
        driver.findElement(By.className("android.view.ViewGroup")).click();

        Thread.sleep(2000);
        //cdwmobileqa
//Quality2
        driver.findElement(By.xpath("//android.widget.EditText[@hint='USERNAME']")).sendKeys("cdwmobileqa");
        driver.findElement(By.xpath("//android.widget.EditText[@hint='PASSWORD']")).sendKeys("blu");
        driver.findElement(By.className("android.widget.Button")).click();
        Thread.sleep(2000);


    }

}
