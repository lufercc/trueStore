package com.store.pages;


import com.store.core.DriverHandle;
import com.store.core.WebDriverActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {
    protected WebDriver driver;
    protected WebDriverActions action;
    protected WebDriverWait wait;

    public AbstractPage() {
        driver = DriverHandle.getInstance().getDriver();
        wait = new WebDriverWait(driver, 30);
        action = new WebDriverActions(driver, wait);
        PageFactory.initElements(driver, this);
    }
}
