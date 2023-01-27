package stepdefinitions;


import io.cucumber.java.en.*;


public class FirstStepDefinition {
    @Given("Ilk feature icin cucumber indirdim")
    public void ilk_feature_icin_cucumber_indirdim() {

        System.out.println("given step çalıştı");
    }
    @When("Senaryomu çalistirdigimda")
    public void senaryomu_calistirdigimda() {

        System.out.println("When step çalıştı");

    }
    @Then("Senaryomun çalistigini konsolda gormeliyim")
    public void senaryomun_calistigini_konsolda_gormeliyim() {

        System.out.println("Then step çalıştı");

    }


}
