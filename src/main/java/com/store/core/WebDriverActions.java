package com.store.core;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverActions {

    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    public WebDriverActions(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
        this.actions = new Actions(driver);
    }

    public void click(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
    }

    public String getText(By selector) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
        return driver.findElement(selector).getText();
    }

    public String getText(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }

    public void hover(By selector) {
        WebElement target = driver.findElement(selector);
        wait.until(ExpectedConditions.visibilityOf(target));
        actions.moveToElement(target).build().perform();
    }

    public void hover(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        actions.moveToElement(webElement).build().perform();
    }

    public boolean isDisplayed(By element) {
        try {
            driver.findElement(element);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
