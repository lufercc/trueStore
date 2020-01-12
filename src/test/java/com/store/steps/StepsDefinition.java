package com.store.steps;

import com.store.pages.Singin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDefinition {
    private Singin singin;

    public StepsDefinition(Singin singin){
        this.singin = singin;
    }

    @Given("Open Automation Practice page")
    public void openAutomationPracticePage() {
        singin.openPage();
    }

    @When("I click on {string} option in bottom menu")
    public void iClickOnOptionInBottomMenu(String arg0) {
    }

    @Then("I expect the {string} has {string} as discount")
    public void iExpectTheHasAsDiscount(String arg0, String arg1) {
    }
}
