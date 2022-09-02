package AppiumTest.stepdefination;


import AppiumTest.page.WifiPage;
import io.cucumber.java.en.Then;

public class WifiStepDefinations {
    WifiPage wifiPage=new WifiPage();
    @Then("Preference tiklanir")
    public void preference_tiklanir() throws InterruptedException {
       wifiPage.preference.click();
       Thread.sleep(5000);
    }



    @Then("Preference dependencies tiklanir")
    public void preference_dependencies_tiklanir() {
        wifiPage.prefen3.click();
    }
    @Then("WiFi check box aktif edilir.")
    public void wifi_check_box_aktif_edilir() {
        wifiPage.checkBox.click();
    }
    @Then("Wifi Settings tiklanir")
    public void wifi_Settings_tiklanir() {
        wifiPage.wifiSettings.click();
    }
    @Then("Gelen ekrana {string} yazilir ve OK tiklanir")
    public void gelen_ekrana_yazilir_ve_OK_tiklanir(String appium) throws InterruptedException {
        wifiPage.editText.sendKeys(appium);
        Thread.sleep(6000);
        wifiPage.okButton.click();
    }


}



