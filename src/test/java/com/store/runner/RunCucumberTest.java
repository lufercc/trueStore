package com.store.runner;

import com.store.core.DriverHandle;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Class which runs all features.
 */
@CucumberOptions(
        features = "src/test/resources/dress_verification.feature",
        glue = {"com.store"},
        plugin = {"pretty"}
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {

    /**
     * this method execute before the tests.
     */
    @BeforeTest
    public void open() {
        //
    }

    /**
     * this method close the browser after the features finish.
     */
    @AfterTest
    public void close() {
        DriverHandle.getInstance().getDriver().quit();
    }
}
