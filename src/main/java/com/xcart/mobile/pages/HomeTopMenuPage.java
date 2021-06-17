package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomeTopMenuPage extends Utility {
    By shippingTab = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[3]/a/span");
    By shippingTabText = By.xpath("//h1[text()='Shipping']");
    By newTab = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[4]/a/span");
    By newtabtext = By.xpath("//h1[text()='New arrivals']");
    By comingSoonTab = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[5]/a");
    By comingSoonTabText = By.xpath("//h1[text()='Coming soon']");
    By contactUsTab = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[6]/a");
    By contactusTabText = By.id("page-title");

    public void clickOnShippingTab(){
        Reporter.log("Clicking on Shipping link" + shippingTab.toString() + "<br>");
        clickOnElement(shippingTab);
    }
    public String verifyShippingTabtext(){
        Reporter.log("Verify Shipping text" +shippingTabText.toString() + "<br>");
        return getTextFromElement(shippingTabText);

    }
        public void clickOnNewTab() {
        Reporter.log("Clicking on new tab" + newTab.toString() + "<br>");
        clickOnElement(newTab);
    }
    public String verifyNewPageText(){
        Reporter.log("Verify New Tab text " + newtabtext.toString() + "<br>");
        return getTextFromElement(newtabtext);
    }

    public void clickOnComingSoon() {
        Reporter.log("Clicking on Coming Soon " + comingSoonTab + "<br>");
        clickOnElement(comingSoonTab);
    }
    public String verifyTextComingSoonText(){
        Reporter.log("Verify Coming soon text" + comingSoonTabText + "<br>");
        return getTextFromElement(comingSoonTabText);
    }

    public void clickOnContactUs(){
        Reporter.log("Clicking on Contact Us " +contactUsTab + "<br>");
        clickOnElement(contactUsTab);
    }

    public String verifyContactUsText(){
        Reporter.log("Verify Contact Us text" +contactusTabText +"<br>");
        return getTextFromElement(contactusTabText);
    }

}