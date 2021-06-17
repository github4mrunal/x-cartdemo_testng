package com.xcart.mobile.testsuite;

import com.xcart.mobile.pages.HomeTopMenuPage;
import com.xcart.mobile.pages.HotDealsPage;
import com.xcart.mobile.pages.ShoppingPage;
import com.xcart.mobile.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuite extends TestBase {
    HomeTopMenuPage hometopmenupage = new HomeTopMenuPage();
    HotDealsPage hotdealspage = new HotDealsPage();
    ShoppingPage shoppingPage = new ShoppingPage();
    SoftAssert softAssert = new SoftAssert();


    @Test(groups = {"sanity", "regression"})
    public void verifyClickAndVerifyTopMenuTabsSuccessfully() {
        hometopmenupage.clickOnShippingTab();
        String expectedText = "Shipping";
        String actualText = hometopmenupage.verifyShippingTabtext();
        Assert.assertEquals(expectedText, actualText);
        softAssert.assertTrue(true);
        hometopmenupage.clickOnNewTab();
        SoftAssert softAssert = new SoftAssert();
        String expectedNewTabText = "New arrivals";
        String actualNewTabText = hometopmenupage.verifyNewPageText();
        Assert.assertEquals( expectedNewTabText, actualNewTabText);
        softAssert.assertTrue(true);
        hometopmenupage.clickOnComingSoon();
        String expectedComingsoon = "Coming soon";
        String actualComingSoon = hometopmenupage.verifyTextComingSoonText();
        Assert.assertEquals( expectedComingsoon, actualComingSoon);
        softAssert.assertTrue(true);
        hometopmenupage.clickOnContactUs();
        String expectedContactUs = "Contact us";
        String actualContactUs = hometopmenupage.verifyContactUsText();
        Assert.assertEquals( expectedContactUs, actualContactUs);
        softAssert.assertTrue(true);
        softAssert.assertAll();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifySaleProductsArrangeInBySortByOptionsGivenAndVerify() throws InterruptedException {
        hotdealspage.mouseHooverOnHotDealsAndClickSalesTab();
        String saleText = "Sale";
        String actualSalesText = hotdealspage.verifySaleTabText();
        Assert.assertEquals(  saleText, actualSalesText );
        softAssert.assertTrue( true );
        hotdealspage.mouseHooverOnSortByAndClickAToZ();
        // verify products arranged in 'A to Z'
        Thread.sleep( 2000 );
        List<WebElement>productList = driver.findElements( By.xpath( "//ul[@class='products-grid grid-list']/li/div/div/a/following::h5/child::a[@class='fn url next-previous-assigned']" ) );

        List<String> productName = new ArrayList<>();

        for (WebElement products1 : productList){
            productName.add(products1.getText());
        }

        List<String> tempList1 = new ArrayList<>();
        tempList1.addAll(productName);

        Collections.sort(tempList1);
        System.out.println(productName);
        System.out.println(tempList1);
        softAssert.assertEquals( productName, tempList1);
        softAssert.assertTrue( true );
        Thread.sleep( 1000 );
        hotdealspage.mouseHoverToSortByAndSelectPriceLowToHigh();
        //verify products arranged in 'price Low to High'
        Thread.sleep( 2000 );
        List<WebElement> productListForPrice = driver.findElements( By.xpath( "//div[@class='product-price widget-fingerprint-product-price']/ul/li/child::span[@class='price product-price']" ) );

        List<String> productNameForPrice = new ArrayList<>();

        for (WebElement products2 : productListForPrice) {
            productNameForPrice.add( products2.getText() );
        }

        List<String> tempList2 = new ArrayList<>();
        tempList2.addAll( productNameForPrice );

        Collections.sort( tempList2);
        Collections.sort( productNameForPrice);

        System.out.println( productNameForPrice );
        System.out.println( tempList2 );
        softAssert.assertEquals(  productNameForPrice, tempList2 );
        softAssert.assertTrue( true );
        Thread.sleep( 3000 );
        hotdealspage.mouseHoverToSortByAndClickOnToRates();
        //verify products arranged by 'Rates' in Sales.
        Thread.sleep( 3000 );
        List<WebElement>productListForRates = driver.findElements( By.xpath( "//h5[@class='product-name']/child::a[@class='fn url next-previous-assigned']" ) );

        List<String> productNameForRates = new ArrayList<>();

        for (WebElement products3 : productListForRates){
            productNameForRates.add(products3.getText());
        }

        List<String> tempList3 = new ArrayList<>();
        tempList3.addAll(productNameForRates);

        Collections.sort(tempList3);
        Collections.sort(productNameForRates);

        System.out.println(productNameForRates);
        System.out.println(tempList3);
        softAssert.assertEquals(productNameForRates, tempList3);
        softAssert.assertTrue( true );
        softAssert.assertAll();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyBestsellersProductsArrangeInGivenOrder() throws InterruptedException {
        hotdealspage.mouseHoverToHotdealsAndClickOnBestSellers();
        String saleTextExp = "Bestsellers";
        String salesTextActl = getTextFromElement( By.xpath( "//h1[text()='Bestsellers']" ) );
        softAssert.assertEquals(  saleTextExp, salesTextActl );
        softAssert.assertTrue( true );
        hotdealspage.mouseHoverToSortByAndClickOnZToA();
        //verify products arranged in 'Z to A'
        List<WebElement> productListForReverse = driver.findElements( By.xpath( "//a[@class='fn url next-previous-assigned']" ) );

        List<String> productNamebyZToA = new ArrayList<>();

        for (WebElement products4 : productListForReverse) {
            productNamebyZToA.add( products4.getText() );
        }

        List<String> tempList4 = new ArrayList<>();
        tempList4.addAll( productNamebyZToA );

        Collections.sort( tempList4 ,Collections.reverseOrder());
        Collections.sort( productNamebyZToA,Collections.reverseOrder() );
        System.out.println( productNamebyZToA );
        System.out.println( tempList4 );
        softAssert.assertEquals(  productNamebyZToA, tempList4 );
        softAssert.assertTrue( true );
        Thread.sleep( 3000 );
        hotdealspage.mouseHoverToSortByAndClickOnPriceHighToLow();
        //verify products arranged in 'High to Low' in Bestsellers
        Thread.sleep( 3000 );
        List<WebElement> productListForHighTolow = driver.findElements( By.xpath( "//div[@class='product-price widget-fingerprint-product-price']/ul/li/child::span[@class='price product-price']" ) );
        List<String> productNameForPriceHighToLow = new ArrayList<>();
        Thread.sleep( 2000 );
        for (WebElement products5 : productListForHighTolow) {
            productNameForPriceHighToLow.add( products5.getText() );
        }

        List<String> tempList5 = new ArrayList<>();
        tempList5.addAll( productNameForPriceHighToLow );
        Thread.sleep( 3000 );
        Collections.sort( tempList5);
        Collections.sort( productNameForPriceHighToLow );

        System.out.println( productNameForPriceHighToLow );
        System.out.println( tempList5 );
        softAssert.assertEquals( productNameForPriceHighToLow, tempList5);
        softAssert.assertTrue( true );
        Thread.sleep( 1000 );
        hotdealspage.mouseHoverToSortByAndClickOnToRates();
        //verify Products Arranged by 'RATES' in Bestsellers.
        List<WebElement>productListForRates1 = driver.findElements( By.xpath( "//h5[@class='product-name']/child::a[@class='fn url next-previous-assigned']" ) );

        List<String> productNameForRates1 = new ArrayList<>();

        for (WebElement products6 : productListForRates1){
            productNameForRates1.add(products6.getText());
        }

        List<String> tempList6 = new ArrayList<>();
        tempList6.addAll(productNameForRates1);

        Collections.sort(tempList6);
        Collections.sort(productNameForRates1);

        System.out.println(productNameForRates1);
        System.out.println(tempList6);
        softAssert.assertEquals(productNameForRates1, tempList6);
        softAssert.assertTrue( true );
        softAssert.assertAll();
    }



    @Test(groups = {"smoke", "regression"})
    public void verifyThatUserShouldPlaceOrderSuccessfully() throws InterruptedException {
        shoppingPage.mouseHoverToHotDealsAndClickOnSales();
        String saleText = "Sale";
        String actualSalesText = shoppingPage.verifySalesTabText();
        Assert.assertEquals( saleText, actualSalesText);
        softAssert.assertTrue(true);
        shoppingPage.mouseHoverToSortByAndSelectAToZ();
        Thread.sleep(1000);
        shoppingPage.clickOnProductToSelect();
        shoppingPage.selectProductTypeToConfirm();
        shoppingPage.clickOnAddToCartOfproduct();
        String expectedCartText = "Product has been added to your cart";   //assert for add to cart
        String actualCartText = shoppingPage.verifyTextFromGreenbar();
        Assert.assertEquals( expectedCartText, actualCartText);
        softAssert.assertTrue(true);
        shoppingPage.clickToCloseBar();
        shoppingPage.clickOnYourCartAndViewCart();
        String shopCarttext = "Your shopping cart - 1 item";
        String realShopCart = shoppingPage.verifyYourShoppingcarttext();
        Assert.assertEquals( shopCarttext, realShopCart);
        softAssert.assertTrue(true);
        shoppingPage.modifyQuantity();
        String shoppingCartText = "Your shopping cart - 2 items";    //verify 2 items in cart
        String shoppingcartReal = shoppingPage.verifyQuantityIsTwo();
        softAssert.assertEquals(shoppingCartText, shoppingcartReal);
        softAssert.assertTrue(true);
        String subTotalText = "Subtotal: $59.98";                 //verify subtotal
        String subTotalTextReal = shoppingPage.verifySubTotal();
        softAssert.assertEquals(subTotalText, subTotalTextReal);
        softAssert.assertTrue(true);
        String totalText = "$66.53";                     //verify Total
        String totalTextActual = shoppingPage.verifyTotalFor();
        softAssert.assertEquals(totalText, totalTextActual);
        softAssert.assertTrue(true);
        shoppingPage.clickingOnCheckOut();
        String logText = "Log in to your account";                   //verify login account page
        String logTextReal = shoppingPage.verifyLoginPage();
        softAssert.assertEquals(logText, logTextReal);
        softAssert.assertTrue(true);
        shoppingPage.enterEmailId("test1233@gmail.com");  //email
        shoppingPage.clickOnContinueButton();              //click on checkout button
        String secureText = "Secure Checkout";                            //verify secure checkout text
        String secureTextReal = shoppingPage.verifysecurePagetext();
        softAssert.assertEquals(secureText, secureTextReal);
        softAssert.assertTrue(true);
        shoppingPage.enterFirstName("Prime");
        shoppingPage.enterlastName("Testing");
        shoppingPage.enterAddress("42,Learning Street");
        shoppingPage.clearCityAndAddvalue("London");
        shoppingPage.selectdropDownvalueForCountry("GB");
        shoppingPage.enterState("Watford");
        shoppingPage.clearPostcodeAndAddValue("WD24 4EF");
        Thread.sleep(1000);
        shoppingPage.clickOnCheckBoxField();
        shoppingPage.enterPassword("Password");
        //Thread.sleep(3000);
        shoppingPage.selectLocalDelieveryMethod();
        shoppingPage.selectPaymentMethod();
        String expectedTotal = "$66.53";                  //verify total
        String actualTotal = shoppingPage.VerifyTotal();
        softAssert.assertEquals(expectedTotal, actualTotal);
        softAssert.assertTrue(true);
        Thread.sleep(3000);
        shoppingPage.clickOnPlaceOrderButton();
        String thankyouText = "Thank you for your order";    //verifying thank you page
        String thankyouTextReal = shoppingPage.VerifyThankyouText();
        softAssert.assertEquals(thankyouText, thankyouTextReal);
        softAssert.assertTrue(true);
        softAssert.assertAll();
    }
    @Test(groups = {"smoke","regression"})
    public void  verifyThatUserShouldClearShoppingCartSuccessfully(){
        hotdealspage.mouseHoverToHotdealsAndClickOnBestSellers();
        String saleTextExp = "Bestsellers";
        String salesTextActl = getTextFromElement( By.xpath( "//h1[text()='Bestsellers']" ) );
        softAssert.assertEquals(  saleTextExp, salesTextActl );
        softAssert.assertTrue( true );
        shoppingPage.mouseHoverToHotdealsAndClickOnAToz();
        shoppingPage.goToproductAndclickonAddToCart();
        String expectedCartText = "Product has been added to your cart";   //assert for add to cart
        String actualCartText = shoppingPage.AddToCartverify();
        softAssert.assertEquals( expectedCartText, actualCartText);
        softAssert.assertTrue( true );
        shoppingPage.clickOnCloseSign();
        shoppingPage.clickcingOnyourcartButton();
        shoppingPage.clickcingOnviewCartButton();
        String shopCarttext = "Your shopping cart - 1 item";
        String realShopCart = shoppingPage.verifyTextForAddedTocart();
        softAssert.assertEquals( shopCarttext, realShopCart);
        softAssert.assertTrue( true );
        shoppingPage.emptyyourCart();
        String emptyCartText = "Are you sure you want to clear your cart?";
        String emptyCartTextActual = driver.switchTo().alert().getText();  //to get text from element that cant be inspected with right click.
        Assert.assertEquals( emptyCartText, emptyCartTextActual);
        driver.switchTo().alert().accept();               //to click 'ok' on alert window when no right click available to inspect
        String empryCartText = "Item(s) deleted from your cart";            //verifying empty cart green bar
        String emptyCartTextActualIs = shoppingPage.verifyEmptyCartBar();
        softAssert.assertEquals( empryCartText, emptyCartTextActualIs);
        softAssert.assertTrue( true );
        String lastEmptyCartMessage = "Your cart is empty";    //verifying your cart is empty text
        String actualLastEmptyCartMessage = shoppingPage.verifyEmptyCartFinaltext();
        softAssert.assertEquals( lastEmptyCartMessage, actualLastEmptyCartMessage);
        softAssert.assertTrue( true );
        softAssert.assertAll();


    }
}





