package com.store.pages;

import org.openqa.selenium.By;

public class StorePage extends AbstractPage{

    public static final String PERCENTAGE_REDUCTION = "//a[@title='%s']/ancestor::h5/following-sibling::div[@class='content_price']/child::span[@class='price-percent-reduction']";

    public String getPercentageReduction(String dressName){
        return action.getText(By.xpath(String.format(PERCENTAGE_REDUCTION, dressName)));
    }
}
