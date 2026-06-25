package UtilsPack;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class AllureReport {
    public static void allureClearResults(){
        try {
            File resultsFolder = new File("allure-results");
            File reportFolder = new File("allure-report");

            if(resultsFolder.exists()) {
                FileUtils.cleanDirectory(resultsFolder);
            }

            if(reportFolder.exists()) {
                FileUtils.cleanDirectory(reportFolder);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
