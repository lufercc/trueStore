package com.store.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverActions {

    private WebDriver driver;

    public WebDriverActions(WebDriver driver){
        this.driver = driver;
    }

    public void click(WebElement element){
        element.click();
    }
}
