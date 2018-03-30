package runner;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"feature"},
		glue = {"stepDefinition"},
		tags ={"@Pass,@Fail"},
		format = {"pretty","html:target/cucumber", "json:target/cucumber.json"}
		)

public class RunTest {

}
