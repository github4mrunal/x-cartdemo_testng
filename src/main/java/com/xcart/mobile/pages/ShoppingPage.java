package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ShoppingPage extends Utility {
    HotDealsPage hotDealsPage = new HotDealsPage();
    By hoverToHotDeals = By.xpath( "//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/span" );
    By clickOnSales = By.xpath( "//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/ul/li[1]/a/span" );
    By verifySalestext = By.xpath( "//h1[@id='page-title']" );
    By hoverToSortBy = By.xpath( "//span[@class='sort-by-label']" );
    By clickOnAToZ = By.xpath( "//*[@id=\"XLite-Module-CDev-Sale-View-SalePage-sortby-1\"]/li[5]/a" );
    By clickOnProduct = By.xpath( "//img[@alt='Avengers: Fabrikations Plush [Related Products]']" );
    By selectProducttype = By.xpath( "//*[@id=\"content\"]/div/div/div[2]/div[4]/div[3]/ul/li[2]/label/div/input[2]" );
    By clickOnAddToCart = By.xpath( "//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]/form[2]/div[2]/div[1]/div[3]/button[1]" );
    By verifyGreenBarText = By.xpath( "//li[text()='Product has been added to your cart']" );
    By clickOnClose = By.xpath( "//a[@class='close']" );
    By clickOnYourCart = By.xpath( "//div[@class='lc-minicart lc-minicart-horizontal collapsed recently-updated']" );
    By clickOnViewCart = By.xpath( "//a[@class='regular-button cart']" );
    By yourShoppingCartText = By.id( "page-title" );
    By clearQuantity = By.id( "amount16" );
    By clickOnQuantity = By.id( "amount16" );
    By addQuantity = By.id( "amount16" );
    By quantityIs2 = By.xpath( "//h1[text()='Your shopping cart - 2 items']" );
    By subtotal = By.xpath( "//span[@class='cart-subtotal']/parent::li/ancestor::ul" );
    By total = By.xpath( "//li[@class='total']" );
    By clickcheckOut = By.xpath( "//span[text()='Go to checkout']" );
    By loginPageText = By.xpath( "//h3[text()='Log in to your account']" );
    By emailField = By.id( "email" );
    By clickContinue = By.xpath( "//button[@class='btn  regular-button anonymous-continue-button submit']" );
    By secureText = By.xpath( "//h1[@class='title']" );
    By firstNameField = By.id( "shippingaddress-firstname" );
    By lastNameField = By.id( "shippingaddress-lastname" );
    By addressField = By.id( "shippingaddress-street" );
    By city = By.id( "shippingaddress-city" );
    By dropDownValueForCountry = By.id( "shippingaddress-country-code" );
    By stateValue = By.id( "shippingaddress-custom-state" );
    By postCodeValue = By.id( "shippingaddress-zipcode" );
    By checkBox = By.id( "create_profile" );
    By passwordvalue = By.id( "password" );
    By shippingmethod = By.id( "method128" );
    By paymentMethod = By.id( "pmethod6" );
    By totalText = By.xpath("//div[@class='total clearfix']");
    By placeOrderButton = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/button[1]");
    By thankyouText = By.xpath("//h1[text()='Thank you for your order']");
    By mousehoverOnAtoz=By.xpath("//span[@class='sort-by-label']");
    By goToProduct = By.xpath("//img[@alt='Vinyl Idolz: Ghostbusters']");
    By clickOnAddCartBtn = By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-13']");
    By addToCartText = By.xpath("//li[text()='Product has been added to your cart']");
    By clickOnSign = By.xpath("//a[@class='close']");
    By clickOnYourcart2 = By.xpath("//div[@class='lc-minicart lc-minicart-horizontal collapsed recently-updated']");
    By clickOnViewcart2 = By.xpath("//a[@class='regular-button cart']");
    By textForAddcart2 = By.id("page-title");
    By emptyCart = By.xpath("//a[text()='Empty your cart']");
    By emptyCartGreenBar = By.xpath("//li[text()='Item(s) deleted from your cart']");
    By yourCartIsEmptyText = By.xpath("//h1[text()='Your cart is empty']");




    public void mouseHoverToHotDealsAndClickOnSales() {
        Reporter.log( "mouse Hover To hotdeals and click on sales" + hoverToHotDeals.toString() + clickOnSales.toString() );
        hoverToElement( hoverToHotDeals );
        clickOnElement( clickOnSales );

    }

    public String verifySalesTabText() {
        Reporter.log( "text on sales page" + verifySalestext.toString() );
        return getTextFromElement( verifySalestext );
    }

    public void mouseHoverToSortByAndSelectAToZ() {
        Reporter.log( "hover to sort by and select a to z" + hoverToSortBy.toString() + clickOnAToZ.toString() );
        hoverToElement( hoverToSortBy );
        clickOnElement( clickOnAToZ );
    }

    public void clickOnProductToSelect() {
        Reporter.log( "clicking On Product to select " + clickOnProduct.toString() );
        hoverToElement( clickOnProduct );
        clickOnElement( clickOnProduct );
    }

    public void selectProductTypeToConfirm() {
        Reporter.log( "clicking On Product to select product type " + selectProducttype.toString() );
        clickOnElement( selectProducttype );
    }

    public void clickOnAddToCartOfproduct() {
        Reporter.log( "clicking On add to cart button" + clickOnAddToCart.toString() );
        clickOnElement( clickOnAddToCart );

    }

    public String verifyTextFromGreenbar() {
        Reporter.log( "Verifying Text From Green Bar " + verifyGreenBarText.toString() );
        return getTextFromElement( verifyGreenBarText );

    }

    public void clickToCloseBar() {
        Reporter.log( "click on close bar" + clickOnClose.toString() );
        clickOnElement( clickOnClose );
    }

    public void clickOnYourCartAndViewCart() {
        Reporter.log( "clicking on your cart and view cart " + clickOnYourCart.toString() + clickOnViewCart.toString() );
        clickOnElement( clickOnYourCart );
        clickOnElement( clickOnViewCart );

    }

    public String verifyYourShoppingcarttext() {
        Reporter.log( "Verifying Quantity " + yourShoppingCartText.toString() );
        return getTextFromElement( yourShoppingCartText );
    }

    public void modifyQuantity() {
        driver.findElement( clearQuantity ).clear();
        driver.findElement( clickOnQuantity ).click();
        sendTextToElement( addQuantity, "2" );

    }

    public String verifyQuantityIsTwo() {
        Reporter.log( "Verifying Quantity after changing " + quantityIs2.toString() );
        return getTextFromElement( quantityIs2 );
    }

    public String verifySubTotal() {
        Reporter.log( "Verifying Subtotal " + subtotal.toString() );
        return getTextFromElement( subtotal );
    }

    public String verifyTotalFor() {
        Reporter.log( "Verifying total " + total.toString() );
        return getTextFromElement( total );
    }

    public void clickingOnCheckOut() {
        Reporter.log( "clicking On checkout" + clickcheckOut );
        clickOnElement( clickcheckOut );
    }

    public String verifyLoginPage() {
        Reporter.log( "Verifying login page text " + loginPageText.toString() );
        return getTextFromElement( loginPageText );
    }

    public void enterEmailId(String email) {
        Reporter.log( "Enter email id  " + email + "to email field" + emailField.toString() + "<br>" );
        sendTextToElement( emailField, email );
    }

    public void clickOnContinueButton() {
        Reporter.log( "Click on Continue button" + clickContinue.toString() + "<br>" );
        clickOnElement( clickContinue );

    }

    public String verifysecurePagetext() {
        Reporter.log( "Verifying secure page text " + secureText.toString() );
        return getTextFromElement( secureText );

    }

    public void enterFirstName(String firstName) {
        Reporter.log( "Enter first name  " + firstName + "to firstname field" + firstNameField.toString() + "<br>" );
        sendTextToElement( firstNameField, firstName );
    }

    public void enterlastName(String lastName) {
        Reporter.log( "Enter email id  " + lastName + "to lastname field" + lastNameField.toString() + "<br>" );
        sendTextToElement( lastNameField, lastName );
    }

    public void enterAddress(String address) {
        Reporter.log( "Enter email id  " + address + "to address field" + addressField.toString() + "<br>" );
        sendTextToElement( addressField, address );
    }

    public void clearCityAndAddvalue(String ciTy) {
        Reporter.log( "Enter email id  " + ciTy + "to city" + city.toString() + "<br>" );
        driver.findElement( city ).clear();
        sendTextToElement( city, ciTy );
    }

    public void selectdropDownvalueForCountry(String country) {
        Reporter.log( "Enter email id  " + "to country" + dropDownValueForCountry.toString() + "<br>" );
        selectByValueFromDropDown( (dropDownValueForCountry), country );
    }

    public void enterState(String state) {
        Reporter.log( "Enter state " + state + "to state field" + stateValue.toString() + "<br>" );
        sendTextToElement( stateValue, state );

    }

    public void clearPostcodeAndAddValue(String postCode) {
        Reporter.log( "Enter post code " + postCode + "to postcode" + postCodeValue.toString() + "<br>" );
        driver.findElement( postCodeValue ).clear();
        sendTextToElement( postCodeValue, postCode );

    }
    public void clickOnCheckBoxField(){
        Reporter.log( "click on checkbox" + checkBox.toString() );
        clickOnElement( checkBox );

    }
    public void enterPassword(String password) {
        Reporter.log( "Enter password  " + password+ "to password field" + passwordvalue.toString() + "<br>" );
        sendTextToElement( passwordvalue,password);
    }
    public void selectLocalDelieveryMethod(){
        Reporter.log( "click on delievery method" + shippingmethod.toString() );
        hoverToElement(shippingmethod);
        clickOnElement( shippingmethod);
    }
    public void selectPaymentMethod(){
        Reporter.log( "click on payment method" + paymentMethod.toString() );
        clickOnElement( paymentMethod);
    }
    public  String VerifyTotal(){
        Reporter.log( "Verifying total " +totalText .toString() );
        return getTextFromElement(totalText );

    }
    public void clickOnPlaceOrderButton(){
        Reporter.log( "clicking on place order button " +placeOrderButton.toString());
        clickOnElement( placeOrderButton );
    }
    public  String VerifyThankyouText(){
        Reporter.log( "Verifying Thank you text " +thankyouText .toString() );
        return getTextFromElement(thankyouText);

    }
    public void mouseHoverToHotdealsAndClickOnAToz(){
        Reporter.log( "clicking on A to Z" +hoverToSortBy.toString() +mousehoverOnAtoz.toString());
        hotDealsPage.mouseHoverToHotdealsAndClickOnBestSellers();
        hoverToElement( hoverToSortBy );
        clickOnElement( mousehoverOnAtoz );
    }
    public void goToproductAndclickonAddToCart(){
        Reporter.log( "clicking on add to cart" +goToProduct.toString() +clickOnAddCartBtn.toString());
        hoverToElement( goToProduct );
        clickOnElement( clickOnAddCartBtn );
    }
    public String AddToCartverify(){
        Reporter.log( "clicking on add to cart" +addToCartText.toString());
        return getTextFromElement( addToCartText );
    }
    public  void clickOnCloseSign(){
        Reporter.log( "click on close sign" +clickOnSign.toString());
        clickOnElement( clickOnSign );
    }
    public void clickcingOnyourcartButton(){
        Reporter.log( "click on your cart" +clickOnYourcart2.toString());
        clickOnElement( clickOnYourcart2 );
    }
    public void clickcingOnviewCartButton(){
        Reporter.log( "click on your cart" +clickOnViewcart2.toString());
        clickOnElement( clickOnViewcart2 );
    }
    public String verifyTextForAddedTocart(){
        Reporter.log( "verifying Add to cart text" +textForAddcart2.toString());
        return getTextFromElement( textForAddcart2 );
    }
    public  void emptyyourCart(){
        Reporter.log( "Empty your cart" +emptyCart.toString());
        clickOnElement( emptyCart);

    }
    public String verifyEmptyCartBar(){
        Reporter.log( "verifying empty cart green bar" +emptyCartGreenBar.toString());
        return getTextFromElement( emptyCartGreenBar);

    }
    public String verifyEmptyCartFinaltext(){
        Reporter.log( "verifying your cart is empty text" +yourCartIsEmptyText.toString());
        return getTextFromElement( yourCartIsEmptyText );

    }



}
