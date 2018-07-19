package com.acceptancetests.petclinic.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = SnippetType.CAMELCASE,
        features = "src/test/resources/features"
        ,glue={"com.acceptancetests.petclinic.steps,com.acceptancetests.petclinic.hooks"}
        ,plugin = {"pretty","json:target/cucumber.json"}
        ,tags = {"@wip","~@deferred"}
        ,monochrome = true
        ,strict = true
)
public class WipRunnerTest {
}
