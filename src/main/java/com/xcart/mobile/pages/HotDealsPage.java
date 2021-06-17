package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HotDealsPage extends Utility {
    By hotdeals = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/span");
    By sale = By.xpath( "//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/ul/li[1]/a/span" );
    By saleText = By.xpath("//h1[@id='page-title']");
    By sortBy = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]");
    By selectAToZ = By.xpath( "//*[@id=\"XLite-Module-CDev-Sale-View-SalePage-sortby-1\"]/li[5]/a" );
    By aToZText = By.xpath( "//ul[@class='products-grid grid-list']/li/div/div/a/following::h5/child::a[@class='fn url next-previous-assigned']" );
    By priceLowToHigh = By.xpath( "//*[@id=\"XLite-Module-CDev-Sale-View-SalePage-sortby-1\"]/li[3]/a");
    By getPriceLowToHighText = By.xpath( "//span[text()='Price Low - High']" );
   // By selectRates = By.xpath( "//*[@id=\"XLite-Module-CDev-Sale-View-SalePage-sortby-1\"]/li[7]/a" );
    By selectRates = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/a[1]");
    By ratesText = By.xpath( "//span[text()='Rates ']" );
    By clickOnBestSellers = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/ul/li[2]/a/span");
    By bestSellersPageText = By.xpath( "//h1[@id='page-title']" );
    By hoverToSortByOnBs = By.xpath( "//span[@class='sort-by-label']" );
    By selectZToA = By.xpath( "//*[@id=\"XLite-Module-CDev-Bestsellers-View-BestsellersPage-sortby-1\"]/li[5]/a" );
    By selectPriceHighToLow = By.xpath( "//*[@id=\"XLite-Module-CDev-Bestsellers-View-BestsellersPage-sortby-1\"]/li[3]/a" );
   // By selectByRates = By.xpath( "//span[text()='Rates']" );
 //   By selectByRates = By.xpath("\"//*[@id=\\\"XLite-Module-CDev-Bestsellers-View-BestsellersPage-sortby-1\\\"]/li[6]/a\"");
By selectByRates= By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/a[1]");
    public void mouseHooverOnHotDealsAndClickSalesTab() {
        Reporter.log("Hoover mouse on hot deals and click on Sales Tab" + hotdeals.toString() + sale.toString() + "<br>");
        hoverToElement(hotdeals);
        clickOnElement(sale);
    }
     public String verifySaleTabText() {
        Reporter.log("Verify Sale Tab Text" + saleText.toString() + "<br>");
        return getTextFromElement(saleText);
    }

    public void mouseHooverOnSortByAndClickAToZ() {
        Reporter.log("Hoover mouse on Sort By Tab and click on A-Z" + sortBy + "<br>");
        hoverToElement(sortBy);
        clickOnElement(selectAToZ);
    }
    public String verifyAToZProducts() {
        Reporter.log( "A To Z text"  +aToZText.toString() );
        return getTextFromElement( aToZText );
    }
    public void mouseHoverToSortByAndSelectPriceLowToHigh() {
        Reporter.log( "hover to sort by and select price low to high  " + sortBy.toString() + priceLowToHigh.toString() );
        hoverToElement(sortBy );
        clickOnElement(priceLowToHigh);
    }
    public String verifyLowToHighText() {
        Reporter.log("Verify Low To High Text From DropDown" + getPriceLowToHighText + "<br>");
        return getTextFromElement(getPriceLowToHighText);
    }

    public void hooverOnSortByAndSelectRatesTab(){
        Reporter.log("Click on Rates tab" + sortBy + selectRates+ "<br>");
        hoverToElement(sortBy);
        clickOnElement(selectRates);
    }
    public String verifyTextForRates() {
        Reporter.log( "text for rates" + ratesText.toString() );
        return getTextFromElement( ratesText );
    }

    public void mouseHoverToHotdealsAndClickOnBestSellers() {
        Reporter.log( "clicking on bestsellers" + hotdeals + clickOnBestSellers );
        hoverToElement( hotdeals );
        hoverToElement( clickOnBestSellers );
        clickOnElement( clickOnBestSellers );
    }

    public String verifyBestsellersPageText() {
        Reporter.log( "Bestseller page text" + bestSellersPageText.toString() );
        return getTextFromElement( bestSellersPageText );
    }

    public void mouseHoverToSortByAndClickOnZToA() {
        Reporter.log( "hover to sort by and clicking on Z to A" + hoverToSortByOnBs + selectZToA );
        hoverToElement( hoverToSortByOnBs );
        clickOnElement( selectZToA );
    }

    public void mouseHoverToSortByAndClickOnPriceHighToLow() {
        Reporter.log( "hover to sort by and clicking on Price high to low" + hoverToSortByOnBs + selectPriceHighToLow );
        hoverToElement( hoverToSortByOnBs );
        clickOnElement( selectPriceHighToLow );
    }

    public void mouseHoverToSortByAndClickOnToRates() {
        Reporter.log( "hover to sort by and clicking on Rates" + hoverToSortByOnBs + selectByRates );
        hoverToElement( hoverToSortByOnBs );
        clickOnElement( selectByRates );
    }

}