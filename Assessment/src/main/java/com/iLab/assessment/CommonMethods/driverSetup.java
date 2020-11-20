package com.iLab.assessment.CommonMethods;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.Random;

public class driverSetup {

    public static WebDriver driver;
    public JavascriptExecutor jExecutor;
    public WebDriverWait driverWait;

    private static Logger log = Logger.getLogger(driverSetup.class);

    public WebDriver setupWebDriver(String browserName) {

        System.out.println("Browser name : " + browserName);

        if (browserName.equalsIgnoreCase("chrome")) {
            String chromeDriverPath = null;

            chromeDriverPath = "C:\\Users\\7390\\IdeaProjects\\Assessment\\Drivers\\" + "chromedriver.exe";


            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("useAutomationExtension", false);
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-extensions"); // disabling extensions
            options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
            //options.addArguments("--headless");
            options.addArguments("Zoom 50%");
            options.addArguments("start-maximized"); // open Browser in maximized mode
            options.addArguments("disable-infobars"); // disabling infobars
            driver = new ChromeDriver(options);

        } else if (browserName.equalsIgnoreCase("firefox")) {

            String firefoxDriverPath = null;
            log.info("Firefox ?: " + browserName);

            firefoxDriverPath = "C:\\Users\\7390\\IdeaProjects\\Assessment\\Drivers\\" + "geckodriver.exe";


            System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
            FirefoxOptions options = new FirefoxOptions();
            options.setProfile(new FirefoxProfile());
            options.addPreference("dom.webnotifications.enabled", false);
            options.addArguments("--disable-notifications");

            driver = new FirefoxDriver(options);

        } else if (browserName.equalsIgnoreCase("IE")) {

            String ieDriverPath = null;

            ieDriverPath = "C:\\Users\\7390\\IdeaProjects\\Assessment\\Drivers\\" + "IEDriverServer.exe";


            System.setProperty("webdriver.ie.driver", ieDriverPath);

            InternetExplorerOptions options = new InternetExplorerOptions();

            options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            options.setCapability("enablePersistentHover", false);
            options.setCapability("requireWindowFocus", true);


            driver = new InternetExplorerDriver(options);
        }

        try {
            jExecutor = (JavascriptExecutor) driver;
            driver.manage().window().maximize();
            driverWait = new WebDriverWait(driver, 5);
        } catch (Exception e) {
            log.info("The stack trace here happens when I try to maximize the screen");
            log.info(e.getStackTrace());
        }
        return driver;
    }


    public static void scrollToElement(WebElement element) {

        Coordinates cor = ((Locatable) element).getCoordinates();
        cor.inViewPort();
    }

    public static String generatePhone() {
        int num2;
        int num3;
        int set2;
        int set3;

        Random random = new Random();

        num2 = random.nextInt(8);
        num3 = random.nextInt(8);

        set2 = random.nextInt(999) + 100;

        set3 = random.nextInt(9999) + 1000;

        return "0" + num2 + num3 + " " + set2 + " " + set3;
    }


}
