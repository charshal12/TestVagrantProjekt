package com.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

    public static Properties config = new Properties();
    public static Properties OR = new Properties();
    public static FileInputStream fis;
    public static final String BROWSER = "browser";
    public static final String USER_DIR = "user.dir";
    public static final String configPath = "\\src\\test\\resources\\properties\\config.properties";
    public static String orPath = "\\src\\test\\resources\\properties\\or.properties";
    public static WebDriver driver;


    @BeforeTest
    public void setUp() throws IOException {
        /*Mapping and loading data from property files*/
        if (driver == null) {
            fis = new FileInputStream(System.getProperty(USER_DIR) + configPath);
            config.load(fis);

            fis = new FileInputStream(System.getProperty(USER_DIR) + orPath);
            OR.load(fis);
        }

        /*Setting up browser configuration*/
        if (config.getProperty(BROWSER).equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else if (config.getProperty(BROWSER).equals("chrome")) {
           // System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
        }
    }

    @AfterSuite
    public void teardown(){
        driver.quit();
    }


}
