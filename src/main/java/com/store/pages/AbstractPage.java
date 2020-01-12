package com.store.pages;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractPage {
    static WebDriver driver;

    public AbstractPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
}
