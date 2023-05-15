package com.micrositescreenloadtimeqa.testcases;

import com.micrositescreenloadtime.screens.MicrositePageLoadTime;
import com.micrositescreenloadtime.screens.MicrositeScreenConstants;
import com.micrositescreenloadtime.testbase.MicrositeScreenBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MicrositeDailySignoffScreenLoadTime extends MicrositeScreenBase {

    MicrositePageLoadTime MPLT;
    MicrositeScreenConstants MSC;
    public MicrositeDailySignoffScreenLoadTime() throws FileNotFoundException {
        super();
        PageFactory.initElements(driver, this);
    }
    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization();
        MPLT = new MicrositePageLoadTime();
        MSC = new MicrositeScreenConstants();
    }

    @Test(priority = 1)
    public void sikkimStudentTimeTest(){
        String Student = "Student";
        MPLT.intiallTime();
        driver.get(prop.getProperty("SKSurl"));
        System.out.println("Sikkim Student Landing Page Microsite");
        MPLT.pageBanner(Student);
    }
    @Test(priority = 2)
    public void sikkimTeacherTimeTest(){
        String Teacher = "Teacher";
        MPLT.intiallTime();
        driver.get(prop.getProperty("SKTurl"));
        System.out.println("Sikkim Teacher Landing Page Microsite");
        MPLT.pageBanner(Teacher);
    }
    @Test(priority = 3)
    public void chhattisgarhStudentTimeTest(){
        String Student = "Student";
        MPLT.intiallTime();
        driver.get(prop.getProperty("CHSurl"));
        System.out.println("Chhattisgarh Student Landing Page Microsite");
        MPLT.pageBanner(Student);
    }
    @Test(priority = 4)
    public void chhattisgarhTeacherTimeTest(){
        String Teacher = "Teacher";
        MPLT.intiallTime();
        driver.get(prop.getProperty("CHTurl"));
        System.out.println("Chhattisgarh Teacher Landing Page Microsite");
        MPLT.pageBanner(Teacher);
    }

    @Test(priority = 5)
    public void networkSpeed() throws InterruptedException {
        driver.navigate().to("https://fast.com/");
        Thread.sleep(100000);
        driver.findElement(By.xpath("//span[@id='speed-progress-indicator-icon']")).click();

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



}
