package com.tcs.proyectoscreenplay.stepdefinitions;

import com.tcs.proyectoscreenplay.userinterfaces.LinioPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SelectProductStepDefinitions {

    LinioPage page;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Maria");
    }

    @Given("^the user is in the application (.*)$")
    public void theUserIsInTheApplicationHttpsWwwLinioComCo(String url) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn(page));
    }

    @Given("^the user enters the Home category and selects the Mattresses, Bed Bases and Pillows section$")
    public void theUserEntersTheHomeCategoryAndSelectsTheMattressesBedBasesAndPillowsSection() {
        OnStage.theActorInTheSpotlight().wasAbleTo();
    }

    @When("^the user selects the product (.*)$")
    public void theUserSelectsTheProductSuperMegaComboBlueQueenXSpringMarshall(String product) {

    }

    @When("^the user adds (.*)$")
    public void theUserAddsProductsToTheCart(String amount) {
    }

    @When("^the user clicks (.*)$")
    public void theUserClicks(String shoppingCart) {

    }

    @Then("^the user should check the order summary$")
    public void theUserShouldCheckTheOrderSummary() {

    }

    @When("^the user selects the shopping cart$")
    public void theUserSelectsTheShoppingCart() {

    }

    @Then("^the user removes the products from the shopping cart$")
    public void theUserRemovesTheProductsFromTheShoppingCart() {

    }

    @Then("^the user sees the message \"([^\"]*)\"$")
    public void theUserSeesTheMessage(String arg1) {

    }
}
