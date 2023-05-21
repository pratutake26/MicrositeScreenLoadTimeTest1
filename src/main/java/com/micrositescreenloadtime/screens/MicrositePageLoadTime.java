package com.micrositescreenloadtime.screens;



import com.micrositescreenloadtime.testbase.MicrositeScreenBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Objects;

import static com.micrositescreenloadtime.screens.MicrositeScreenConstants.AllStudentBanner;



public class MicrositePageLoadTime extends MicrositeScreenBase {
    public static long startTime;


    public MicrositePageLoadTime() throws FileNotFoundException {
        super();
        PageFactory.initElements(driver, this);
    }
    public void intiallTime(){
        startTime = System.currentTimeMillis();
    }

    public void pageBanner(String student){


        if(Objects.equals(student,"Student")) {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(AllStudentBanner));
            // Capture time after page load
            long endTime = System.currentTimeMillis();
            // Compute time
            long loadingTime = endTime - startTime;
            System.out.println("Student Landing Page load time in seconds: " + loadingTime/1000);

        }
        else if(Objects.equals(student,"Teacher")){
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.elementToBeClickable(AllStudentBanner));
            // Capture time after page load
            long endTime = System.currentTimeMillis();
            // Compute time
            long loadingTime = endTime - startTime;
            System.out.println("Teacher Landing Page load time in seconds: " + loadingTime/1000);
        }


    }
}

