$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Android.feature");
formatter.feature({
  "name": "Android",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wifi"
    }
  ]
});
formatter.scenario({
  "name": "Wifi Programlama",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wifi"
    }
  ]
});
formatter.step({
  "name": "Preference tiklanir",
  "keyword": "Then "
});
formatter.match({
  "location": "AppiumTest.stepdefination.WifiStepDefinations.preference_tiklanir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Preference dependencies tiklanir",
  "keyword": "Then "
});
formatter.match({
  "location": "AppiumTest.stepdefination.WifiStepDefinations.preference_dependencies_tiklanir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "WiFi check box aktif edilir.",
  "keyword": "Then "
});
formatter.match({
  "location": "AppiumTest.stepdefination.WifiStepDefinations.wifi_check_box_aktif_edilir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wifi Settings tiklanir",
  "keyword": "Then "
});
formatter.match({
  "location": "AppiumTest.stepdefination.WifiStepDefinations.wifi_Settings_tiklanir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Gelen ekrana \"Cok sükür Appium Bitti\" yazilir ve OK tiklanir",
  "keyword": "Then "
});
formatter.match({
  "location": "AppiumTest.stepdefination.WifiStepDefinations.gelen_ekrana_yazilir_ve_OK_tiklanir(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});