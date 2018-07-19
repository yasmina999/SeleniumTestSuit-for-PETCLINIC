package com.acceptancetests.petclinic.steps;

import com.acceptancetests.petclinic.pages.HomePage;
import com.google.inject.Inject;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CommonStepDef {
    @Inject
    private WebDriver webDriver;
    private HomePage homePage;
    private WebElement element;
    private static final String ERROR = "Error";

    @Given("^I am on page homePage$")
    public void iAmOnPageHomePage() {
        //webDriver.manage().deleteAllCookies();
        homePage = new HomePage(webDriver);
        homePage.openURL();
    }


    @Given("^I click on link (.*)$")
    public void iClickOnLink(String link) throws Throwable {
        try {

            homePage = new HomePage(webDriver);
            homePage.clickOnLink(link.trim());
        } catch (Exception e) {
            throw new PendingException();
        }

    }
}

