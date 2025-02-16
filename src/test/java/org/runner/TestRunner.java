package org.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org/stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports","json:target/cucumber.json"},
        monochrome = true, //monochrome means generate report/or console is nice format/align format
        publish = true //publish the report on cloud
)
public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }


}
