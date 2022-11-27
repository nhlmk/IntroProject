package com.introProject.stepDefinitions;


import com.introProject.Pages.BasePage;

import com.introProject.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegistrationStepDefinitions {

    BasePage basePage = new BasePage();

    @Given("User give on the home page of the application")
    public void userGiveOnTheHomePageOfTheApplication() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon.com"));
    }

    @When("User clicks the sign-In button")
    public void userClicksTheSignInButton() {
        basePage.SignInButton.click();
    }

    @Then("User should be able to see the new page")
    public void userShouldBeAbleToSeeTheNewPage() throws InterruptedException {

        Thread.sleep(1000);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Sign-In"));

    }
}
