package com.utils;

import com.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


/*Fetching data from Wikipedia*/
public class WikiYearCountryData extends TestBase {

    public static final String WIKI_ORIGIN_COUNTRY = "wikiOriginCountry";
    public static final String WIKI_RELEASE_YEAR_ELEMENT = "wikiReleaseYearElement";

    public static void loadWebPage(){

        driver.get(config.getProperty("wikiUrl"));
        driver.manage().window().maximize();
    }

    public String getWikiYearRcbInfo() {
        loadWebPage();
        WebElement wiki_release_year = driver.findElement(By.xpath(OR.getProperty(WIKI_RELEASE_YEAR_ELEMENT)));
        StringBuilder wikiYear = new StringBuilder(wiki_release_year.getText());
        String wikiYearStr = wikiYear.substring(0, 4);

        return wikiYearStr;
    }

    public String getWikiCountryRcbInfo() {
        loadWebPage();
        WebElement wiki_origin_country = driver.findElement(By.xpath(OR.getProperty(WIKI_ORIGIN_COUNTRY)));
        StringBuilder wikiCountry = new StringBuilder(wiki_origin_country.getText());
        String wikiCountryStr = wikiCountry.substring(22, 27);

        return wikiCountryStr;
    }
}