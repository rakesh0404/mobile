package test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", dryRun = false,tags = "@demo",plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber.json"})
public class RunCukesTest {
}
