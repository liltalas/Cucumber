package com.automation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//resources//features",
        glue = "com.automation.steps",
//        tags = "@smoke",
        plugin = {"html:html-report/report.html", "json:target/cucumber.json"},
        dryRun = true // it will check whether all the step lines have a step definitions or not
)
public class TestRunner {
}
