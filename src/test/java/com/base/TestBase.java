package com.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestBase {


    public static WebDriver driver;
    public static Properties config = new Properties();
    public static Properties OR = new Properties();
    public static FileInputStream fis;
    String websiteUrl;
    public static final String BROWSER = "browser";
    public static final String USER_DIR = "user.dir";
    public static final String configPath = "\\src\\test\\resources\\properties\\config.properties";
    public static String orPath = "\\src\\test\\resources\\properties\\or.properties";



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
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }


    }

    @AfterSuite
    public void teardown(){
        driver.quit();
    }


}
