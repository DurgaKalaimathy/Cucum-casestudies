package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/skeleton/typematch.feature"},
		glue="skeleton",
		plugin="html:target/html-report"
)
public class RunCukesTest {
	
}