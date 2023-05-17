package com.micrositescreenloadtime.testbase;

import com.google.common.collect.ImmutableMap;
import com.micrositescreenloadtime.utils.MicrositeScreenUtil;
import com.micrositescreenloadtime.utils.WebEventListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.Response;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class MicrositeScreenBase {
    public static Properties prop;
    public static EventFiringWebDriver e_driver;
    public static WebDriver driver;

    public static WebEventListener eventListener;

    public MicrositeScreenBase() throws FileNotFoundException {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("/Users/seekekrishna/Documents/MicrositeScreenLoadTime/MicrositeScreenLoadTime/src/main/java/com/micrositescreenloadtime/config/config.properties");
            prop.load(ip);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    public static void initialization() throws IOException {
//        System.setProperty("webdriver.chrome.driver", "/Users/seekekrishna/Documents/selenium/chromedriver");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().pageLoadTimeout(MicrositeScreenUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(MicrositeScreenUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
//        e_driver = new EventFiringWebDriver(driver);
//        // Now create object of EventListerHandler to register it with EventFiringWebDriver
//        eventListener = new WebEventListener();
//        e_driver.register(eventListener);
//        driver = e_driver;
//        setNetworkConditions(500000, 500000); // Set network conditions
//
//        //driver.get("https://preprod.embibe.com/uttarpradesh/educator/in-en/");
//
//    }
//
//    private static void setNetworkConditions(int downloadThroughput, int uploadThroughput) throws IOException {
//        if (downloadThroughput > 0 && uploadThroughput > 0) {
//            CommandExecutor executor = ((ChromeDriver) driver).getCommandExecutor();
//
//            Map<String, Object> map = new HashMap<>();
//            map.put("offline", false);
//            map.put("latency", 5);
//            map.put("download_throughput", downloadThroughput); // Convert to Kb/s
//            map.put("upload_throughput", uploadThroughput); // Convert to Kb/s
//            Response response = executor.execute(new Command(((ChromeDriver) driver).getSessionId(), "setNetworkConditions",
//                    ImmutableMap.of("network_conditions", ImmutableMap.copyOf(map))));
//        }
//    }


    public static void initialization() throws IOException {
        System.setProperty("webdriver.chrome.driver", "/Users/seekekrishna/Documents/selenium/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(MicrositeScreenUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(MicrositeScreenUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        e_driver = new EventFiringWebDriver(driver);
        // Now create an object of WebEventListener to register it with EventFiringWebDriver
        eventListener = new WebEventListener();
        e_driver.register(eventListener);
        driver = e_driver;
        setNetworkConditions(e_driver, 260000, 260000); // Set network conditions


    }

    private static void setNetworkConditions(EventFiringWebDriver driver, int downloadThroughput, int uploadThroughput) throws IOException {
        if (downloadThroughput > 0 && uploadThroughput > 0) {
            WebDriver underlyingDriver = driver.getWrappedDriver();
            RemoteWebDriver remoteDriver = (RemoteWebDriver) underlyingDriver; // Cast to RemoteWebDriver

            CommandExecutor executor = remoteDriver.getCommandExecutor();

            Map<String, Object> map = new HashMap<>();
            map.put("offline", false);
            map.put("latency", 5);
            map.put("download_throughput", downloadThroughput); // Convert to Kb/s
            map.put("upload_throughput", uploadThroughput); // Convert to Kb/s
            Response response = executor.execute(new Command(remoteDriver.getSessionId(), "setNetworkConditions",
                    ImmutableMap.of("network_conditions", ImmutableMap.copyOf(map))));
        }
    }




}
