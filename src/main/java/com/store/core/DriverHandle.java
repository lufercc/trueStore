package com.store.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverHandle {
    static DriverHandle instance = new DriverHandle();
    private WebDriver driver;

    private DriverHandle(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static DriverHandle getInstance(){
        return instance;
    }
    public WebDriver getDriver() {
        return driver;
    }
}
