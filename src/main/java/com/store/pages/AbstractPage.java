package com.store.pages;


import com.store.core.WebDriverActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractPage {
    protected WebDriver driver;
    protected WebDriverActions actions;

    public AbstractPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
}
