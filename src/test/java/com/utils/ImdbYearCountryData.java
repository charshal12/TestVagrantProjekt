package com.utils;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*Fetching data from IMDB website*/
public class ImdbYearCountryData extends TestBase {

    public static final String IMDB_URL = "imdbUrl";
    public static final String IMDB_RELEASE_DATE_ELEMENT = "imdbReleaseDateElement";

    public static void loadWebPage(){
        driver.get(config.getProperty(IMDB_URL));
        driver.manage().window().maximize();
    }

    public String getImdbYearRcbInfo(){
        loadWebPage();

        WebElement imdb_release_date = driver.findElement(By.xpath(OR.getProperty(IMDB_RELEASE_DATE_ELEMENT)));
        String strImdbYear = imdb_release_date.getText();
        StringBuilder imdbStrYearCountry = new StringBuilder(strImdbYear);
        String imdbYear=imdbStrYearCountry.substring(10,14);

        return imdbYear;

    }

    public String getImdbCountryRcbInfo(){
        loadWebPage();

        WebElement imdb_release_date = driver.findElement(By.xpath(OR.getProperty(IMDB_RELEASE_DATE_ELEMENT)));
        String strImdbYear = imdb_release_date.getText();
        StringBuilder imdbStrYearCountry = new StringBuilder(strImdbYear);
        String imdbCountry = imdbStrYearCountry.substring(16,21);

        return imdbCountry;
    }
}
