package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin = { "html:target/cucumber-html-report",
        "json:target/testresult/cucumber.json", "pretty:target/cucumber-pretty.txt",
         "junit:target/cucumber-results.xml" }, 
features = { "Features1" },
monochrome = true,
tags ={"@TC743960"},
glue= {"src/test/java/NewGlueCode/SampleGlue1"}

)
public class testrunner {
	
}