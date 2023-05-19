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
//
//    @Test(priority = 1)
//    public void madhyaPradeshStudentTimeTest() throws InterruptedException {
//        String Student = "Student";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("MSurl"));
//        System.out.println("MadhyaPradesh Student Landing Page Microsite");
//        MPLT.pageBanner(Student);
//    }
//    @Test(priority = 2)
//    public void madhyaPradeshTeacherTimeTest(){
//        String Teacher = "Teacher";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("MTurl"));
//        System.out.println("MadhyaPradesh Teacher Landing Page Microsite");
//        MPLT.pageBanner(Teacher);
//    }
//    @Test(priority = 3)
//    public void goaStudentTimeTest(){
//        String Student = "Student";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("GSurl"));
//        System.out.println("Goa Student Landing Page Microsite");
//        MPLT.pageBanner(Student);
//    }
//    @Test(priority = 4)
//    public void goaTeacherTimeTest(){
//        String Teacher = "Teacher";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("GTurl"));
//        System.out.println("Goa Teacher Landing Page Microsite");
//        MPLT.pageBanner(Teacher);
//    }
//    @Test(priority = 5)
//    public void assamStudentTimeTest(){
//        String Student = "Student";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("ASurl"));
//        System.out.println("Assam Student Landing Page Microsite");
//        MPLT.pageBanner(Student);
//    }
//    @Test(priority = 6)
//    public void assamTeacherTimeTest(){
//        String Teacher = "Teacher";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("ATurl"));
//        System.out.println("Assam Teacher Landing Page Microsite");
//        MPLT.pageBanner(Teacher);
//    }
//    @Test(priority = 7)
//    public void biharStudentTimeTest(){
//        String Student = "Student";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("BSurl"));
//        System.out.println("Bihar Student Landing Page Microsite");
//        MPLT.pageBanner(Student);
//    }
//    @Test(priority = 8)
//    public void biharTeacherTimeTest(){
//        String Teacher = "Teacher";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("BTurl"));
//        System.out.println("Bihar Teacher Landing Page Microsite");
//        MPLT.pageBanner(Teacher);
//    }
//    @Test(priority = 9)
//    public void nagalandStudentTimeTest(){
//        String Student = "Student";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("NSurl"));
//        System.out.println("Nagaland Student Landing Page Microsite");
//        MPLT.pageBanner(Student);
//    }
//    @Test(priority = 10)
//    public void nagalandTeacherTimeTest(){
//        String Teacher = "Teacher";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("NTurl"));
//        System.out.println("Nagaland Teacher Landing Page Microsite");
//        MPLT.pageBanner(Teacher);
//    }
//    @Test(priority = 11)
//    public void uttarakhandStudentTimeTest(){
//        String Student = "Student";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("USurl"));
//        System.out.println("uttarakhand Student Landing Page Microsite");
//        MPLT.pageBanner(Student);
//    }
//    @Test(priority = 12)
//    public void uttarakhandTeacherTimeTest(){
//        String Teacher = "Teacher";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("UTurl"));
//        System.out.println("uttarakhand Teacher Landing Page Microsite");
//        MPLT.pageBanner(Teacher);
//    }
//    @Test(priority = 13)
//    public void himachalPradeshStudentTimeTest(){
//        String Student = "Student";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("HSurl"));
//        System.out.println("Himachal Pradesh Student Landing Page Microsite");
//        MPLT.pageBanner(Student);
//    }
//    @Test(priority = 14)
//    public void himachalPradeshTeacherTimeTest(){
//        String Teacher = "Teacher";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("HTurl"));
//        System.out.println("HimachalPradesh Teacher Landing page Microsite");
//        MPLT.pageBanner(Teacher);
//    }
//    @Test(priority = 15)
//    public void uttarPradeshStudentTimeTest(){
//        String Student = "Student";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("UTSurl"));
//        System.out.println("uttarPradesh Student Landing Page Microsite");
//        MPLT.pageBanner(Student);
//    }
//    @Test(priority = 16)
//    public void uttarPradeshTeacherTimeTest(){
//        String Teacher = "Teacher";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("UTTurl"));
//        System.out.println("uttarPrades Teacher Landing Page Microsite");
//        MPLT.pageBanner(Teacher);
//    }
//    @Test(priority = 17)
//    public void haryanaStudentTimeTest(){
//        String Student = "Student";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("HARSurl"));
//        System.out.println("Haryana Student Landing Page Microsite");
//        MPLT.pageBanner(Student);
//    }
//    @Test(priority = 18)
//    public void haryanaTeacherTimeTest(){
//        String Teacher = "Teacher";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("HARTurl"));
//        System.out.println("Haryana Teacher Landing Page Microsite");
//        MPLT.pageBanner(Teacher);
//    }
//    @Test(priority = 19)
//    public void punjabStudentTimeTest(){
//        String Student = "Student";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("PSurl"));
//        System.out.println("Punjab Student Landing Page Microsite");
//        MPLT.pageBanner(Student);
//    }
//    @Test(priority = 20)
//    public void punjabTeacherTimeTest(){
//        String Teacher = "Teacher";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("PTurl"));
//        System.out.println("Punjab Teacher Landing Page Microsite");
//        MPLT.pageBanner(Teacher);
//    }
//    @Test(priority = 21)
//    public void karnatakaStudentTimeTest(){
//        String Student = "Student";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("KSurl"));
//        System.out.println("Karnataka Student Landing Page Microsite");
//        MPLT.pageBanner(Student);
//    }
//    @Test(priority = 22)
//    public void karnatakaTeacherTimeTest(){
//        String Teacher = "Teacher";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("KTurl"));
//        System.out.println("Karnataka Teacher Landing Page Microsite");
//        MPLT.pageBanner(Teacher);
//    }
//    @Test(priority = 23)
//    public void rajasthanStudentTimeTest(){
//        String Student = "Student";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("RSurl"));
//        System.out.println("Rajasthan Student Landing Page Microsite");
//        MPLT.pageBanner(Student);
//    }
//    @Test(priority = 24)
//    public void rajasthanTeacherTimeTest(){
//        String Teacher = "Teacher";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("RTurl"));
//        System.out.println("Rajasthan Teacher Landing Page Microsite");
//        MPLT.pageBanner(Teacher);
//    }
//
//
//    @Test(priority = 25)
//    public void jharkhandStudentTimeTest(){
//        String Student = "Student";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("JHSurl"));
//        System.out.println("Jharkhand Student Landing Page Microsite");
//        MPLT.pageBanner(Student);
//    }
//    @Test(priority = 26)
//    public void jharkhandTeacherTimeTest(){
//        String Teacher = "Teacher";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("JHTurl"));
//        System.out.println("Jharkhand Teacher Landing Page Microsite");
//        MPLT.pageBanner(Teacher);
//    }
//    @Test(priority = 27)
//    public void meghalayaStudentTimeTest(){
//        String Student = "Student";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("MESurl"));
//        System.out.println("Meghalaya Student Landing Page Microsite");
//        MPLT.pageBanner(Student);
//    }
//    @Test(priority = 28)
//    public void meghalayaTeacherTimeTest(){
//        String Teacher = "Teacher";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("METurl"));
//        System.out.println("Meghalaya Teacher Landing Page Microsite");
//        MPLT.pageBanner(Teacher);
//    }
//    @Test(priority = 29)
//    public void tamilnaduStudentTimeTest(){
//        String Student = "Student";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("TSurl"));
//        System.out.println("Tamilnadu Student Landing Page Microsite");
//        MPLT.pageBanner(Student);
//    }
//    @Test(priority = 30)
//    public void tamilnaduTeacherTimeTest(){
//        String Teacher = "Teacher";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("TTurl"));
//        System.out.println("Tamilnadu Teacher Landing Page Microsite");
//        MPLT.pageBanner(Teacher);
//    }
//    @Test(priority = 31)
//    public void oddisaStudentTimeTest(){
//        String Student = "Student";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("OSurl"));
//        System.out.println("Oddisa Student Landing Page Microsite");
//        MPLT.pageBanner(Student);
//    }
//    @Test(priority = 32)
//    public void oddisaTeacherTimeTest(){
//        String Teacher = "Teacher";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("OTurl"));
//        System.out.println("Oddisa Teacher Landing Page Microsite");
//        MPLT.pageBanner(Teacher);
//    }
//    @Test(priority = 33)
//    public void ladakhStudentTimeTest(){
//        String Student = "Student";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("LSurl"));
//        System.out.println("Ladakh Student Landing Page Microsite");
//        MPLT.pageBanner(Student);
//    }
//    @Test(priority = 34)
//    public void ladakhTeacherTimeTest(){
//        String Teacher = "Teacher";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("LTurl"));
//        System.out.println("Ladakh Teacher Landing Page Microsite");
//        MPLT.pageBanner(Teacher);
//    }
//    @Test(priority = 35)
//    public void telanganaStudentTimeTest(){
//        String Student = "Student";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("TESurl"));
//        System.out.println("Telangana Student Landing Page Microsite");
//        MPLT.pageBanner(Student);
//    }
//    @Test(priority = 36)
//    public void telanganaTeacherTimeTest(){
//        String Teacher = "Teacher";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("TETurl"));
//        System.out.println("Telangana Teacher Landing Page Microsite");
//        MPLT.pageBanner(Teacher);
//    }
//    @Test(priority = 37)
//    public void sikkimStudentTimeTest(){
//        String Student = "Student";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("SKSurl"));
//        System.out.println("Sikkim Student Landing Page Microsite");
//        MPLT.pageBanner(Student);
//    }
//    @Test(priority = 38)
//    public void sikkimTeacherTimeTest(){
//        String Teacher = "Teacher";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("SKTurl"));
//        System.out.println("Sikkim Teacher Landing Page Microsite");
//        MPLT.pageBanner(Teacher);
//    }
//    @Test(priority = 39)
//    public void chhattisgarhStudentTimeTest(){
//        String Student = "Student";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("CHSurl"));
//        System.out.println("Chhattisgarh Student Landing Page Microsite");
//        MPLT.pageBanner(Student);
//    }
//    @Test(priority = 40)
//    public void chhattisgarhTeacherTimeTest(){
//        String Teacher = "Teacher";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("CHTurl"));
//        System.out.println("Chhattisgarh Teacher Landing Page Microsite");
//        MPLT.pageBanner(Teacher);
//    }
//
//    @Test(priority = 41)
//    public void andhrapradeshStudentTimeTest(){
//        String Student = "Student";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("ANSurl"));
//        System.out.println("Andhra Pradesh Student Landing Page Microsite");
//        MPLT.pageBanner(Student);
//    }
//
//    @Test(priority = 42)
//    public void andhrapradeshTeacherTimeTest(){
//        String Teacher = "Teacher";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("ANTurl"));
//        System.out.println("Andhra Pradesh Teacher Landing Page Microsite");
//        MPLT.pageBanner(Teacher);
//    }
//    @Test(priority = 43)
//    public void arunachalpradeshStudentTimeTest(){
//        String Student = "Student";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("ARSurl"));
//        System.out.println("Arunachal Pradesh Student Landing Page Microsite");
//        MPLT.pageBanner(Student);
//    }
//    @Test(priority = 44)
//    public void arunachalpradeshTeacherTimeTest(){
//        String Teacher = "Teacher";
//        MPLT.intiallTime();
//        driver.get(prop.getProperty("ARTurl"));
//        System.out.println("Arunachal Pradesh Teacher Landing Page Microsite");
//        MPLT.pageBanner(Teacher);
//    }


    @Test(priority = 45)
    public void westBengalStudentTimeTest(){
        String Student = "Student";
        MPLT.intiallTime();
        driver.get(prop.getProperty("WSurl"));
        System.out.println("West Bengal Student Landing Page Microsite");
        MPLT.pageBanner(Student);
    }

    @Test(priority = 46)
    public void westBengalTeacherTimeTest(){
        String Teacher = "Teacher";
        MPLT.intiallTime();
        driver.get(prop.getProperty("WTurl"));
        System.out.println("West Bengal Teacher Landing Page Microsite");
        MPLT.pageBanner(Teacher);
    }
    @Test(priority = 47)
    public void delhiStudentTimeTest(){
        String Student = "Student";
        MPLT.intiallTime();
        driver.get(prop.getProperty("DSurl"));
        System.out.println("Delhi Student Landing Page Microsite");
        MPLT.pageBanner(Student);
    }

    @Test(priority = 48)
    public void delhiTeacherTimeTest(){
        String Teacher = "Teacher";
        MPLT.intiallTime();
        driver.get(prop.getProperty("DTurl"));
        System.out.println("Delhi Teacher Landing Page Microsite");
        MPLT.pageBanner(Teacher);
    }
    @Test(priority = 49)
    public void maharashtraStudentTimeTest(){
        String Student = "Student";
        MPLT.intiallTime();
        driver.get(prop.getProperty("MHSurl"));
        System.out.println("Maharashtra Student Landing Page Microsite");
        MPLT.pageBanner(Student);
    }

    @Test(priority = 50)
    public void maharashtraTeacherTimeTest(){
        String Teacher = "Teacher";
        MPLT.intiallTime();
        driver.get(prop.getProperty("MHTurl"));
        System.out.println("Maharashtra Teacher Landing Page Microsite");
        MPLT.pageBanner(Teacher);
    }

    @Test(priority = 51)
    public void jammuKhasmirStudentTimeTest(){
        String Student = "Student";
        MPLT.intiallTime();
        driver.get(prop.getProperty("JKSurl"));
        System.out.println("Jammu Khasmir Student Landing Page Microsite");
        MPLT.pageBanner(Student);
    }

    @Test(priority = 52)
    public void jammuKhasmirTeacherTimeTest(){
        String Teacher = "Teacher";
        MPLT.intiallTime();
        driver.get(prop.getProperty("JKTurl"));
        System.out.println("Jammu Khasmir Teacher Landing Page Microsite");
        MPLT.pageBanner(Teacher);
    }
    @Test(priority = 53)
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
