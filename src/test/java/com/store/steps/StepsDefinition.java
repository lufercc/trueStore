package com.store.steps;

import com.store.pages.BottomMenu;
import com.store.pages.Singin;
import com.store.pages.StorePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.testng.Assert.assertEquals;

public class StepsDefinition {
    private Singin singin;
    private BottomMenu bottomMenu;
    private StorePage store;

    public StepsDefinition(Singin singin, BottomMenu bottomMenu, StorePage store){
        this.singin = singin;
        this.bottomMenu = bottomMenu;
        this.store = store;
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
    public void iExpectTheHasAsDiscount(String itemName, String percentageExpect) {
        String percentageReduction = store.getPercentageReduction(itemName);
        assertEquals(percentageExpect, percentageReduction);
    }
}
