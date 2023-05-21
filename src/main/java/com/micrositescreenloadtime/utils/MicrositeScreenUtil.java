package com.micrositescreenloadtime.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static com.micrositescreenloadtime.testbase.MicrositeScreenBase.driver;

public class MicrositeScreenUtil {
    public static long PAGE_LOAD_TIMEOUT = 60;
    public static long IMPLICIT_WAIT = 60;

    public static void takeScreenshotAtEndOfTest() throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String currentDir = System.getProperty("/Users/pratikshatake/Documents/MicrositeScreensLoadingTime/null/screenshots/google.png");
        FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
    }
}
