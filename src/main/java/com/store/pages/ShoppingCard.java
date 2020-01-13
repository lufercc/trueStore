package com.store.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class ShoppingCard extends AbstractPage {

    private final static String ITEM_INTO_CARD = "//p[@class='product-name' and .=\"%s\"]" ;
    private final static String ITEM_AVAILABILITY = "//p[@class='product-name' and .=\"%s\"]/ancestor::td/following-sibling::td[@class=\"cart_avail\"]/child::span[@class=\"label label-success\"]";

    public boolean itemIsDisplayed(String itemName) {
        return action.isDisplayed(By.xpath(String.format(ITEM_INTO_CARD, itemName)));
    }

    public String getAvailabilityStatus( String itemName) {
        String locator = String.format(ITEM_AVAILABILITY, itemName);
        return action.getText(By.xpath(locator));

    }
}
