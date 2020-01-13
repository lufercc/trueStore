package com.store.pages;


import com.store.core.WebDriverActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {
    protected WebDriver driver;
    protected WebDriverActions action;
    protected WebDriverWait wait;

    public AbstractPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        wait = new WebDriverWait(driver, 30);
        action = new WebDriverActions(driver, wait);
        PageFactory.initElements(driver, this);
    }
}
