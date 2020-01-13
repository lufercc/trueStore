package com.store.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class StorePage extends AbstractPage{

    @FindBy(css = "[title='Continue shopping']")
    private WebElement continueShoppingButton;

    private HashMap<String, WebElement> buttons = new HashMap<>();

    public static final String PERCENTAGE_REDUCTION = "//a[@title='%s']/ancestor::h5/following-sibling::div[@class='content_price']/child::span[@class='price-percent-reduction']";
    public static final String STORE_ITEM = "//a[@title='%s']/ancestor::div[@class='product-image-container']";
    public static final String ADD_TO_CARD = "//a[@title='%s']/ancestor::h5/following-sibling::div[@class='button-container']/child::a[@title='Add to cart']";

    public StorePage() {
         buttons.put("Continue shopping", continueShoppingButton);
    }

    public String getPercentageReduction(String dressName){
        return action.getText(By.xpath(String.format(PERCENTAGE_REDUCTION, dressName)));
    }

    public void addToCardHover(String itemName) {
        action.hover(By.xpath(String.format(STORE_ITEM, itemName)));
        action.click(By.xpath(String.format(ADD_TO_CARD, itemName)));
    }

    public void clickOn(String buttonName) {
        action.click(buttons.get(buttonName));
    }
}
