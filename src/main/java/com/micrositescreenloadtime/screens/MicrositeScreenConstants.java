package com.micrositescreenloadtime.screens;

import com.micrositescreenloadtime.testbase.MicrositeScreenBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileNotFoundException;

public class MicrositeScreenConstants extends MicrositeScreenBase {
    public MicrositeScreenConstants() throws FileNotFoundException {
        super();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//img[@class='web persondesktop']")
    public static WebElement AllStudentBanner;
    @FindBy(xpath = "//img[@class='web persondesktop']")
    public static WebElement AllTeacherBanner;
}
