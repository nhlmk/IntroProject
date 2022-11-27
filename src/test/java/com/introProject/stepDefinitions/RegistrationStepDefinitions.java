package com.introProject.stepDefinitions;

import com.introProject.pages.BasePage;
import com.introProject.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegistrationStepDefinitions {

    BasePage basePage = new BasePage();

    @Given("User is on the homepage of the application")
    public void userIsOnTheHomepageOfTheApplication() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon.com"));

    }

    @When("user clicks the registration button top right corner of the web page")
    public void userClicksTheRegistrationButtonTopRightCornerOfTheWebPage() {

        basePage.signInButtonTopRightCorner.click();

    }

    @Then("user should be able to see the new page")
    public void userShouldBeAbleToSeeTheNewPage() throws InterruptedException {

        Thread.sleep(1000);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Sign-In"));

    }
}
