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

public class MicrositePageLoadTimeTest extends MicrositeScreenBase {

    MicrositePageLoadTime MPLT;
    MicrositeScreenConstants MSC;
    public MicrositePageLoadTimeTest() throws FileNotFoundException {
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
    public void madhyaPradeshStudentTimeTest() throws InterruptedException {
        String Student = "Student";
        MPLT.intiallTime();
        driver.get(prop.getProperty("MSurl"));
        System.out.println("MadhyaPradesh Student Landing Page Microsite");
        MPLT.pageBanner(Student);
    }
    @Test(priority = 2)
    public void madhyaPradeshTeacherTimeTest(){
        String Teacher = "Teacher";
        MPLT.intiallTime();
        driver.get(prop.getProperty("MTurl"));
        System.out.println("MadhyaPradesh Teacher Landing Page Microsite");
        MPLT.pageBanner(Teacher);
    }
    @Test(priority = 3)
    public void goaStudentTimeTest(){
        String Student = "Student";
        MPLT.intiallTime();
        driver.get(prop.getProperty("GSurl"));
        System.out.println("Goa Student Landing Page Microsite");
        MPLT.pageBanner(Student);
    }
    @Test(priority = 4)
    public void goaTeacherTimeTest(){
        String Teacher = "Teacher";
        MPLT.intiallTime();
        driver.get(prop.getProperty("GTurl"));
        System.out.println("Goa Teacher Landing Page Microsite");
        MPLT.pageBanner(Teacher);
    }
    @Test(priority = 5)
    public void assamStudentTimeTest(){
        String Student = "Student";
        MPLT.intiallTime();
        driver.get(prop.getProperty("ASurl"));
        System.out.println("Assam Student Landing Page Microsite");
        MPLT.pageBanner(Student);
    }
    @Test(priority = 6)
    public void assamTeacherTimeTest(){
        String Teacher = "Teacher";
        MPLT.intiallTime();
        driver.get(prop.getProperty("ATurl"));
        System.out.println("Assam Teacher Landing Page Microsite");
        MPLT.pageBanner(Teacher);
    }
    @Test(priority = 7)
    public void biharStudentTimeTest(){
        String Student = "Student";
        MPLT.intiallTime();
        driver.get(prop.getProperty("BSurl"));
        System.out.println("Bihar Student Landing Page Microsite");
        MPLT.pageBanner(Student);
    }
    @Test(priority = 8)
    public void biharTeacherTimeTest(){
        String Teacher = "Teacher";
        MPLT.intiallTime();
        driver.get(prop.getProperty("BTurl"));
        System.out.println("Bihar Teacher Landing Page Microsite");
        MPLT.pageBanner(Teacher);
    }
    @Test(priority = 9)
    public void nagalandStudentTimeTest(){
        String Student = "Student";
        MPLT.intiallTime();
        driver.get(prop.getProperty("NSurl"));
        System.out.println("Nagaland Student Landing Page Microsite");
        MPLT.pageBanner(Student);
    }
    @Test(priority = 10)
    public void nagalandTeacherTimeTest(){
        String Teacher = "Teacher";
        MPLT.intiallTime();
        driver.get(prop.getProperty("NTurl"));
        System.out.println("Nagaland Teacher Landing Page Microsite");
        MPLT.pageBanner(Teacher);
    }
    @Test(priority = 11)
    public void uttarakhandStudentTimeTest(){
        String Student = "Student";
        MPLT.intiallTime();
        driver.get(prop.getProperty("USurl"));
        System.out.println("uttarakhand Student Landing Page Microsite");
        MPLT.pageBanner(Student);
    }
    @Test(priority = 12)
    public void uttarakhandTeacherTimeTest(){
        String Teacher = "Teacher";
        MPLT.intiallTime();
        driver.get(prop.getProperty("UTurl"));
        System.out.println("uttarakhand Teacher Landing Page Microsite");
        MPLT.pageBanner(Teacher);
    }
    @Test(priority = 13)
    public void himachalPradeshStudentTimeTest(){
        String Student = "Student";
        MPLT.intiallTime();
        driver.get(prop.getProperty("HSurl"));
        System.out.println("Himachal Pradesh Student Landing Page Microsite");
        MPLT.pageBanner(Student);
    }
    @Test(priority = 14)
    public void himachalPradeshTeacherTimeTest(){
        String Teacher = "Teacher";
        MPLT.intiallTime();
        driver.get(prop.getProperty("HTurl"));
        System.out.println("HimachalPradesh Teacher Landing page Microsite");
        MPLT.pageBanner(Teacher);
    }
    @Test(priority = 15)
    public void uttarPradeshStudentTimeTest(){
        String Student = "Student";
        MPLT.intiallTime();
        driver.get(prop.getProperty("UTSurl"));
        System.out.println("uttarPradesh Student Landing Page Microsite");
        MPLT.pageBanner(Student);
    }
    @Test(priority = 16)
    public void uttarPradeshTeacherTimeTest(){
        String Teacher = "Teacher";
        MPLT.intiallTime();
        driver.get(prop.getProperty("UTTurl"));
        System.out.println("uttarPrades Teacher Landing Page Microsite");
        MPLT.pageBanner(Teacher);
    }
    @Test(priority = 17)
    public void haryanaStudentTimeTest(){
        String Student = "Student";
        MPLT.intiallTime();
        driver.get(prop.getProperty("HARSurl"));
        System.out.println("Haryana Student Landing Page Microsite");
        MPLT.pageBanner(Student);
    }
    @Test(priority = 18)
    public void haryanaTeacherTimeTest(){
        String Teacher = "Teacher";
        MPLT.intiallTime();
        driver.get(prop.getProperty("HARTurl"));
        System.out.println("Haryana Teacher Landing Page Microsite");
        MPLT.pageBanner(Teacher);
    }
    @Test(priority = 19)
    public void punjabStudentTimeTest(){
        String Student = "Student";
        MPLT.intiallTime();
        driver.get(prop.getProperty("PSurl"));
        System.out.println("Punjab Student Landing Page Microsite");
        MPLT.pageBanner(Student);
    }
    @Test(priority = 20)
    public void punjabTeacherTimeTest(){
        String Teacher = "Teacher";
        MPLT.intiallTime();
        driver.get(prop.getProperty("PTurl"));
        System.out.println("Punjab Teacher Landing Page Microsite");
        MPLT.pageBanner(Teacher);
    }
    @Test(priority = 21)
    public void karnatakaStudentTimeTest(){
        String Student = "Student";
        MPLT.intiallTime();
        driver.get(prop.getProperty("KSurl"));
        System.out.println("Karnataka Student Landing Page Microsite");
        MPLT.pageBanner(Student);
    }
    @Test(priority = 22)
    public void karnatakaTeacherTimeTest(){
        String Teacher = "Teacher";
        MPLT.intiallTime();
        driver.get(prop.getProperty("KTurl"));
        System.out.println("Karnataka Teacher Landing Page Microsite");
        MPLT.pageBanner(Teacher);
    }
    @Test(priority = 23)
    public void rajasthanStudentTimeTest(){
        String Student = "Student";
        MPLT.intiallTime();
        driver.get(prop.getProperty("RSurl"));
        System.out.println("Rajasthan Student Landing Page Microsite");
        MPLT.pageBanner(Student);
    }
    @Test(priority = 24)
    public void rajasthanTeacherTimeTest(){
        String Teacher = "Teacher";
        MPLT.intiallTime();
        driver.get(prop.getProperty("RTurl"));
        System.out.println("uttarPrades Teacher Landing Page Microsite");
        MPLT.pageBanner(Teacher);
    }
    @Test(priority = 25)
    public void networkSpeed() throws InterruptedException {
        driver.navigate().to("https://fast.com/");
        driver.findElement(By.xpath("//span[@id='speed-progress-indicator-icon']")).click();
        Thread.sleep(60000);
    }



    @AfterMethod
    public void tearDown(){

        driver.quit();
    }


}
