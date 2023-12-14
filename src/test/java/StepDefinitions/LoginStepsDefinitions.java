package StepDefinitions;

import Model.LoginGmailModel;
import Question.QuestionUtil;
import Task.LoginGmailTask;
import Utilities.Leerdatos;
import Utilities.Url;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginStepsDefinitions {
    @Managed(driver = "chrome")
    private ChromeDriver driver;
    private final Actor actor = Actor.named("Usuario");
    Url url = new Url();


    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(driver));
    }

    @Given("Ingresamos a la pagina de gmail")
    public void ingresamos_a_la_pagina_de_gmail() {
        actor.wasAbleTo(Open.browserOn(url));

    }

    @When("Ingresamos usuario y contrasena")
    public void ingresamos_usuario_y_contrasena() {
        LoginGmailModel model = Leerdatos.datoslogin();
        actor.attemptsTo(LoginGmailTask.login(model)
        );
    }


    @Then("Validamos que se muestre el menu {string}")
    public void validamosQueSeMuestreElMenu(String arg0) {
        actor.attemptsTo(Ensure.that(QuestionUtil.General()).isEqualTo(arg0));
    }
}

