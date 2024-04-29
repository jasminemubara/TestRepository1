package org.example;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static java.lang.Thread.sleep;

public class MobileApp {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        // ===setting capabilities===
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Xiaomi 23053RN02A");
        options.autoGrantPermissions();
        options.setCapability("platformName" , "Android");
        options.setCapability("platformVersion" , "13");
        options.setCapability("automationName", "UiAutomator2");
        options.setCapability("noreset" , false);
        options.setApp("C:\\Users\\DELL\\IdeaProjects\\FirstPractice\\src\\test\\java\\Resource1\\My DemoApp.apk");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);


      //////MENU/////
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"open menu\"]" +
                "/android.widget.ImageView")).click();

        /// If we have the only one locator for an element and it's also not unique,
        // means it's same for different elements then we can access element in this way
        //Thread.sleep(1000);
        //WebElement element = driver.findElement(new AppiumBy.ByAndroidUIAutomator("text(\"About\")"));
       // element.click();

        ///Navigation/Link/Url///
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//android.widget.TextView[@text=\"Go to the Sauce Labs website.\"]")).click();

        ////Popup/////

        WebElement element = driver.findElement(new AppiumBy.ByAndroidUIAutomator("text(\"Log Out\")"));
        element.click();
        Thread.sleep(1000);
        driver.findElement(By.id("android:id/button1")).click();
        driver.findElement(By.id("android:id/button1")).click();



        /////Product Clicking////
//

//        driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"store item\"])[5]/android.view.ViewGroup[1]/android.widget.ImageView")).click();
//        Thread.sleep(100);
//
//        /////Select color and quantity////
//
//        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"black circle\"]" +
//                "/android.view.ViewGroup")).click();
//
//        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"counter plus button\"]" +
//                "/android.widget.ImageView")).click();
//        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"counter plus button\"]" +
//                "/android.widget.ImageView")).click();
//        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"counter plus button\"]" +
//                "/android.widget.ImageView")).click();
//
//        ///// ADD TO CART///
//
//        driver.findElement(AppiumBy.accessibilityId("Add To Cart button")).click();
//
//        ////View Cart, Decrease Quantity///
//
//        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"cart badge\"]" +
//                "/android.widget.ImageView")).click();
//
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"counter minus button\"]" +
//                "/android.widget.ImageView")).click();
//        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"counter minus button\"]" +
//                "/android.widget.ImageView")).click();
//
//
//        ////Proceed to Checkout And Login//
//
//       driver.findElement(AppiumBy.accessibilityId("Proceed To Checkout button")).click();
//
//       driver.findElement(AppiumBy.accessibilityId("Username input field")).sendKeys("bob@example.com");
//       driver.findElement(AppiumBy.accessibilityId("Password input field")).sendKeys("10203040");
//       driver.findElement(AppiumBy.accessibilityId("Login button")).click();
//
//
//       /////Shipping and billing details/////
//        Thread.sleep(1000);
//
//        driver.findElement(AppiumBy.accessibilityId("Full Name* input field")).sendKeys("Mubarra Jabbar");
//        driver.findElement(AppiumBy.accessibilityId("Address Line 1* input field")).sendKeys("PCSIR Phase2");
//        driver.findElement(AppiumBy.accessibilityId("Address Line 2 input field")).sendKeys("Johar Town");
//        driver.findElement(AppiumBy.accessibilityId("City* input field")).sendKeys("Lahore");
//        driver.findElement(AppiumBy.accessibilityId("State/Region input field")).sendKeys("Punjab");
//        driver.findElement(AppiumBy.accessibilityId("Zip Code* input field")).sendKeys("54000");
//        driver.findElement(AppiumBy.accessibilityId("Country* input field")).sendKeys("Pakistan");
//
//        driver.findElement(AppiumBy.accessibilityId("To Payment button")).click();
//
//        Thread.sleep(1000);
//        driver.findElement(AppiumBy.accessibilityId("Full Name* input field")).sendKeys("Mubarra Jabbar");
//        driver.findElement(AppiumBy.accessibilityId("Card Number* input field")).sendKeys("4242424242424242");
//        driver.findElement(AppiumBy.accessibilityId("Expiration Date* input field")).sendKeys("12/26");
//        driver.findElement(AppiumBy.accessibilityId("Security Code* input field")).sendKeys("123");
//        driver.findElement(AppiumBy.accessibilityId("Review Order button")).click();
//
//Thread.sleep(1000);
//        driver.findElement(AppiumBy.accessibilityId("Place Order button")).click();










//        ==Thread.sleep and resource_id==
//        driver.findElement(By.id("android:id/text1")).click();
//        Thread.sleep(1000);
//        driver.navigate().back();
//
//        ==accessibility_id==
//        driver.findElement(new AppiumBy.ByAccessibilityId("Content")).click();
//        driver.navigate().back();


//        driver.findElement(new AppiumBy.ByAccessibilityId("Views")).click();
//
////      ====implicit wait====
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds((1000)));
//        driver.findElement(new AppiumBy.ByAccessibilityId("Controls")).click();
//        //driver.quit();
//
//        //======explicit wait=====
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable
//                (By.xpath("//android.widget.TextView[@content-desc=\"2. Dark Theme\"]")));
//        element.click();


//        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"2. Dark Theme\"]")).click();
//        driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("QA Jobs in Lahore");
////
////    ====check box====
//      driver.findElement(By.id("io.appium.android.apis:id/check1")).click();
////
////
////
////     ===radio button===
//       driver.findElement(By.id("io.appium.android.apis:id/radio1")).click();


        //=====dropdown=======

//        driver.findElement(new AppiumBy.ByAccessibilityId("Views")).click();
//        driver.findElement(new AppiumBy.ByAccessibilityId("Controls")).click();
//        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"2. Dark Theme\"]")).click();
//        driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
//        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Saturn\"]")).click();

        //=====scroll App======

//        driver.findElement(new AppiumBy.ByAccessibilityId("Views")).click();
//        driver.findElement(new AppiumBy.ByAndroidUIAutomator
//                ("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector()" +
//                        ".textContains(\"TextSwitcher\").instance(0))"));



        //========screenshot=======


//        driver.findElement(By.id("android:id/text1")).click();
//        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        String sspath = "C:\\Users\\DELL\\Downloads\\ViewFile.png";
//        screenshot.renameTo(new File(sspath));


    }
}
