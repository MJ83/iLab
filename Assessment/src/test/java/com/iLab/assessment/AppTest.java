package com.iLab.assessment;
import static org.junit.Assert.assertTrue;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/web"},
        tags = {"@Apply"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/iLabReport.html"},
        monochrome = true
)
public class AppTest 
{

    @AfterClass
    public static void writeExtentReport() throws IOException {
        Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + "/extent-web-config.xml"));
        copyLatestExtentReport();
        Reporter.loadXMLConfig("extent-web-config.xml");
    }

    public static void copyLatestExtentReport() throws IOException {
        String timestamp = new SimpleDateFormat("yyyy:MM:dd_HH:mm:ss").format(Calendar.getInstance().getTime()).replaceAll(":", "-");
        File source = new File(System.getProperty("user.dir") + "/target/cucumber-reports/iLabQualityReport.html");
        File destination = new File(System.getProperty("user.dir") + "/target/cucumber-reports/iLabQualityReport_" + timestamp + ".html");

    }

    public static void copyFileUsingStream(File source, File destination) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(destination);
            byte[] buffer = new byte[1024];
            int length;

            while((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        }
        finally {
            inputStream.close();
            outputStream.close();
        }
    }

}
