package com.introProject.stepDefinitions;

import com.introProject.utilities.ConfigurationReader;
import com.introProject.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class Hooks {

    private static int id = 1;

    @Before
    public void setDriver() {
        Driver.getDriver().get(ConfigurationReader.getProperty("amazonHomePage"));
    }

    @After
    public void teardownScenario(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", (id++) + scenario.getName());
        }
        Driver.closeDriver();
    }

}
