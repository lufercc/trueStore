package com.store.steps;

import com.store.pages.BottomMenu;
import com.store.pages.ShoppingCard;
import com.store.pages.Singin;
import com.store.pages.StorePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.testng.Assert.assertEquals;

public class StepsDefinition {
    private Singin singin;
    private BottomMenu bottomMenu;
    private StorePage store;
    private ShoppingCard shoppingCart;

    public StepsDefinition(Singin singin, BottomMenu bottomMenu, StorePage store, ShoppingCard shoppingCart) {
        this.singin = singin;
        this.bottomMenu = bottomMenu;
        this.store = store;
        this.shoppingCart = shoppingCart;
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
        assertEquals(percentageReduction, percentageExpect);
    }


    @And("I click on {string} button")
    public void iClickOnButton(String buttonName) {
        store.clickOn(buttonName);
    }

    @And("I hover {string} then add to the card")
    public void iHoverThenAddToTheCard(String itemName) {
        store.addToCardHover(itemName);
    }

    @And("I go to the Cart dropdown and select {string}")
    public void iGoToTheCartDropdownAndSelectCheckout(String buttonInShopping) {
        store.viewShoppingCard();
        store.clickOn(buttonInShopping);
    }

    @Then("I expect {string} is displayed in summary table and the availability is {string}")
    public void iExpectItemIsDisplayedInSummaryTableAndTheAvailabilityIsStatus(String itemName, String availavilityStatus) {
        assertEquals(true, shoppingCart.itemIsDisplayed(itemName));
        String status = shoppingCart.getAvailabilityStatus(itemName);
        assertEquals(availavilityStatus, status);
    }

    @And("I remove {string} from the summary table")
    public void iRemoveItemFromTheSummaryTable(String itemName) {
        shoppingCart.deleteItem(itemName);
    }

    @And("I expect {string} is no longer displayed in the summary table")
    public void iExpectIsNoLongerDisplayedInTheSummaryTable(String itemName) {
        assertEquals(shoppingCart.itemIsDisplayed(itemName), true);
    }

    @And("I expect the total amount to pay is {string}")
    public void iExpectTheTotalAmountToPayIs(String priceExpectedd) {
        assertEquals(shoppingCart.totalPrice(), priceExpectedd);
    }
}