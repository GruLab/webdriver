package com.thoughtworks.selenium;

public class YahooHttpsTest extends SeleneseTestCase {
    public void setUp() throws Exception {
        super.setUp("http://login11.marketingsolutions.yahoo.com");
    }

    public void testYahoo() throws Exception {
        // this site has **two** HTTPS hosts (akamai and yahoo), so it's a good test of the new multi-domain keystore support we just added
        selenium.open("https://login11.marketingsolutions.yahoo.com/adui/signin/loadSignin.do?d=U2FsdGVkX1_evOPYuoCCKbeDENMTzoQ6O.oTzifl7TwsO8IqXh6duToE2tI2&p=11&s=21");
    }
}