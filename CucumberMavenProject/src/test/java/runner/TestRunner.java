package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"./FeatureFile/customer1.feature"},
		glue = {"stepDefinitionPackage"}
		)
public class TestRunner {
	

}
