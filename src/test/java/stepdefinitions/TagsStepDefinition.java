package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.SQLOutput;

public class TagsStepDefinition {
    @Given("Smoke test için hazılrıkla yapıldı")
    public void smokeTestIçinHazılrıklaYapıldı() {
    }

    @When("smoke test çalıştığında")
    public void smokeTestÇalıştığında() {
        System.out.println("Smoke test çalıştığında");
    }

    @Then("Smoke test başarılı olmalı")
    public void smokeTestBaşarılıOlmalı() {
    }

    @Given("Regression test için hazılrıkla yapıldı")
    public void regressionTestIçinHazılrıklaYapıldı() {
    }

    @When("Regression test çalıştığında")
    public void regressionTestÇalıştığında() {
        System.out.println("Regression test çalıştığında");

    }

    @Then("Regression test başarılı olmalı")
    public void regressionTestBaşarılıOlmalı() {
    }
}
