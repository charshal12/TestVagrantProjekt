package com.testcases;

import com.base.TestBase;
import com.utils.ImdbYearCountryData;
import com.utils.WikiYearCountryData;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TeamYearCountryTest extends TestBase {

    WikiYearCountryData objWiki = new WikiYearCountryData();
    ImdbYearCountryData objImdb=new ImdbYearCountryData();

    /*Asserting Wikipedia values with IMDB*/

    @Test
    public void verifyReleaseYearOfRCB(){
        Assert.assertEquals(objImdb.getImdbYearRcbInfo(),objWiki.getWikiYearRcbInfo());
    }

    @Test
    public void verifyOriginCountryOfRCB(){
        Assert.assertEquals(objWiki.getWikiCountryRcbInfo(),objImdb.getImdbCountryRcbInfo());

    }
}
