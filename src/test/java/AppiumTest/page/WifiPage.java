package AppiumTest.page;

import AppiumTest.utulities.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class WifiPage {
    public WifiPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()),this);
    }
    @AndroidFindBy(accessibility = "Preference")
    public WebElement preference;
    @AndroidFindBy(accessibility = "3. Preference dependencies")
    public WebElement prefen3;

    @AndroidFindBy(id ="android:id/checkbox" )
    public WebElement checkBox;

    @AndroidFindBy(xpath = "//*[@text=\"WiFi settings\"]")
    public WebElement wifiSettings;

    @AndroidFindBy(id ="android:id/edit")
    public WebElement editText;
    @AndroidFindBy(id = "android:id/button1")
    public WebElement okButton;


}



/*
//todo home work deki locatler
        driver.findElementByAccessibilityId("Preference").click();
        driver.findElementByAccessibilityId("3. Preference dependencies").click();
        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("//[@text="WiFi settings"]")).click();
        driver.findElement(By.id("android:id/edit")).sendKeys("appium cok guzel");
        driver.findElement(By.id("android:id/button1")).click();
        driver.findElement(By.xpath("//[@text="WiFi settings"]")).click();

        System.out.println("driver.findElement(By.id("android:id/edit")).getText() = "
                + driver.findElement(By.id("android:id/edit")).getText());
    }
 */