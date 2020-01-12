package com.store.steps;

import com.store.pages.BottomMenu;
import com.store.pages.Singin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDefinition {
    private Singin singin;
    private BottomMenu bottomMenu;

    public StepsDefinition(Singin singin, BottomMenu bottomMenu){
        this.singin = singin;
        this.bottomMenu = bottomMenu;
    }

    @Given("Open Automation Practice page")
    public void openAutomationPracticePage() {
        singin.openPage();
    }

    @When("I click on {string} option in bottom menu")
    public void iClickOnOptionInBottomMenu(String linkName) {
        bottomMenu.goLink(linkName);
    }

    @Then("I expect the {string} has {string} as discount")
    public void iExpectTheHasAsDiscount(String arg0, String arg1) {
    }
}
