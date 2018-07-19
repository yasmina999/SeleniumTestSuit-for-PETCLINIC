package com.acceptancetests.petclinic.hooks;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

import javax.inject.Inject;
import java.util.concurrent.TimeUnit;


public class Hooks {

    private final WebDriver driver;

    @Inject
    public Hooks(final WebDriver driver) {
        this.driver = driver;
    }

    @Before()
    public void prepareBrowser() {

        driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    @After()
   public void maximize() {
          driver.manage().timeouts().pageLoadTimeout(1000,TimeUnit.SECONDS);
   }

}
