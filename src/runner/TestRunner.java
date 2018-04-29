package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
//features map the feature file
//glue map the relevant step definition package
@Cucumber.Options(features="Features",glue={"stepDef"})
class TestRunner {

}
