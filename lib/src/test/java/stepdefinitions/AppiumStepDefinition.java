package stepdefinitions;

import java.io.IOException;

import Tasks.BuscarCanales;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.Hooks;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import uis.TwitchUis;

public class AppiumStepDefinition {
	
	@Before
	public void before() throws IOException {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("^I want to write a step with precondition$")
	public void iWantToWriteAStepWithPrecondition() {
		OnStage.theActorCalled("").can(BrowseTheWeb.with(Hooks.suNavegador().on()));
	    
	}

	@When("^I complete action$")
	public void iCompleteAction() {
		OnStage.theActorInTheSpotlight().attemptsTo(BuscarCanales.enTwitch());
	   
	}
	@Then("^I validate the outcomes$")
	public void iValidateTheOutcomes() {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(TwitchUis.BTN_IMAGEN), WebElementStateMatchers.isVisible()));
	   
	}

}
